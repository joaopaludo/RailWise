package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Estacao getEstacao(@PathVariable("id") Long id) {
        Estacao estacao = estacaoRepository.findById(id).get();

        return estacao;
    }

    @GetMapping()
    public List<Estacao> getEstacoes() {
        List<Estacao> listaEstacoes = estacaoRepository.findAll();

        return listaEstacoes;
    }

    @PostMapping(value = "cadastro")
    public Estacao postEstacao(@RequestBody Estacao estacao) {
        estacaoRepository.save(estacao);

        return estacao;
    }

    @PutMapping(value = "/{id}")
    public Estacao putEstacao(@PathVariable("id") Long id, @RequestBody Estacao estacao) {
        Estacao estacaoBanco = estacaoRepository.findById(id).get();

        estacaoBanco.setTx_nome(estacao.getTx_nome());
        estacaoBanco.setTx_cidade(estacao.getTx_cidade());
        estacaoBanco.setTx_uf(estacao.getTx_uf());
        estacaoBanco.setTx_endereco(estacao.getTx_endereco());
        estacaoBanco.setHr_inicioexpediente(estacao.getHr_inicioexpediente());
        estacaoBanco.setHr_finalexpediente(estacao.getHr_finalexpediente());

        estacaoRepository.save(estacaoBanco);

        return estacaoBanco;
    }

    @DeleteMapping(value = "/{id}")
    public Estacao deleteEstacao(@PathVariable("id") Long id) {
        Estacao estacao = estacaoRepository.findById(id).get();

        estacaoRepository.delete(estacao);

        return estacao;
    }
}
