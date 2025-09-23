package com.example.mysql.service;


import com.example.mysql.model.Cliente;
import com.example.mysql.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        if (clienteRepository.findByProtocoloAtendimento(cliente.getProtocoloAtendimento()).isPresent()){
            throw new RuntimeException("Cliente já cadastrado");

        } else {
            return clienteRepository.save(cliente);
        }
    }
}
