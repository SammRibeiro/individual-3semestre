package com.github.sammribeiro.projeto_individual.repository;

import com.github.sammribeiro.projeto_individual.domain.Conteudo;

import java.util.List;

public interface ConteudoRepository {

    void salvar(Conteudo conteudo);

    List<Conteudo> listar();
}
