package com.example.springvendas.controller;

import com.example.springvendas.model.Produto;
import com.example.springvendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> listaProdutos() {
        return repository.findAll();
    }

    @PostMapping
    public Produto cadastraProduto(@RequestBody Produto produto) {
        return repository.save(produto);
    }
}
