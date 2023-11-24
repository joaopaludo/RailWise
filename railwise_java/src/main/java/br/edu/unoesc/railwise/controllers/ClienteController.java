package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Cliente;
import br.edu.unoesc.railwise.entities.Contato;
import br.edu.unoesc.railwise.repositories.ClienteRepository;
import br.edu.unoesc.railwise.repositories.ContatoRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity<Cliente> getCliente(@PathVariable("id") Long id) {
        Cliente cliente = clienteRepository.findById(id).get();

        return ResponseEntity.ok(cliente);
    }

    @GetMapping()
    public ResponseEntity<List<Cliente>> getClientes() {
        List<Cliente> listaClientes = clienteRepository.findAll();

        return ResponseEntity.ok(listaClientes);
    }

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

    @PutMapping(value = "/{id}")
    public ResponseEntity<Cliente> putCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
        cliente.setId_cliente(id);

        cliente.getContatos().forEach(contato -> contato.setCliente(cliente));

        clienteRepository.save(cliente);

        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> deleteCliente(@PathVariable("id") Long id) {
        clienteRepository.deleteById(id);

        return ResponseEntity.ok(true);
    }
}
