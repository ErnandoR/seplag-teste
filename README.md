# Teste 

Este projeto é Java com Spring Boot para gerenciamento de servidores, unidades e lotações.

## ✅ Requisitos atendidos

- Autenticação JWT com expiração de 5 minutos
- Permissão de renovação do token
- CRUD completo de entidades: Servidor Efetivo, Temporário, Unidade, Lotação, Pessoa, Endereço
- Upload e recuperação de fotos via MinIO com link temporário
- Docker Compose com PostgreSQL e MinIO
- Paginação e filtros nas consultas
- Segurança com CORS configurado

## 🔧 Como rodar o projeto

### 1. Clone o repositório
```bash
git clone https://github.com/seuusuario/teste-pratico-backend.git
cd teste-pratico-backend
```

### 2. Suba os containers
```bash
docker-compose up -d
```

### 3. Execute a aplicação
Você pode usar o Maven ou rodar pela IDE:

```bash
./mvnw spring-boot:run
```

### 4. Teste a API
Acesse:
- API: `http://localhost:8080`
- MinIO: `http://localhost:9001` (login: minio / senha: minio123)
- PostgreSQL: `localhost:5432`, user `postgres`, senha `postgres`, banco `teste_pratico`

## 📄 Estrutura da API

A documentação completa dos endpoints está disponível em breve (Swagger ou README detalhado opcional).

## 📦 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Security
- PostgreSQL
- MinIO
- Docker / Docker Compose
