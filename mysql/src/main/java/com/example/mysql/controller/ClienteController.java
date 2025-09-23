package com.example.mysql.controller;


import com.example.mysql.model.Cliente;
import com.example.mysql.repository.ClienteRepository;
import com.example.mysql.service.ClienteService;
import jakarta.persistence.Id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Id
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();

    }
    @PostMapping
    public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente) {
        clienteService.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);


    }


}




