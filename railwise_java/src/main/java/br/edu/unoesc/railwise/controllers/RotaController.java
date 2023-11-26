package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Rota;
import br.edu.unoesc.railwise.repositories.RotaRepository;

/**
 * Controller responsável pela manutenção das rotas
 * 
 * @author Gabriel
 */
@RestController
@RequestMapping("/rota")
public class RotaController {

	@Autowired
	private RotaRepository rotaRepository;

	/**
	 * Retorna todas as rotas cadastradas na base
	 * 
	 * @return lista de todas as rotas cadastradas
	 */
	@GetMapping
	public ResponseEntity<List<Rota>> findAll() {
		List<Rota> rota = rotaRepository.findAll();

		return ResponseEntity.ok(rota);
	}

	/**
	 * Busca o registro de uma rota na base pelo id
	 * 
	 * @param id código identificador da rota que se quer encontrar
	 * @return registro da rota cujo id corresponde ao id informado
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Rota> findById(@PathVariable Long id) {
		Rota rota = rotaRepository.findById(id).get();

		return ResponseEntity.ok(rota);
	}

	/**
	 * Salva uma nova rota na base
	 * 
	 * Insere dois registros na base: 1. Rota com origem e destino informados 2.
	 * Rota com origem e destino com posições invertidas (rota de volta)
	 * 
	 * @param rota objeto de Rota com as informações a serem cadastradas
	 * @return o objeto de Rota gravado na base
	 */
	@PostMapping("/cadastro")
	public ResponseEntity<Rota> save(@RequestBody Rota rota) {
		rotaRepository.save(rota);

		// Cria a rota de volta
		Rota rotaVolta = new Rota();

		rotaVolta.setEstacaoOrigem(rota.getEstacaoDestino());
		rotaVolta.setEstacaoDestino(rota.getEstacaoOrigem());
		rotaVolta.setVl_distancia(rota.getVl_distancia());

		rotaRepository.save(rotaVolta);

		return ResponseEntity.ok(rota);
	}

	/**
	 * Realiza a edição de um registro de rota
	 * 
	 * @param id   código da rota a ser editada
	 * @param rota objeto de Rota com as informações a serem salvas
	 * @return objeto de Rota registrado na base
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Rota> update(@PathVariable Long id, @RequestBody Rota rota) {
		rota.setId_rota(id);
		rotaRepository.save(rota);

		return ResponseEntity.ok(rota);
	}

	/**
	 * Realiza a exclusão de uma rota da base e de sua respectiva rota de volta
	 * (rota com origem e destino invertidos)
	 * 
	 * @param id código da rota a ser excluída
	 * @return retorna um valor booleano -> true para exclusão bem sucedida
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		Rota rota = rotaRepository.findById(id).get();

		// confirma a exclusão
		rotaRepository.deleteById(id);
		rotaRepository.deleteByEstacaoOrigemAndEstacaoDestino(rota.getEstacaoOrigem(), rota.getEstacaoDestino());

		return ResponseEntity.ok(true);
	}

}
