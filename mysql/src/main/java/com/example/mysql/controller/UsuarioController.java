package com.example.mysql.controller;


import com.example.mysql.model.Usuario;
import com.example.mysql.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping("/salvar")
    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/deletar/{id}")
    public Void deletarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
        return null;
    }
    @GetMapping("/{id}")
    public Usuario BuscarUsuarioPorId(@PathVariable Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}