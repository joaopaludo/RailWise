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

/**
 * Controller responsável pela manutenção das manutenções de locomotivas, vagões
 * e ferrovias(rotas)
 * 
 * @author João
 */
@RestController
@RequestMapping("/manutencao")
public class ManutencaoController {

    @Autowired
    private ManutencaoRepository manutencaoRepository;

    /**
     * Retorna as manutenções cadastradas na base
     * 
     * @return lista de todas as manutenções cadastradas
     */
    @GetMapping
    public ResponseEntity<List<Manutencao>> findAll() {
        List<Manutencao> manutencao = manutencaoRepository.findAll();

        return ResponseEntity.ok(manutencao);
    }

    /**
     * Busca o registro de uma manutenção na base pelo código
     * 
     * @param id código identificador da manutenção que se quer encontrar
     * @return registro da manutenção cujo id corresponde ao id passado no parâmetro
     */
    @GetMapping("/{id}")
    public ResponseEntity<Manutencao> findById(@PathVariable Integer id) {
        Manutencao manutencao = manutencaoRepository.findById(id).get();

        return ResponseEntity.ok(manutencao);
    }

    /**
     * Salva uma nova manutenção na base
     * 
     * @param manutencao objeto de Manutencao com as informações a serem salvas
     * @return o objeto da Manutencao gravada na base
     */
    @PostMapping("/cadastro")
    public ResponseEntity<Manutencao> save(@RequestBody Manutencao manutencao) {

        manutencaoRepository.save(manutencao);

        return ResponseEntity.ok(manutencao);
    }

    /**
     * Realiza a edição de um registro de manutenção
     * 
     * @param id         código da manutenção a ser editada
     * @param manutencao objeto de Manutencao com as informações a serem registradas
     * @return objeto de Manutencao registrado na base
     */
    @PutMapping("/{id}")
    public ResponseEntity<Manutencao> update(@PathVariable Integer id, @RequestBody Manutencao manutencao) {
        manutencao.setId_manutencao(id);

        manutencaoRepository.save(manutencao);

        return ResponseEntity.ok(manutencao);
    }

    /**
     * Realiza a exclusão de uma manutenção da base
     * 
     * @param id código da manutenção a ser excluída
     * @return retorna um valor booleano -> true para exclusão bem sucedida
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id) {
        Manutencao manutencao = manutencaoRepository.findById(id).get();

        manutencaoRepository.delete(manutencao);

        return ResponseEntity.ok(true);
    }
}
