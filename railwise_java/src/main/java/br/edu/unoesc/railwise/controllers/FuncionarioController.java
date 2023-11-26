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

import br.edu.unoesc.railwise.entities.Funcionario;
import br.edu.unoesc.railwise.repositories.FuncionarioRepository;

/**
 * Controller responsável pela manutenção dos funcionários
 * 
 * @author Gabriel
 */
@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	/**
	 * Retorna os funcionários cadastrados na base
	 * 
	 * @return lista de todos os funcionários cadastrados
	 */
	@GetMapping
	public ResponseEntity<List<Funcionario>> findAll() {
		return ResponseEntity.ok(funcionarioRepository.findAll());
	}

	/**
	 * Busca um registro de funcionário na base pelo id do funcionário
	 * 
	 * @param id código identificador do funcionário a buscar
	 * @return registro do funcionário com id igual ao id informado
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Funcionario> findById(@PathVariable Long id) {
		Funcionario funcionario = funcionarioRepository.findById(id).get();

		return ResponseEntity.ok(funcionario);
	}

	/**
	 * Salva um novo registro de funcionário
	 * 
	 * @param funcionario objeto de Funcionario com as informações do funcionário
	 * @return o objeto de Funcionario salvo na base
	 */
	@PostMapping("/cadastro")
	public ResponseEntity<Funcionario> save(@RequestBody Funcionario funcionario) {
		funcionarioRepository.save(funcionario);

		return ResponseEntity.ok(funcionario);
	}

	/**
	 * Realiza a edição de um registro de funcionário já cadastrado
	 * 
	 * @param id          código identificador do funcionário a editar
	 * @param funcionario objeto de Funcionario com as informações a serem gravadas
	 * @return objeto de Funcionario salvo na base
	 */
	@PutMapping("/{id}")
	public ResponseEntity<Funcionario> update(@PathVariable Long id, @RequestBody Funcionario funcionario) {
		funcionario.setId_funcionario(id);
		funcionarioRepository.save(funcionario);

		return ResponseEntity.ok(funcionario);
	}

	/**
	 * Exclui um registro de funcionário
	 * 
	 * @param id código identificador do funcionário a ser excluído
	 * @return retorna um valor booleano -> true para exclusão bem sucedida
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		funcionarioRepository.deleteById(id);

		return ResponseEntity.ok(true);
	}

}
