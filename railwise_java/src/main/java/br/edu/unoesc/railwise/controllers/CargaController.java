package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Carga;
import br.edu.unoesc.railwise.repositories.CargaRepository;

@RestController
@RequestMapping("/carga")
public class CargaController {

    @Autowired
    private CargaRepository cargaRepository;

    @GetMapping
    public ResponseEntity<List<Carga>> findAll() {
        List<Carga> carga = cargaRepository.findAll();

        return ResponseEntity.ok(carga);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carga> findById(@PathVariable Long id) {
        Carga carga = cargaRepository.findById(id).get();

        return ResponseEntity.ok(carga);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Carga> save(@RequestBody Carga carga) {
        cargaRepository.save(carga);

        return ResponseEntity.ok(carga);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carga> update(@PathVariable Long id, @RequestBody Carga carga) {
        carga.setId_carga(id);
        cargaRepository.save(carga);

        return ResponseEntity.ok(carga);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        Carga carga = cargaRepository.findById(id).get();

        cargaRepository.delete(carga);

        return ResponseEntity.ok(true);
    }

}
