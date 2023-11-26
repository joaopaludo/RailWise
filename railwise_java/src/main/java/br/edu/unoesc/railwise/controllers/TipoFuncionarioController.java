package br.edu.unoesc.railwise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.TipoFuncionario;
import br.edu.unoesc.railwise.repositories.TipoFuncionarioRepository;

/**
 * Controller responsável pela manutenção dos tipos de funcionário
 * 
 * @author Gabriel
 */
@RestController
@RequestMapping("/tipofuncionario")
public class TipoFuncionarioController {

	@Autowired
	private TipoFuncionarioRepository tipoFuncionarioRepository;

	/**
	 * Retorna todos os tipos de funcionário cadastrados na base
	 * 
	 * @return lista de todos os tipos de funcionário cadastrados
	 */
	@GetMapping()
	public ResponseEntity<Iterable<TipoFuncionario>> getTiposFuncionario() {
		Iterable<TipoFuncionario> listaTipoFuncionarios = tipoFuncionarioRepository.findAll();

		return ResponseEntity.ok(listaTipoFuncionarios);
	}

	/**
	 * Busca um registro de tipo de funcionário na base pelo id do tipo
	 * 
	 * @param id código identificador do tipo de funcionário a buscar
	 * @return registro do tipo de funcionário com id igual ao id informado
	 */
	@GetMapping(value = "/{id}")
	@ResponseBody
	public ResponseEntity<TipoFuncionario> getTipoFuncionario(@PathVariable("id") Long id) {
		TipoFuncionario tipoFuncionario = tipoFuncionarioRepository.findById(id).get();

		return ResponseEntity.ok(tipoFuncionario);
	}

	/**
	 * Salva um novo registro de tipo de funcionário
	 * 
	 * @param tipoFuncionario objeto de TipoFuncionario com as informações do tipo
	 *                        de funcionário
	 * @return o objeto de TipoFuncionario salvo na base
	 */
	@PostMapping(value = "cadastro")
	public ResponseEntity<TipoFuncionario> postTipoFuncionario(@RequestBody TipoFuncionario tipoFuncionario) {
		tipoFuncionarioRepository.save(tipoFuncionario);

		return ResponseEntity.ok(tipoFuncionario);
	}

	/**
	 * Realiza a edição de um registro de tipo de funcionário já cadastrado
	 * 
	 * @param id              código do tipo de funcionário a editar
	 * @param tipoFuncionario objeto de TipoFuncionario com as informações a serem
	 *                        gravadas
	 * @return objeto de TipoFuncionario salvo na base
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<TipoFuncionario> putTipoFuncionario(@PathVariable("id") Long id,
			@RequestBody TipoFuncionario tipoFuncionario) {
		tipoFuncionario.setId_tipofuncionario(id);

		tipoFuncionarioRepository.save(tipoFuncionario);

		return ResponseEntity.ok(tipoFuncionario);
	}

	/**
	 * Exclui um registro de tipo de funcionário
	 * 
	 * @param id código identificador do tipo de funcionário a ser excluído
	 * @return retorna um valor booleano -> true para exclusão bem sucedida
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Boolean> deleteTipoFuncionario(@PathVariable("id") Long id) {
		tipoFuncionarioRepository.deleteById(id);

		return ResponseEntity.ok(true);
	}

}
