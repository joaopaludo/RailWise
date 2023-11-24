package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.TipoVagao;
import br.edu.unoesc.railwise.repositories.TipoVagaoRepository;

@RestController
@RequestMapping("/tipovagao")
public class TipoVagaoController {

    @Autowired
    private TipoVagaoRepository tipoVagaoRepository;

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<TipoVagao> getTipoVagao(@PathVariable("id") Long id) {
        TipoVagao tipoVagao = tipoVagaoRepository.findById(id).get();

        return ResponseEntity.ok(tipoVagao);
    }

    @GetMapping()
    public ResponseEntity<List<TipoVagao>> getTipoVagaos() {
        List<TipoVagao> listaTipoVagaos = tipoVagaoRepository.findAll();

        return ResponseEntity.ok(listaTipoVagaos);
    }

    @PostMapping(value = "cadastro")
    public ResponseEntity<TipoVagao> postTipoVagao(@RequestBody TipoVagao tipoVagao) {
        tipoVagaoRepository.save(tipoVagao);

        return ResponseEntity.ok(tipoVagao);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<TipoVagao> putTipoVagao(@PathVariable("id") Long id, @RequestBody TipoVagao tipoVagao) {
        tipoVagao.setId_tipovagao(id);
        tipoVagaoRepository.save(tipoVagao);

        return ResponseEntity.ok(tipoVagao);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteTipoVagao(@PathVariable("id") Long id) {
        tipoVagaoRepository.deleteById(id);

        return ResponseEntity.ok(true);
    }
}
