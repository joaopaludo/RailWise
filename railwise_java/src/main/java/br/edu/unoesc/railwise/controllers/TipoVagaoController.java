package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.TipoVagao;
import br.edu.unoesc.railwise.repositories.TipoVagaoRepository;

/**
 * Controller responsável pela manutenção dos tipos de vagão
 * 
 * @author Gabriel
 */
@RestController
@RequestMapping("/tipovagao")
public class TipoVagaoController {

	@Autowired
	private TipoVagaoRepository tipoVagaoRepository;

	/**
	 * Retorna todos os tipos de vagão cadastrados na base
	 * 
	 * @return lista de todos os tipos de vagão cadastrados
	 */
	@GetMapping()
	public ResponseEntity<List<TipoVagao>> getTiposVagao() {
		List<TipoVagao> listaTipoVagaos = tipoVagaoRepository.findAll();

		return ResponseEntity.ok(listaTipoVagaos);
	}

	/**
	 * Busca um registro de tipo de vagão na base pelo id do tipo
	 * 
	 * @param id código identificador do tipo de vagão a buscar
	 * @return registro do tipo de vagão com id igual ao informado
	 */
	@GetMapping(value = "/{id}")
	@ResponseBody
	public ResponseEntity<TipoVagao> getTipoVagao(@PathVariable("id") Long id) {
		TipoVagao tipoVagao = tipoVagaoRepository.findById(id).get();

		return ResponseEntity.ok(tipoVagao);
	}

	/**
	 * Salva um novo registro de tipo de vagão
	 * 
	 * @param tipoVagao objeto de TipoVagao com as informações do tipo de vagão
	 * @return o objeto de TipoVagao salvo na base
	 */
	@PostMapping(value = "cadastro")
	public ResponseEntity<TipoVagao> postTipoVagao(@RequestBody TipoVagao tipoVagao) {
		tipoVagaoRepository.save(tipoVagao);

		return ResponseEntity.ok(tipoVagao);
	}

	/**
	 * Realiza a edição de um registro de tipo de vagão já cadastrado
	 * 
	 * @param id        código do tipo de vagão a editar
	 * @param tipoVagao objeto de TipoVagao com as informações a serem gravadas
	 * @return objeto de TipoVagao salvo na base
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<TipoVagao> putTipoVagao(@PathVariable("id") Long id, @RequestBody TipoVagao tipoVagao) {
		tipoVagao.setId_tipovagao(id);
		tipoVagaoRepository.save(tipoVagao);

		return ResponseEntity.ok(tipoVagao);
	}

	/**
	 * Exclui um registro de tipo de vagão
	 * 
	 * @param id código identificador do tipo de vagão a ser excluído
	 * @return retorna um valor booleano -> true para exclusão bem sucedida
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Boolean> deleteTipoVagao(@PathVariable("id") Long id) {
		tipoVagaoRepository.deleteById(id);

		return ResponseEntity.ok(true);
	}
}
