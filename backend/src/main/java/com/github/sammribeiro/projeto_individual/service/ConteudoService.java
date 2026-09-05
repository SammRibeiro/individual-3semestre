package com.github.sammribeiro.projeto_individual.service;

import com.github.sammribeiro.projeto_individual.domain.Conteudo;

import java.util.List;

public interface ConteudoService {

    void salvar(Conteudo conteudo);

    List<Conteudo> listar();
}
