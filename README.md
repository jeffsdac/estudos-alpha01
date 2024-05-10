# Projeto alpha 01

Esse projeto é dedicado aos meus estudos a respeito de Spring e springBoot, sendo um pequeno CRUD da classe User

## Endpoints Map:
- __User__
   - [GET_ALL](#retornar-usuarios)
   - [REGISTER]()
   - GET_BY_ID
   - UPDATE
   - DELETE

__CLASSE: User mapeamento de atributos__
| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|----------
|id|inteiro|SIM|Chave primária dessa entidade
|email|String|SIM|campo mandatório
|password|String|SIM|Campo mandatório

## Mapeamento de requisições

### Retornar Usuarios

`GET` /users 

__Retorna uma lista com todos os usuários, veja abaixo um exemplo do retorno__
```js
{
  "users": [
    {
      "id": "1",
      "email": "jeff@email.com",
      "password": "senha123"
    },
    {
      "id": "2",
      "email": "alex@example.com",
      "password": "secretword"
    }
  ]
}
```

__Respostas__

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| endereço não encontrado

### POST em /users
__Registra um usuário na nosso banco de dados__,nessa requisição é necessário colocar um body no formato JSON, segue abaixo um exemplo do body:

```js
{
  "email": "alexandre@gmail.com",
  "password": "senhaMuitoBoa"
}
```

__Respostas__

| código | descrição 
|--------|----------
|201| a clinica foi cadastrada com sucesso
|400| campos inválidos

### GET em /users/{id}
__Retorna o usuário com o ID informado na URL da requisição__, segue abaixo um exemplo de retorno: 
```js
{
  "id": "1"
  "email": "alexandre@gmail.com",
  "password": "senhaMuitoBoa"
}
```

__Respostas__

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi  encontrado User com esse ID

## PUT em /users/{id}
__Atualiza um User em nosso DB, essa requisição recebe um body em formato JSON, segue abaixo o exemplo:__
```js
{
  "id": "1"
  "email": "alexandre@gmail.com",
  "password": "senhaMuitoBoa"
}
```

__Respostas__

| código | descrição 
|--------|----------
|200| os dados foram retornados
|404| não foi  encontrado User com esse ID

### DELETE em /users/{id}
__Deleta um User em nosso DB, essa requisição recebe um ID em sua URL__

__Respostas__

| código | descrição 
|--------|----------
|204| no-content
|404| não foi  encontrado User com esse ID
