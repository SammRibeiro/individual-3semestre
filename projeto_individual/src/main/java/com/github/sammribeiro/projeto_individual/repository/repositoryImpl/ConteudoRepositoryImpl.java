package com.github.sammribeiro.projeto_individual.repository.repositoryImpl;

import com.github.sammribeiro.projeto_individual.domain.Conteudo;
import com.github.sammribeiro.projeto_individual.repository.ConteudoRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConteudoRepositoryImpl implements ConteudoRepository {

    private final JdbcTemplate jdbcTemplate;

    public ConteudoRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void salvar(Conteudo conteudo) {

        String sql = """
                INSERT INTO conteudo
                (titulo, tipo, genero, ano_lancamento, plataforma)
                VALUES (?, ?, ?, ?, ?)
                """;

        jdbcTemplate.update(
                sql,
                conteudo.getTitulo(),
                conteudo.getTipo(),
                conteudo.getGenero(),
                conteudo.getAnoLancamento(),
                conteudo.getPlataforma()
        );
    }

    public List<Conteudo> listar() {

        String sql = """
            SELECT id, titulo, tipo, genero, ano_lancamento, plataforma
            FROM conteudo
            """;

        return jdbcTemplate.query(sql, (rs, rowNum) -> {

            Conteudo conteudo = new Conteudo();

            conteudo.setId(rs.getInt("id"));
            conteudo.setTitulo(rs.getString("titulo"));
            conteudo.setTipo(rs.getString("tipo"));
            conteudo.setGenero(rs.getString("genero"));
            conteudo.setAnoLancamento(rs.getInt("ano_lancamento"));
            conteudo.setPlataforma(rs.getString("plataforma"));

            return conteudo;
        });
    }
}
