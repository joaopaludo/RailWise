package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Viagem;
import br.edu.unoesc.railwise.repositories.ViagemRepository;

/**
 * Controller responsável pela manutenção das viagens
 * 
 * @author Gabriel
 */
@RestController
@RequestMapping("/viagem")
public class ViagemController {

	@Autowired
	private ViagemRepository viagemRepository;

	/**
	 * Retorna as viagens cadastradas na base
	 * 
	 * @return lista de todas as viagens cadastradas
	 */
	@GetMapping
	public ResponseEntity<List<Viagem>> findAll() {
		List<Viagem> viagem = viagemRepository.findAll();

		return ResponseEntity.ok(viagem);
	}

	/**
	 * Busca um registro de viagem na base pelo id da viagem
	 * 
	 * @param id código da viagem que se quer buscar
	 * @return registro da viagem com id igual ao informado
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Viagem> findById(@PathVariable Long id) {
		Viagem viagem = viagemRepository.findById(id).get();

		return ResponseEntity.ok(viagem);
	}

	/**
	 * Salva um novo registro de viagem na base
	 * 
	 * @param viagem objeto de Viagem com as informações a serem registradas
	 * @return o objeto de Viagem gravado na base
	 */
	@PostMapping("/cadastro")
	public ResponseEntity<Viagem> save(@RequestBody Viagem viagem) {

		viagem.getViagemVagao().forEach(viagemVagao -> {
			viagemVagao.setViagem(viagem);
		});

		viagem.getViagemRota().forEach(viagemRota -> {
			viagemRota.setViagem(viagem);
		});

		viagem.getFuncionarioViagem().forEach(funcionarioViagem -> {
			funcionarioViagem.setViagem(viagem);
		});

		viagemRepository.save(viagem);

		return ResponseEntity.ok(viagem);
	}

	/**
	 * Realiza a edição de um registro de viagem já cadastrado
	 * 
	 * @param id     código da viagem que se quer editar
	 * @param viagem objeto de Viagem com as informações a serem registradas
	 * @return objeto de Viagem salvo na base
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Viagem> update(@PathVariable Long id, @RequestBody Viagem viagem) {
		viagem.setId_viagem(id);

		if (viagem.getViagemVagao() != null) {
			viagem.getViagemVagao().forEach(viagemVagao -> {
				viagemVagao.setViagem(viagem);
			});
		}

		if (viagem.getViagemRota() != null) {
			viagem.getViagemRota().forEach(viagemRota -> {
				viagemRota.setViagem(viagem);
			});
		}

		if (viagem.getFuncionarioViagem() != null) {
			viagem.getFuncionarioViagem().forEach(funcionarioViagem -> {
				funcionarioViagem.setViagem(viagem);
			});
		}

		viagemRepository.save(viagem);

		return ResponseEntity.ok(viagem);
	}

	/**
	 * Realiza a exclusão de uma viagem
	 * 
	 * @param id código da viagem a ser excluída
	 * @return retorna um valor booleano -> true para exclusão bem sucedida
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		Viagem viagem = viagemRepository.findById(id).get();

		viagemRepository.delete(viagem);

		return ResponseEntity.ok(true);
	}

}
