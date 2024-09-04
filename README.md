# User Department Management System

## Descrição

Este projeto é uma aplicação de gerenciamento de departamentos de usuários desenvolvida em Java utilizando Spring Boot. Ele permite que os administradores gerenciem informações de usuários e departamentos de maneira eficiente, fornecendo endpoints RESTful para CRUD (Criar, Ler, Atualizar e Excluir) operações.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (para ambiente de desenvolvimento)
- **Maven** (para gerenciamento de dependências)
- **Lombok** (para simplificar a escrita de código Java)
- **Spring Web** (para criação de endpoints RESTful)
- **JUnit 5** (para testes unitários)
- **Swagger/OpenAPI** (para documentação da API)


## Funcionalidades

- **Gerenciamento de Usuários:**
  - Criação de novos usuários
  - Consulta de usuários por ID
  - Atualização de informações de usuários
  - Exclusão de usuários

- **Gerenciamento de Departamentos:**
  - Criação de novos departamentos
  - Consulta de departamentos por ID
  - Atualização de informações de departamentos
  - Exclusão de departamentos

## Endpoints Principais

Abaixo estão os principais endpoints disponíveis:

### Usuários
- **GET** `/users/{id}` - Retorna as informações de um usuário específico
- **POST** `/users` - Cria um novo usuário
- **PUT** `/users/{id}` - Atualiza as informações de um usuário existente
- **DELETE** `/users/{id}` - Exclui um usuário

### Departamentos
- **GET** `/departments/{id}` - Retorna as informações de um departamento específico
- **POST** `/departments` - Cria um novo departamento
- **PUT** `/departments/{id}` - Atualiza as informações de um departamento existente
- **DELETE** `/departments/{id}` - Exclui um departamento

## Configuração e Execução

### Pré-requisitos

- Java 17
- Maven 3.8+

### Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seuusuario/your-repo.git
   cd your-repo
   ```
2. Compile e execute a aplicação:
    ```bash
   mvn clean install
   mvn spring-boot:run
    ```
3. Acesse a aplicação em http://localhost:8080.
    - O projeto está configurado para usar o banco de dados H2 em memória durante o desenvolvimento.
    - Para acessar o console do H2, vá para http://localhost:8080/h2-console e use as credenciais padrão especificadas em application.properties.

### Testes
Para rodar os testes unitários, execute:
   ```bash
   mvn test
   ```
### Tratamento de Exceções
    Este projeto utiliza um manipulador global de exceções (GlobalExceptionHandler) para centralizar o tratamento de erros. As exceções são capturadas e uma resposta personalizada é enviada ao cliente.

### Contribuição
Se você deseja contribuir com este projeto, siga os passos abaixo:

1 - Faça um fork do repositório
2 - Crie uma nova branch (git checkout -b feature/nova-funcionalidade)
3 - Commit suas mudanças (git commit -m 'Adiciona nova funcionalidade')
4 - Faça o push para a branch (git push origin feature/nova-funcionalidade)
5 - Abra um Pull Request

## Imagem do Projeto:
![Captura de Tela (72)](https://github.com/user-attachments/assets/b3c750a1-0c40-4ff4-ac3d-715d6466c6c4)
![Captura de Tela (74)](https://github.com/user-attachments/assets/3627a677-5a6f-4ce7-8d2d-cfd237bc9c99)

## Contribuições
Contribuições são bem-vindas! Se você tiver alguma sugestão ou encontrar algum bug, fique à vontade para abrir uma issue ou enviar um pull request. Projeto para fins de estudo acadêmico em Java e Spring Boot.

