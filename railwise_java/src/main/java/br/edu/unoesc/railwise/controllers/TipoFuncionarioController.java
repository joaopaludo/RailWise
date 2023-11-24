package br.edu.unoesc.railwise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.TipoFuncionario;
import br.edu.unoesc.railwise.repositories.TipoFuncionarioRepository;

@RestController
@RequestMapping("/tipofuncionario")
public class TipoFuncionarioController {

    @Autowired
    private TipoFuncionarioRepository tipoFuncionarioRepository;

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<TipoFuncionario> getTipoFuncionario(@PathVariable("id") Long id) {
        TipoFuncionario tipoFuncionario = tipoFuncionarioRepository.findById(id).get();

        return ResponseEntity.ok(tipoFuncionario);
    }

    @GetMapping()
    public ResponseEntity<Iterable<TipoFuncionario>> getTipoFuncionarios() {
        Iterable<TipoFuncionario> listaTipoFuncionarios = tipoFuncionarioRepository.findAll();

        return ResponseEntity.ok(listaTipoFuncionarios);
    }

    @PostMapping(value = "cadastro")
    public ResponseEntity<TipoFuncionario> postTipoFuncionario(@RequestBody TipoFuncionario tipoFuncionario) {
        tipoFuncionarioRepository.save(tipoFuncionario);

        return ResponseEntity.ok(tipoFuncionario);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<TipoFuncionario> putTipoFuncionario(@PathVariable("id") Long id,
            @RequestBody TipoFuncionario tipoFuncionario) {
        tipoFuncionario.setId_tipofuncionario(id);

        tipoFuncionarioRepository.save(tipoFuncionario);

        return ResponseEntity.ok(tipoFuncionario);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteTipoFuncionario(@PathVariable("id") Long id) {
        tipoFuncionarioRepository.deleteById(id);

        return ResponseEntity.ok(true);
    }

}
