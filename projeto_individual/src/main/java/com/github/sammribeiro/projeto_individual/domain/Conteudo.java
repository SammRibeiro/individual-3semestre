package com.github.sammribeiro.projeto_individual.domain;

public class Conteudo {
    private Integer id;
    private String titulo;
    private String tipo;
    private String genero;
    private Integer anoLancamento;
    private String plataforma;

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}


