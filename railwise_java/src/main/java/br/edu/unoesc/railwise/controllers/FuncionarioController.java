package br.edu.unoesc.railwise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Funcionario;
import br.edu.unoesc.railwise.repositories.FuncionarioRepository;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(funcionarioRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable Long id) {
        Funcionario funcionario = funcionarioRepository.findById(id).get();

        return ResponseEntity.ok(funcionario);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Funcionario> save(@RequestBody Funcionario funcionario) {
        funcionarioRepository.save(funcionario);

        return ResponseEntity.ok(funcionario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> update(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        funcionario.setId_funcionario(id);
        funcionarioRepository.save(funcionario);

        return ResponseEntity.ok(funcionario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        funcionarioRepository.deleteById(id);

        return ResponseEntity.ok(true);
    }

}
