# Consulta ViaCEP

Aplicação desenvolvida em Java para consulta de endereços através da API pública ViaCEP.

O projeto foi desenvolvido como parte dos estudos de Java, com o objetivo de praticar o consumo de APIs, manipulação de JSON, tratamento de exceções e gravação de dados em arquivos.

## Funcionalidades

- Consultar um endereço através de um CEP
- Consumir a API ViaCEP através de requisições HTTP
- Converter o JSON recebido da API em um objeto Java
- Exibir os dados do endereço no console
- Converter o objeto Java novamente para JSON
- Salvar os dados do endereço em um arquivo `.json`
- Encerrar a aplicação através da opção `sair`
- Tratamento de erros de conexão e dados inválidos

## Tecnologias utilizadas

- Java
- Gson
- API ViaCEP
- IntelliJ IDEA
- Git
- GitHub

## Conceitos praticados

- `Scanner`
- `HttpClient`
- `HttpRequest`
- `HttpResponse`
- Requisições HTTP
- Consumo de APIs REST
- JSON
- Serialização
- Desserialização
- Gson
- `record`
- `try/catch`
- Tratamento de exceções
- `FileWriter`
- Estruturas de repetição

## Como funciona

O usuário informa um CEP através do console.

A aplicação realiza uma requisição para a API ViaCEP:

```text
https://viacep.com.br/ws/{CEP}/json

A API retorna os dados do endereço em formato JSON.

Esses dados são convertidos para um objeto Endereco utilizando Gson:

JSON → Endereco

Depois, o objeto é convertido novamente para JSON e salvo em um arquivo:

Endereco → JSON → arquivo.json
Estrutura do projeto
src/
├── ConsultaCep.java
├── Endereco.java
└── Main.java
Main

Responsável pela interação com o usuário, controle do menu e execução das consultas.

ConsultaCep

Responsável por realizar a requisição HTTP para a API ViaCEP e converter a resposta JSON em um objeto Endereco.

Endereco

record responsável por representar os dados do endereço retornados pela API.

Exemplo de utilização
Digite seu CEP: 01001000

Endereco[cep=01001-000, logradouro=Praça da Sé, complemento=lado ímpar, bairro=Sé, localidade=São Paulo, uf=SP]

Digite seu CEP: sair
Objetivo do projeto

Este projeto foi desenvolvido para consolidar os conhecimentos adquiridos durante o módulo de consumo de APIs em Java, colocando em prática a comunicação com uma API externa, conversão de dados JSON e tratamento de exceções.

Desenvolvido por Matheus Schmidt
