import { useState } from "react";
import styles from "./FormularioConteudo.module.css";
import { cadastrarConteudo } from "../../services/conteudoService";

export function FormularioConteudo() {
    const [conteudo, setConteudo] = useState({
        titulo: "",
        tipo: "",
        genero: "",
        anoLancamento: "",
        plataforma: ""
    });

    const [carregando, setCarregando] = useState(false);
    const [mensagem, setMensagem] = useState("");

    function alterarTitulo(evento) {
        setConteudo({
            ...conteudo,
            titulo: evento.target.value
        });
    }

    function alterarTipo(evento) {
        setConteudo({
            ...conteudo,
            tipo: evento.target.value
        });
    }

    function alterarGenero(evento) {
        setConteudo({
            ...conteudo,
            genero: evento.target.value
        });
    }

    function alterarAnoLancamento(evento) {
    setConteudo({
        ...conteudo,
        anoLancamento: Number(evento.target.value)
    });
}

    function alterarPlataforma(evento) {
        setConteudo({
            ...conteudo,
            plataforma: evento.target.value
        });
    }

    async function enviarFormulario() {
    if (!conteudo.titulo) {
        setMensagem("Preencha o título.");
        return;
    }

    if (!conteudo.tipo) {
        setMensagem("Preencha o tipo.");
        return;
    }

    if (!conteudo.genero) {
        setMensagem("Preencha o gênero.");
        return;
    }

    if (!conteudo.anoLancamento) {
        setMensagem("Preencha o ano de lançamento.");
        return;
    }

    if (!conteudo.plataforma) {
        setMensagem("Preencha a plataforma.");
        return;
    }

    setCarregando(true);
    setMensagem("");

    try {
        await cadastrarConteudo(conteudo);

        setMensagem("Conteúdo cadastrado com sucesso!");

        setConteudo({
            titulo: "",
            tipo: "",
            genero: "",
            anoLancamento: "",
            plataforma: ""
        });
    } catch (error) {
        console.error(error);
        setMensagem("Erro ao cadastrar conteúdo.");
    } finally {
        setCarregando(false);
    }
}

    return (
        <div className={styles.formulario}>
            <h2>Cadastrar conteúdo</h2>

            <input
                type="text"
                value={conteudo.titulo}
                onChange={alterarTitulo}
                placeholder="Título"
            />

            <input
                type="text"
                value={conteudo.tipo}
                onChange={alterarTipo}
                placeholder="Tipo"
            />

            <input
                type="text"
                value={conteudo.genero}
                onChange={alterarGenero}
                placeholder="Gênero"
            />

            <input
                type="number"
                value={conteudo.anoLancamento}
                onChange={alterarAnoLancamento}
                placeholder="Ano de lançamento"
            />

            <input
                type="text"
                value={conteudo.plataforma}
                onChange={alterarPlataforma}
                placeholder="Plataforma"
            />

            <button
                type="button"
                disabled={carregando}
                onClick={enviarFormulario}
            >
                {carregando ? "Cadastrando..." : "Cadastrar"}
            </button>

            {mensagem ? <p>{mensagem}</p> : null}
        </div>
    );
}