package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Rota;
import br.edu.unoesc.railwise.repositories.RotaRepository;

@RestController
@RequestMapping("/rota")
public class RotaController {

    @Autowired
    private RotaRepository rotaRepository;

    @GetMapping
    public ResponseEntity<List<Rota>> findAll() {
        List<Rota> rota = rotaRepository.findAll();

        return ResponseEntity.ok(rota);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rota> findById(@PathVariable Long id) {
        Rota rota = rotaRepository.findById(id).get();

        return ResponseEntity.ok(rota);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Rota> save(@RequestBody Rota rota) {
        rotaRepository.save(rota);

        // Cria a rota de volta
        Rota rotaVolta = new Rota();

        rotaVolta.setEstacaoOrigem(rota.getEstacaoDestino());
        rotaVolta.setEstacaoDestino(rota.getEstacaoOrigem());
        rotaVolta.setVl_distancia(rota.getVl_distancia());

        rotaRepository.save(rotaVolta);

        return ResponseEntity.ok(rota);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rota> update(@PathVariable Long id, @RequestBody Rota rota) {
        rota.setId_rota(id);
        rotaRepository.save(rota);

        return ResponseEntity.ok(rota);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        Rota rota = rotaRepository.findById(id).get();

        // confirma a exclusão
        rotaRepository.deleteById(id);
        rotaRepository.deleteByEstacaoOrigemAndEstacaoDestino(rota.getEstacaoOrigem(), rota.getEstacaoDestino());

        return ResponseEntity.ok(true);
    }

}
