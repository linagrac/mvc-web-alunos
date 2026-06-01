# MVC Web - Cadastro de Alunos

Projeto desenvolvido utilizando Spring Boot e arquitetura MVC.

## Estrutura do Projeto

### Model
Responsável pelas regras de negócio e representação dos dados.

Arquivo:
- `Aluno.java`

### Controller
Responsável por receber as requisições HTTP e coordenar a comunicação entre Model e View.

Arquivo:
- `AlunoController.java`

### View
Responsável pela interface com o usuário.

Arquivos:
- `alunos-form.html`
- `alunos-lista.html`

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Thymeleaf
- Maven

## Como Executar

1. Abrir o projeto no VS Code.
2. Aguardar o Maven carregar as dependências.
3. Executar a classe `MvcApplication.java` ou rodar no terminal:

```bash
mvn spring-boot:run
```

4. Abrir no navegador:

```text
http://localhost:8080/alunos
```

## Arquitetura MVC

- Model: `Aluno.java`
- View: `alunos-form.html` e `alunos-lista.html`
- Controller: `AlunoController.java`

O Controller recebe os dados do formulário, cria objetos do Model e envia os dados para as Views.
