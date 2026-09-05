package com.github.sammribeiro.projeto_individual.controller;

import com.github.sammribeiro.projeto_individual.domain.Conteudo;
import com.github.sammribeiro.projeto_individual.service.ConteudoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/conteudos")
public class ConteudoController {


    private final ConteudoService service;

    public ConteudoController(ConteudoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody Conteudo conteudo) {

        if (conteudo.getTitulo() == null || conteudo.getTitulo().isBlank()) {
            return ResponseEntity.badRequest().body("Preencha o título.");
        }

        if (conteudo.getTipo() == null || conteudo.getTipo().isBlank()) {
            return ResponseEntity.badRequest().body("Preencha o tipo.");
        }

        if (conteudo.getGenero() == null || conteudo.getGenero().isBlank()) {
            return ResponseEntity.badRequest().body("Preencha o gênero.");
        }

        if (conteudo.getAnoLancamento() == null) {
            return ResponseEntity.badRequest().body("Preencha o ano de lançamento.");
        }

        if (conteudo.getPlataforma() == null || conteudo.getPlataforma().isBlank()) {
            return ResponseEntity.badRequest().body("Preencha a plataforma.");
        }

        service.salvar(conteudo);

        return ResponseEntity.status(201).body("Conteúdo cadastrado com sucesso!");
    }

    @GetMapping
    public ResponseEntity<List<Conteudo>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}