package br.edu.unoesc.railwise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Vagao;
import br.edu.unoesc.railwise.repositories.VagaoRepository;

@RestController
@RequestMapping("/vagao")
public class VagaoController {

    @Autowired
    private VagaoRepository vagaoRepository;

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<Vagao> getVagao(@PathVariable("id") Long id) {
        Vagao vagao = vagaoRepository.findById(id).get();

        return ResponseEntity.ok(vagao);
    }

    @GetMapping()
    public ResponseEntity<Iterable<Vagao>> getVagaos() {
        Iterable<Vagao> listaVagaos = vagaoRepository.findAll();

        return ResponseEntity.ok(listaVagaos);
    }

    @PostMapping(value = "cadastro")
    public ResponseEntity<Vagao> postVagao(@RequestBody Vagao vagao) {
        vagaoRepository.save(vagao);

        return ResponseEntity.ok(vagao);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Vagao> putVagao(@PathVariable("id") Long id, @RequestBody Vagao vagao) {
        Vagao vagaoBanco = vagaoRepository.findById(id).get();

        vagaoBanco.setTipoVagao(vagao.getTipoVagao());
        vagaoBanco.setVl_capacidade(vagao.getVl_capacidade());
        vagaoBanco.setVl_peso(vagao.getVl_peso());

        vagaoRepository.save(vagaoBanco);

        return ResponseEntity.ok(vagaoBanco);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteVagao(@PathVariable("id") Long id) {
        Vagao vagao = vagaoRepository.findById(id).get();

        vagaoRepository.delete(vagao);

        return ResponseEntity.ok(true);
    }

}
