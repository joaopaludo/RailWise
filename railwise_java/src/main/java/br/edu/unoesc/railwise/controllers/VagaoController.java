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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.railwise.entities.Vagao;
import br.edu.unoesc.railwise.repositories.VagaoRepository;

/**
 * Controller responsável pela manutenção dos vagões
 * 
 * @author Gabriel
 */
@RestController
@RequestMapping("/vagao")
public class VagaoController {

	@Autowired
	private VagaoRepository vagaoRepository;

	/**
	 * Retorna todos os vagões cadastrados na base
	 * 
	 * @return lista de todos os vagões cadastrados
	 */
	@GetMapping()
	public ResponseEntity<List<Vagao>> getVagoes() {
		List<Vagao> listaVagoes = vagaoRepository.findAll();

		return ResponseEntity.ok(listaVagoes);
	}

	/**
	 * Busca um registro de vagão na base pelo id do vagão
	 * 
	 * @param id código identificador do vagão a encontrar
	 * @return registro do vagão que possui o id informado
	 */
	@GetMapping(value = "/{id}")
	@ResponseBody
	public ResponseEntity<Vagao> getVagao(@PathVariable("id") Long id) {
		Vagao vagao = vagaoRepository.findById(id).get();

		return ResponseEntity.ok(vagao);
	}

	/**
	 * Salva um novo registro de vagão
	 * 
	 * @param vagao objeto de Vagao com as informações do vagão a salvar
	 * @return o objeto de Vagao salvo na base
	 */
	@PostMapping(value = "cadastro")
	public ResponseEntity<Vagao> postVagao(@RequestBody Vagao vagao) {
		vagaoRepository.save(vagao);

		return ResponseEntity.ok(vagao);
	}

	/**
	 * Realiza a edição de um registro de vagão já cadastrado
	 * 
	 * @param id    código do vagão a editar
	 * @param vagao objeto de Vagao com as informações a serem gravadas
	 * @return objeto de Vagao salvo na base
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<Vagao> putVagao(@PathVariable("id") Long id, @RequestBody Vagao vagao) {
		vagao.setId_vagao(id);

		vagaoRepository.save(vagao);

		return ResponseEntity.ok(vagao);
	}

	/**
	 * Exclui um registro de vagão
	 * 
	 * @param id código identificador do vagão a ser excluído
	 * @return retorna um valor booleano -> true para exclusão bem sucedida
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Boolean> deleteVagao(@PathVariable("id") Long id) {
		vagaoRepository.deleteById(id);

		return ResponseEntity.ok(true);
	}

}
