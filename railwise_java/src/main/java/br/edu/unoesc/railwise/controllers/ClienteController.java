package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Cliente;
import br.edu.unoesc.railwise.entities.Contato;
import br.edu.unoesc.railwise.repositories.ClienteRepository;
import br.edu.unoesc.railwise.repositories.ContatoRepository;

/**
 * Controller responsável pela manutenção dos clientes e seus contatos
 * 
 * @author Gabriel
 */
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ContatoRepository contatoRepository;

	/**
	 * Retorna os clientes cadastrados na base
	 * 
	 * @return lista de todos os clientes cadastrados
	 */
	@GetMapping()
	public ResponseEntity<List<Cliente>> getClientes() {
		List<Cliente> listaClientes = clienteRepository.findAll();

		return ResponseEntity.ok(listaClientes);
	}

	/**
	 * Busca um registro de cliente na base pelo id do cliente
	 * 
	 * @param id código identificador do cliente que se quer buscar
	 * @return registro do cliente com id igual ao informado no parâmetro
	 */
	@GetMapping(value = "/{id}")
	@ResponseBody
	public ResponseEntity<Cliente> getCliente(@PathVariable("id") Long id) {
		Cliente cliente = clienteRepository.findById(id).get();

		return ResponseEntity.ok(cliente);
	}

	/**
	 * Salva um novo registro de cliente e seus contatos
	 * 
	 * @param cliente objeto de Cliente com as informações do cliente e seus
	 *                contatos
	 * @return o objeto de cliente gravado na base
	 */
	@PostMapping(value = "cadastro")
	public ResponseEntity<Cliente> postCliente(@RequestBody Cliente cliente) {
		// Remove os contatos do cliente para não dar erro de entidade transiente
		List<Contato> contatos = cliente.getContatos();
		cliente.setContatos(null);

		clienteRepository.save(cliente);

		// Salva os contatos do cliente
		for (Contato contato : contatos) {
			contato.setCliente(cliente);
			contatoRepository.save(contato);
		}

		cliente.setContatos(contatos);

		return ResponseEntity.ok(cliente);
	}

	/**
	 * Realiza a edição de um registro de cliente já cadastrado
	 * 
	 * @param id      código identificador do cliente que se deseja editar
	 * @param cliente objeto de Cliente com as informações a serem registradas
	 * @return objeto de Cliente salvo na base
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<Cliente> putCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
		cliente.setId_cliente(id);

		cliente.getContatos().forEach(contato -> contato.setCliente(cliente));

		clienteRepository.save(cliente);

		return ResponseEntity.ok(cliente);
	}

	/**
	 * Realiza a exclusão de um cliente
	 * 
	 * @param id código identificador do cliente a ser excluído
	 * @return retorna um valor booleano -> true para exclusão bem sucedida
	 */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Boolean> deleteCliente(@PathVariable("id") Long id) {
		clienteRepository.deleteById(id);

		return ResponseEntity.ok(true);
	}
}
