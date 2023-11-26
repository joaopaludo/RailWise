package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Locomotiva;
import br.edu.unoesc.railwise.repositories.LocomotivaRepository;

/**
 * Controller responsável pela manutenção das locomotivas
 * 
 * @author Gabriel
 */
@RestController
@RequestMapping("/locomotiva")
public class LocomotivaController {

	@Autowired
	private LocomotivaRepository locomotivaRepository;

	/**
	 * Retorna as locomotivas cadastradas na base
	 * 
	 * @return lista de todas as locomotivas cadastradas
	 */
	@GetMapping
	public ResponseEntity<List<Locomotiva>> findAll() {
		List<Locomotiva> locomotiva = locomotivaRepository.findAll();

		return ResponseEntity.ok(locomotiva);
	}

	/**
	 * Busca o registro de uma locomotiva na base pelo id
	 * 
	 * @param id código identificador da locomotiva que se quer buscar
	 * @return registro da locomotiva cujo id corresponde ao id informado
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Locomotiva> findById(@PathVariable Long id) {
		Locomotiva locomotiva = locomotivaRepository.findById(id).get();

		return ResponseEntity.ok(locomotiva);
	}

	/**
	 * Salva uma nova locomotiva na base
	 * 
	 * @param locomotiva objeto de Locomotiva com as informações a serem registradas
	 * @return o objeto de Locomotiva gravado na base
	 */
	@PostMapping("/cadastro")
	public ResponseEntity<Locomotiva> save(@RequestBody Locomotiva locomotiva) {
		locomotivaRepository.save(locomotiva);

		return ResponseEntity.ok(locomotiva);
	}

	/**
	 * Realiza a edição de um registro de locomotiva
	 * 
	 * @param id         código da locomotiva a ser editada
	 * @param locomotiva objeto de Locomotiva com as informações a serem registradas
	 * @return objeto de Locomotiva salvo na base
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Locomotiva> update(@PathVariable Long id, @RequestBody Locomotiva locomotiva) {
		locomotiva.setId_locomotiva(id);
		locomotivaRepository.save(locomotiva);

		return ResponseEntity.ok(locomotiva);
	}

	/**
	 * Realiza a exclusão de uma locomotiva
	 * 
	 * @param id código da locomotiva a excluir
	 * @return retorna um valor booleano -> true para exclusão bem sucedida
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		Locomotiva locomotiva = locomotivaRepository.findById(id).get();

		locomotivaRepository.delete(locomotiva);

		return ResponseEntity.ok(true);
	}
}
