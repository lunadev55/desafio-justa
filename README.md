# desafio-justa
repositório com webservice processo seletivo justa software

# Web Service usando Java Spring Boot
Java 15 - Spring Boot - Biblioteca exp4j

# Constuir projeto com o docker

- Comandos 
(utilizando cmd/bash, na raiz do projeto onde se encontra o Dockerfile digite os comandos):

1. docker build -t simple-web-service .

2. Entrando com o comando "docker images" é possível ver o arquivo "simple-web-service" listado como uma imagem docker

3. docker run -p 8080:8080 simple-web-service 
(esse comando gera um conteiner baseado nessa imagem, é utilizada porta 8080 pois irá rodar uma aplicação spring boot 
que utiliza o TomCat que por sua vez tem porta padrao 8080)

4. curl http://localhost:8080/{endpoint}
(se tudo deu certo, a requisicao feita deve estar em comunicacao com o conteiner) 
