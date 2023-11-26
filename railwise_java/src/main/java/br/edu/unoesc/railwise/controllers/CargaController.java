package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Carga;
import br.edu.unoesc.railwise.repositories.CargaRepository;

/**
 * Controller responsável pela manutenção das cargas
 * 
 * @author Gabriel
 */
@RestController
@RequestMapping("/carga")
public class CargaController {

    @Autowired
    private CargaRepository cargaRepository;

    /**
     * Retorna as cargas cadastradas na base
     * 
     * @return lista de todas as cargas cadastradas
     */
    @GetMapping
    public ResponseEntity<List<Carga>> findAll() {
        List<Carga> carga = cargaRepository.findAll();

        return ResponseEntity.ok(carga);
    }

    /**
     * Busca um registro de carga na base pelo id da carga
     * 
     * @param id código identificador da carga que se quer buscar
     * @return registro da carga com id igual ao informado no parâmetro
     */
    @GetMapping("/{id}")
    public ResponseEntity<Carga> findById(@PathVariable Integer id) {
        Carga carga = cargaRepository.findById(id).get();

        return ResponseEntity.ok(carga);
    }

    /**
     * Salva um novo registro de carga
     * 
     * @param carga objeto de Carga com as informações da carga a ser cadastrada
     * @return o objeto de carga gravado na base
     */
    @PostMapping("/cadastro")
    public ResponseEntity<Carga> save(@RequestBody Carga carga) {
        cargaRepository.save(carga);

        return ResponseEntity.ok(carga);
    }

    /**
     * Realiza a edição de um registro de carga já cadastrado
     * 
     * @param id    id da carga que se deseja editar
     * @param carga objeto de Carga com as novas informações a serem registradas
     * @return objeto de Carga salvo na base
     */
    @PutMapping("/{id}")
    public ResponseEntity<Carga> update(@PathVariable Integer id, @RequestBody Carga carga) {
        carga.setId_carga(id);
        cargaRepository.save(carga);

        return ResponseEntity.ok(carga);
    }

    /**
     * Realiza a exclusão de uma carga
     * 
     * @param id código identificador da carga a ser excluída
     * @return retorna um booleano -> true para exclusão bem sucedida
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id) {
        Carga carga = cargaRepository.findById(id).get();

        cargaRepository.delete(carga);

        return ResponseEntity.ok(true);
    }

}
