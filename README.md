# 📘 API RESTful - Gerenciamento de Alunos

Este projeto é uma API RESTful desenvolvida com **Spring Boot**, utilizando a arquitetura **MVC**.  
A API permite realizar operações de **CRUD** (Create, Read, Update, Delete) em uma lista de alunos armazenada em memória (sem banco de dados).

---

## 🚀 Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Web
- Spring Security (com configuração para desabilitar autenticação)
- Maven

---

## 📂 Estrutura do Projeto
```
src/
└── main/
    └── java/
        └── com/
            └── example/
                └── demo/
                    ├── model/
                    │   └── Aluno.java
                    ├── service/
                    │   └── AlunoService.java
                    ├── controller/
                    │   └── AlunoController.java
                    ├── config/
                    │   └── SecurityConfig.java
                    └── DemoApplication.java
```

---
## ⚙️ Como Rodar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/dudlves/API-Aluno.git
   ```

2. **Entre no diretório do projeto:**
   ```bash
   cd API-Aluno
   ```

3. **Execute a aplicação:**
   
    Se estiver usando **Visual Studio Code** com a extensão **Spring Boot Dashboard**:

        1. Abra o Spring Boot Dashboard (Ctrl+Shift+P → Spring Boot Dashboard).
        2. Selecione o projeto e clique em Run.
   

5. A API estará rodando em:
   ```
   http://localhost:8080
   ```

---
## 📌 Endpoints

### 🔹 Listar todos os alunos
```http
GET /alunos
```

### 🔹 Buscar aluno por ID
```http
GET /alunos/{id}
```

### 🔹 Adicionar novo aluno
```http
POST /alunos
Content-Type: application/json

{
  "nome": "Maria",
  "curso": "Sistemas de Informação"
}
```

### 🔹 Atualizar aluno
```http
PUT /alunos/{id}
Content-Type: application/json

{
  "nome": "João",
  "curso": "Engenharia"
}
```

### 🔹 Remover aluno
```http
DELETE /alunos/{id}
```

---
