# Atividade Acadêmica PUCRS

## Infraestrutura de TI - Sistemas de Informação 2021/1
  - Professor: Marcelo Neves
  - Aluno: Carlos Ruan Pajares

## Aplicação:
  - A aplicação constitui em uma API básica de cadastro e consultas de usuários, desenvolvida em java com utilização do framework springboot.

## Instruções:

1.  Realizar o download da imagem disponível no docker hub.
  - docker pull carlosruan/spring-boot-users-api

<br/>

2. Executar a imagem no docker:
  - docker run -p 8080:8080 carlosruan/spring-boot-users-api

<br/>

3. Visualizar os dados da API:
  - curl http://localhost:8080/v1/users
  - curl http://localhost:8080/v1/users/id
