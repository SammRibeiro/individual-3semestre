#  Catálogo de Streaming

Aplicação desenvolvida em React integrada a uma API REST em Spring Boot para cadastro e visualização de conteúdos de streaming.

O projeto permite cadastrar conteúdos e consultar os dados persistidos no banco de dados MySQL.

## Tecnologias

### Front-end

* React
* JavaScript
* Axios
* CSS Modules
* Vite

### Back-end

* Java
* Spring Boot
* JdbcTemplate
* Maven

### Banco de dados

* MySQL

##  Funcionalidades

* Cadastro de conteúdos;
* Validação dos campos obrigatórios;
* Visualização dos conteúdos cadastrados;
* Integração entre Front-end e API REST;
* Persistência dos dados no MySQL;
* Tratamento de estados de carregamento, sucesso e erro.

##  Dados cadastrados

Cada conteúdo possui os seguintes campos:

* Título
* Tipo
* Gênero
* Ano de lançamento
* Plataforma

## 🔗 Endpoints

### Cadastrar conteúdo

**POST** `/conteudos`

Exemplo de requisição:

```json
{
  "titulo": "Breaking Bad",
  "tipo": "Série",
  "genero": "Drama",
  "anoLancamento": 2008,
  "plataforma": "Netflix"
}
```

### Listar conteúdos

**GET** `/conteudos`

Retorna todos os conteúdos cadastrados no banco de dados.

## Banco de dados

O script para criação do banco e da tabela está disponível em:

```text
database/script.sql
```

##  Como executar

### Back-end

Entre na pasta `backend` e execute a aplicação Spring Boot.

Antes de iniciar, configure as informações de conexão com o MySQL no arquivo:

```text
application.properties
```

### Front-end

Entre na pasta `frontend` e instale as dependências:

```bash
npm install
```

Depois, execute:

```bash
npm run dev
```

O Front-end será disponibilizado pelo Vite.

## 📁 Estrutura do projeto

```text
projeto/
├── backend/
├── frontend/
└── database/
    └── script.sql
```

##  Projeto acadêmico.
