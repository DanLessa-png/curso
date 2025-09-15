package com.example.aula.controler;

import com.example.aula.model.Produto;
import com.example.aula.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")

public class ProdutoController {
    public ProdutoController produtoController;

    public ProdutoController (ProdutoController produtoController) {
        this.produtoController = produtoController;
    }
    @GetMapping
    public List<String> listarTodos(){
        return List.of("Produto 1", "Produto 2", "Produto 3");
    }
    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
        ProdutoRepository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

}

