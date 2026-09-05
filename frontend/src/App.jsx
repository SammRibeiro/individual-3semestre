
import { useState } from "react";
import { FormularioConteudo } from "./components/FormularioConteudo/FormularioConteudo";
import { ListaConteudos } from "./components/ListaConteudo/ListaConteudos";
import styles from "./App.module.css";

function App() {
    const [tela, setTela] = useState("cadastro");

    return (
        <div className={styles.app}>
            <h1 className={styles.titulo}>Catálogo de Streaming</h1>

            <div className={styles.menu}>
                <button onClick={() => setTela("cadastro")}>
                    Cadastrar
                </button>

                <button onClick={() => setTela("consulta")}>
                    Consultar
                </button>
            </div>

              {tela == "cadastro" ? <FormularioConteudo /> : <ListaConteudos />
}
        </div>
    );
}

export default App;

