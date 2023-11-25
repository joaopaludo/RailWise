package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Locomotiva;
import br.edu.unoesc.railwise.repositories.LocomotivaRepository;

@RestController
@RequestMapping("/locomotiva")
public class LocomotivaContorller {

    @Autowired
    private LocomotivaRepository locomotivaRepository;

    @GetMapping
    public ResponseEntity<List<Locomotiva>> findAll() {
        List<Locomotiva> locomotiva = locomotivaRepository.findAll();

        return ResponseEntity.ok(locomotiva);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Locomotiva> findById(@PathVariable Long id) {
        Locomotiva locomotiva = locomotivaRepository.findById(id).get();

        return ResponseEntity.ok(locomotiva);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Locomotiva> save(@RequestBody Locomotiva locomotiva) {
        locomotivaRepository.save(locomotiva);

        return ResponseEntity.ok(locomotiva);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Locomotiva> update(@PathVariable Long id, @RequestBody Locomotiva locomotiva) {
        locomotiva.setId_locomotiva(id);
        locomotivaRepository.save(locomotiva);

        return ResponseEntity.ok(locomotiva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        Locomotiva locomotiva = locomotivaRepository.findById(id).get();

        locomotivaRepository.delete(locomotiva);

        return ResponseEntity.ok(true);
    }

}
