# todolist

Bem-vindo ao repositório do projeto `todolist`! Este é um aplicativo de lista de tarefas desenvolvido em Java, com foco em demonstrar conceitos de desenvolvimento e implantação.

## ✨ Sobre o Projeto

O `todolist` é uma aplicação simples para gerenciamento de tarefas, permitindo aos usuários criar, visualizar, atualizar e excluir itens de uma lista de afazeres. O projeto foi estruturado para ser facilmente implantável utilizando Docker.

## 🚀 Tecnologias Utilizadas

O projeto foi desenvolvido com as seguintes tecnologias:

*   **Java** (97.5%) – Linguagem de programação principal.
*   **Maven** – Ferramenta de automação de build e gerenciamento de dependências.
*   **Dockerfile** (2.5%) – Para conteinerização da aplicação.

## 📁 Estrutura do Repositório

```
todolist/
├── .mvn/                 # Arquivos de wrapper Maven
├── src/                  # Código-fonte da aplicação
│   └── main/
│       └── java/
│           └── org/yourcompany/yourproject # Pacotes da aplicação
├── .gitattributes        # Configurações do Git
├── .gitignore            # Arquivos e diretórios a serem ignorados pelo Git
├── Dockerfile            # Definição para construção da imagem Docker
├── mvnw                  # Wrapper Maven para Linux/macOS
├── mvnw.cmd              # Wrapper Maven para Windows
└── pom.xml               # Arquivo de configuração do projeto Maven
```

## 🛠️ Como Rodar o Projeto Localmente

Para rodar o projeto `todolist` em seu ambiente local, você pode seguir os passos abaixo:

### Pré-requisitos

Certifique-se de ter o Java Development Kit (JDK) e o Maven instalados em sua máquina, ou o Docker para a opção de conteinerização.

### Usando Maven (sem Docker)

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/joaisdev/todolist.git
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd todolist
    ```
3.  **Compile o projeto:**
    ```bash
    ./mvnw clean install
    ```
4.  **Execute a aplicação:**
    ```bash
    java -jar target/todolist-0.0.1-SNAPSHOT.jar # O nome do JAR pode variar
    ```

### Usando Docker

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/joaisdev/todolist.git
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd todolist
    ```
3.  **Construa a imagem Docker:**
    ```bash
    docker build -t todolist-app .
    ```
4.  **Execute o contêiner Docker:**
    ```bash
    docker run -p 8080:8080 todolist-app
    ```
    A aplicação estará disponível em `http://localhost:8080`.


## 📄 Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes. (Assumindo licença MIT, caso contrário, ajustar)
