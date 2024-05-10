# Projeto alpha 01

Esse projeto é dedicado aos meus estudos a respeito de Spring e springBoot, sendo um pequeno CRUD da classe User

## Endpoints Map:
- __User__
   - [Retornar todos](#retornar-usuarios)
   - [Registrar](#registrar-user)
   - [Retornar pelo ID](#retornar-user-pelo-id)
   - [Atualizar](#atualizar-usuário-pelo-id)
   - [Deletar](#Deletar-usuário-pelo-ID)

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

### Registrar User

`POST`/users

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

### Retornar User pelo ID

`GET`/users/__{id}__

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

## Atualizar usuário pelo ID

`PUT`/users/__{ID}__

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

### Deletar usuário pelo ID

`DELETE`/users/__{ID}__

__Deleta um User em nosso DB, essa requisição recebe um ID em sua URL__

__Respostas__

| código | descrição 
|--------|----------
|204| no-content
|404| não foi  encontrado User com esse ID
