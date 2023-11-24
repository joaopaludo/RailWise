package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Estacao;
import br.edu.unoesc.railwise.repositories.EstacaoRepository;

@RestController
@RequestMapping("/estacao")
public class EstacaoController {

    @Autowired
    private EstacaoRepository estacaoRepository;

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<Estacao> getEstacao(@PathVariable("id") Long id) {
        Estacao estacao = estacaoRepository.findById(id).get();

        return ResponseEntity.ok(estacao);
    }

    @GetMapping()
    public ResponseEntity<List<Estacao>> getEstacoes() {
        List<Estacao> listaEstacoes = estacaoRepository.findAll();

        return ResponseEntity.ok(listaEstacoes);
    }

    @PostMapping(value = "cadastro")
    public ResponseEntity<Estacao> postEstacao(@RequestBody Estacao estacao) {
        estacaoRepository.save(estacao);

        return ResponseEntity.ok(estacao);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Estacao> putEstacao(@PathVariable("id") Long id, @RequestBody Estacao estacao) {
        estacao.setId_estacao(id);
        estacaoRepository.save(estacao);

        return ResponseEntity.ok(estacao);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteEstacao(@PathVariable("id") Long id) {
        estacaoRepository.deleteById(id);

        return ResponseEntity.ok(true);
    }
}
