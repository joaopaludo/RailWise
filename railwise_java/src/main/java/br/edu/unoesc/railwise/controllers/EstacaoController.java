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
        Estacao estacaoBanco = estacaoRepository.findById(id).get();

        estacaoBanco.setTx_nome(estacao.getTx_nome());
        estacaoBanco.setTx_cidade(estacao.getTx_cidade());
        estacaoBanco.setTx_uf(estacao.getTx_uf());
        estacaoBanco.setTx_endereco(estacao.getTx_endereco());
        estacaoBanco.setHr_inicioexpediente(estacao.getHr_inicioexpediente());
        estacaoBanco.setHr_finalexpediente(estacao.getHr_finalexpediente());

        estacaoRepository.save(estacaoBanco);

        return ResponseEntity.ok(estacaoBanco);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteEstacao(@PathVariable("id") Long id) {
        Estacao estacao = estacaoRepository.findById(id).get();

        estacaoRepository.delete(estacao);

        return ResponseEntity.ok(true);
    }
}
