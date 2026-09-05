package com.github.sammribeiro.projeto_individual.service.serviceImpl;

import com.github.sammribeiro.projeto_individual.domain.Conteudo;
import com.github.sammribeiro.projeto_individual.repository.ConteudoRepository;
import com.github.sammribeiro.projeto_individual.service.ConteudoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConteudoServiceImpl implements ConteudoService {

    private final ConteudoRepository repository;

    public ConteudoServiceImpl(ConteudoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvar(Conteudo conteudo) {
        repository.salvar(conteudo);
    }

    @Override
    public List<Conteudo> listar() {
        return repository.listar();
    }
}
