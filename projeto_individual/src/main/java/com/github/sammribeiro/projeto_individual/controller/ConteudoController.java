package com.github.sammribeiro.projeto_individual.controller;

import com.github.sammribeiro.projeto_individual.domain.Conteudo;
import com.github.sammribeiro.projeto_individual.service.ConteudoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conteudos")
public class ConteudoController {

    private final ConteudoService service;

    public ConteudoController(ConteudoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody Conteudo conteudo) {

        service.salvar(conteudo);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Conteudo>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}