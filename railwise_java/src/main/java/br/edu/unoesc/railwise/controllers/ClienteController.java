package br.edu.unoesc.railwise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.unoesc.railwise.entities.Cliente;
import br.edu.unoesc.railwise.repositories.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

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
        clienteRepository.save(cliente);

        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Cliente> putCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
        Cliente clienteBanco = clienteRepository.findById(id).get();

        clienteBanco.setTx_nome(cliente.getTx_nome());
        clienteBanco.setTx_documento(cliente.getTx_documento());
        clienteBanco.setDt_cadastro(cliente.getDt_cadastro());
        clienteBanco.setCd_status(cliente.getCd_status());

        clienteRepository.save(clienteBanco);

        return new ResponseEntity<Cliente>(clienteBanco, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Cliente> deleteCliente(@PathVariable("id") Long id) {
        Cliente cliente = clienteRepository.findById(id).get();

        clienteRepository.delete(cliente);

        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }
}
