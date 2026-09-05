import { useEffect, useState } from "react";
import styles from "./ListaConteudos.module.css";
import { buscarConteudos } from "../../services/conteudoService";

export function ListaConteudos() {
    const [conteudos, setConteudos] = useState([]);
    const [carregando, setCarregando] = useState(true);
    const [mensagem, setMensagem] = useState("");

    useEffect(() => {
        buscarConteudos()
            .then((resposta) => {
                setConteudos(resposta.data);
                setMensagem("");
            })
            .catch(() => {
                setMensagem("Erro ao buscar conteúdos.");
            })
            .finally(() => {
                setCarregando(false);
            });
    }, []);

    if (carregando) {
        return <p>Carregando conteúdos...</p>;
    }

    if (mensagem != "") {
        return <p>{mensagem}</p>;
    }

    return (
        <div className={styles.lista}>
            <h2>Conteúdos cadastrados</h2>

            <div className={styles.cards}>
                {conteudos.map((conteudo) => (
                    <div key={conteudo.id} className={styles.conteudo}>
                        <h3>{conteudo.titulo}</h3>
                        <p>Tipo: {conteudo.tipo}</p>
                        <p>Gênero: {conteudo.genero}</p>
                        <p>Ano: {conteudo.anoLancamento}</p>
                        <p>Plataforma: {conteudo.plataforma}</p>
                    </div>
                ))}
            </div>
        </div>
    );
}

