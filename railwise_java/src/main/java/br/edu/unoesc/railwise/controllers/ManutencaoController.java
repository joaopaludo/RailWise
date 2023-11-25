package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.railwise.entities.Manutencao;
import br.edu.unoesc.railwise.repositories.ManutencaoRepository;

@RestController
@RequestMapping("/manutencao")
public class ManutencaoController {

    @Autowired
    private ManutencaoRepository manutencaoRepository;

    @GetMapping
    public ResponseEntity<List<Manutencao>> findAll() {
        List<Manutencao> manutencao = manutencaoRepository.findAll();

        return ResponseEntity.ok(manutencao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manutencao> findById(@PathVariable Long id) {
    	Manutencao manutencao = manutencaoRepository.findById(id).get();

        return ResponseEntity.ok(manutencao);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Manutencao> save(@RequestBody Manutencao manutencao) {

    	manutencaoRepository.save(manutencao);

        return ResponseEntity.ok(manutencao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Manutencao> update(@PathVariable Long id, @RequestBody Manutencao manutencao) {
    	manutencao.setId_manutencao(id);

    	manutencaoRepository.save(manutencao);

        return ResponseEntity.ok(manutencao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        Manutencao manutencao = manutencaoRepository.findById(id).get();

        manutencaoRepository.delete(manutencao);

        return ResponseEntity.ok(true);
    }
}
