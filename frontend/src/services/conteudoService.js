import axios from "axios";

const API_URL = "http://localhost:8080/conteudos";

export function cadastrarConteudo(conteudo) {
    return axios.post(API_URL, conteudo);
}

export function buscarConteudos() {
    return axios.get(API_URL);
}