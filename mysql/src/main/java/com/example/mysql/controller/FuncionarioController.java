package com.example.mysql.controller;


import com.example.mysql.model.Funcionario;
import com.example.mysql.repository.FuncionarioRepository;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Id
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping
    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @PostMapping("/salvar")
    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @DeleteMapping("/deletar/{id}")
    public Void deletarFuncionario(@PathVariable Long id) {
        funcionarioRepository.deleteById(id);
        return null;
    }
    @GetMapping("/{id}")
    public Funcionario BuscarFuncionarioPorId(@PathVariable Long id) {
        return funcionarioRepository.findById(id).orElse(null);
}
}