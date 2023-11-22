package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Cliente>> getClientes() {
        List<Cliente> listaClientes = clienteRepository.findAll();

        return new ResponseEntity<List<Cliente>>(listaClientes, HttpStatus.OK);
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

        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Cliente> putCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
        Cliente clienteBanco = clienteRepository.findById(id).get();

        // Remove os contatos do cliente para não dar erro de entidade transiente
        List<Contato> contatos = cliente.getContatos();
        cliente.setContatos(null);

        clienteBanco.setTx_nome(cliente.getTx_nome());
        clienteBanco.setTx_documento(cliente.getTx_documento());
        clienteBanco.setDt_cadastro(cliente.getDt_cadastro());
        clienteBanco.setCd_status(cliente.getCd_status());

        clienteRepository.save(clienteBanco);

        // Salva os contatos do cliente
        for (Contato contato : contatos) {
            contato.setCliente(clienteBanco);
            contatoRepository.save(contato);
        }

        return new ResponseEntity<Cliente>(clienteBanco, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Cliente> deleteCliente(@PathVariable("id") Long id) {
        Cliente cliente = clienteRepository.findById(id).get();

        // Remove os contatos do cliente
        List<Contato> contatos = cliente.getContatos();
        for (Contato contato : contatos) {
            contatoRepository.delete(contato);
        }

        clienteRepository.delete(cliente);

        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }
}
