package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Estacao;
import br.edu.unoesc.railwise.repositories.EstacaoRepository;

/**
 * Controller responsável pela manutenção das estações
 * 
 * @author Gabriel
 */
@RestController
@RequestMapping("/estacao")
public class EstacaoController {

    @Autowired
    private EstacaoRepository estacaoRepository;

    /**
     * Retorna as estações cadastradas na base
     * 
     * @return lista de todas as estações cadastradas
     */
    @GetMapping()
    public ResponseEntity<List<Estacao>> getEstacoes() {
        List<Estacao> listaEstacoes = estacaoRepository.findAll();

        return ResponseEntity.ok(listaEstacoes);
    }

    /**
     * Busca um registro de estação na base pelo id da estação
     * 
     * @param id código identificador da estação que se quer buscar
     * @return registro da estação com id igual ao informado por parâmetro
     */
    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<Estacao> getEstacao(@PathVariable("id") Integer id) {
        Estacao estacao = estacaoRepository.findById(id).get();

        return ResponseEntity.ok(estacao);
    }

    /**
     * Salva um novo registro de estação na base
     * 
     * @param estacao objeto de Estacao com as informações a serem registradas
     * @return o objeto de Estacao gravado na base
     */
    @PostMapping(value = "cadastro")
    public ResponseEntity<Estacao> postEstacao(@RequestBody Estacao estacao) {
        estacaoRepository.save(estacao);

        return ResponseEntity.ok(estacao);
    }

    /**
     * Realiza a edição de um registro de estação já cadastrado
     * 
     * @param id      código da estação que se quer editar
     * @param estacao objeto de Estacao com as informações a serem registradas
     * @return objeto de Estacao salvo na base
     */
    @PutMapping(value = "/{id}")
    public ResponseEntity<Estacao> putEstacao(@PathVariable("id") Integer id, @RequestBody Estacao estacao) {
        estacao.setId_estacao(id);
        estacaoRepository.save(estacao);

        return ResponseEntity.ok(estacao);
    }

    /**
     * Realiza a exclusão de uma estação
     * 
     * @param id código identificador da estação a ser excluída
     * @return retorna um valor booleano -> true para exclusão bem sucedida
     */
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteEstacao(@PathVariable("id") Integer id) {
        estacaoRepository.deleteById(id);

        return ResponseEntity.ok(true);
    }
}
