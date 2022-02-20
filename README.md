# Avaliação Java


## Descrição

  O teste consiste em construir a camada de serviço de um pseudo ecommerce de games mobile utilizando Java

## Como executar os testes
  
  O projeto usa o maven wrapper (mvnw).
  Para executar os testes de exemplo basta o comando abaixo:
  ```sh
  ./mvnw clean test
  ```

## Requisitos

  - Existe um exemplo de carga de banco de dados em memória em [ProductDaoExampleTest.java](./src/test/java/br/com/supera/game/store/ProductDaoExampleTest.java)
  - Os valores exibidos no checkout (frete, subtotal e total) devem ser calculados dinamicamente
  - O usuário poderá adicionar e remover produtos do carrinho
  - O usuário poderá ordenar os produtos por preço, popularidade (score) e ordem alfabética.
  - A cada produto adicionado, deve-se somar R$ 10,00 ao frete.
  - Quando o valor dos produtos adicionados ao carrinho for igual ou superior a R$ 250,00, o frete é grátis.

## O que iremos avaliar

Levaremos em conta os seguintes critérios:

  - Cumprimento dos requisitos
  - Qualidade do projeto de API e fluidez da DX
  - Organização do código e boas práticas
  - Domínio das linguagens, bibliotecas e ferramentas utilizadas
  - Organização dos commits
  - Escrita e cobertura de testes

## Sobre a entrega

  - A API pode ser HTTP, Restful, WSDL/SOAP, HATEOAS ou gRCP mas deverá ser documentado no [README.md](./README.md) como executar/compilar/empacotar o projeto e quais os endpoints solicitados nos requisitos acima. 
  - A versão do Java pode ser atualizada para 11 ou 14.
  - Não existe restrição de framework (EE, Spring, Quarkus etc) mas será melhor avaliado se justificado no [README.md](./README.md) os motivos da decisão.
  - 
## Tecnologia usada 

Spring boot
h2-database
springdoc-openapi-ui(documentação)
IDE utilizada intellij

## Documentação

http://localhost:8080/swagger-ui/index.html?configUrl=/api_info/swagger-config(informações de sagger sobre endpoints)
//Get Metodos
http://localhost:8080/produtos(retorna lista de produtos)
http://localhost:8080/produtos?sort=name(retorna lista de produtos ordenada por nome)
http://localhost:8080/produtos?sort=price(retorna lista de produtos ordenada por preço)
http://localhost:8080/produtos?sort=score(retorna lista de produtos ordenada por score)
http://localhost:8080/produtos?sort=name,desc(retorna lista de produtos por nome listada de forma descendente)
http://localhost:8080/produtos?sort=price,desc(retorna lista de produtos por preço listada de forma descendente)
http://localhost:8080/produtos?sort=score,desc(retorna lista de produtos por score listada de forma descendente)
http://localhost:8080/cart(retorna lista de produtos no cart)
http://localhost:8080/checkout(retorna lista de produtos no checkout com frete e valor total)
//Post metodos
http://localhost:8080/produtos?id={id do jogo}&quantity={quantidade do jogo}(adiciona ao cart o jogo com o id e na quantidade informada)
http://localhost:8080/checkout(salva no banco de dados o checkout com os items e fretes atuais e reseta o cart)
//Remove
http://localhost:8080/produtos?id={id do jogo}&quantity={quantidade do jogo}(remove do cart o jogo com o id e na quantidade informada)




