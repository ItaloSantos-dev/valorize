# API valorize (Spring)

## Descrição
Esta é uma simples **API** feita em spring, que utiliza APIs públicas para cálculo de investimentos, com base na cotação de moedas estrangeiras e taxas brasileiras
A API permite
* Consultar as taxas para investimentos disponíveis
* consultar as moedas disponíveis e suas cotações
* Calcular um investimento em dias, podendo escolher a moeda de entrada e a de saída

## O projeto foi feito pensando em 
* Estudo do spring
* Estudo de requisições
* Estudo de docker
* Solucionar um problema real
* Dockerizar e deployar (render)
  
## Endpoints disponíveis
```bash
GET  | /valorize/investiments  -> # Retorna os invetimentos disponíveis #
GET  | /valorize/api/coins -> # Retorna as moedas disponíveis #
POST | /valorize/api/calculator
	body{
		  "amountInput": float, -> # quantidade investida #
			"coinInputString": string, -> # sigla da moeda investida #
		  "amountDay": int, -> # duração em dias do investimento #
		  "investimentType": string, -> # sigla do tipo do investimento #
		  "coinOutString": "string" -> # sigla da moeda de saída #
		}
```
### Arquitetura
O projeta utiliza a arquitetura em camadas, com DTOs, controllers, services, models e extertal para acessar API's externas

### Como instalar
```bash
git clone https://github.com/ItaloSantos-dev/valorize
cd valorize
mvnw.cmd clean package DskiptTests
java -jar target/valorize-0.0.1-SNAPSHOT.jar
curl http://localhost:8080/valorize/investiments
# Saída esperada [{"nome":"Selic","valor":15.0},{"nome":"CDI","valor":14.9},{"nome":"IPCA","valor":4.26}]#
```






