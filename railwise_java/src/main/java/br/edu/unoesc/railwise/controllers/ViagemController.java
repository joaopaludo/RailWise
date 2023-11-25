package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Viagem;
import br.edu.unoesc.railwise.repositories.ViagemRepository;

@RestController
@RequestMapping("/viagem")
public class ViagemController {

    @Autowired
    private ViagemRepository viagemRepository;

    @GetMapping
    public ResponseEntity<List<Viagem>> findAll() {
        List<Viagem> viagem = viagemRepository.findAll();

        return ResponseEntity.ok(viagem);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Viagem> findById(@PathVariable Long id) {
        Viagem viagem = viagemRepository.findById(id).get();

        return ResponseEntity.ok(viagem);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Viagem> save(@RequestBody Viagem viagem) {

        viagem.getViagemVagao().forEach(viagemVagao -> {
            viagemVagao.setViagem(viagem);
        });

        viagem.getViagemRota().forEach(viagemRota -> {
            viagemRota.setViagem(viagem);
        });

        viagem.getFuncionarioViagem().forEach(funcionarioViagem -> {
            funcionarioViagem.setViagem(viagem);
        });

        viagemRepository.save(viagem);

        return ResponseEntity.ok(viagem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Viagem> update(@PathVariable Long id, @RequestBody Viagem viagem) {
        viagem.setId_viagem(id);

        if (viagem.getViagemVagao() != null) {
            viagem.getViagemVagao().forEach(viagemVagao -> {
                viagemVagao.setViagem(viagem);
            });
        }

        if (viagem.getViagemRota() != null) {
            viagem.getViagemRota().forEach(viagemRota -> {
                viagemRota.setViagem(viagem);
            });
        }

        if (viagem.getFuncionarioViagem() != null) {
            viagem.getFuncionarioViagem().forEach(funcionarioViagem -> {
                funcionarioViagem.setViagem(viagem);
            });
        }

        viagemRepository.save(viagem);

        return ResponseEntity.ok(viagem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        Viagem viagem = viagemRepository.findById(id).get();

        viagemRepository.delete(viagem);

        return ResponseEntity.ok(true);
    }

}
