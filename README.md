## ChallengeInterbanking

Para Validar este proyecto siga estos pasos por favor:

1-Importe la base Mysql mediante la ejecución de las sentencias en /resources. username=root y pass=123456	

2-Probar los test unitarios EmpresaUnitTest y EmpresaServiceUnitTest

3-Correr el test de la aplicación ChallengeInterbankingApplicationTests

4-Correr la aplicación ChallengeInterbankingApplication 

5-se pueden validar los endpoints mediante los 3 curls

curl --location --request POST 'http://localhost:8080/empresas' \
--header 'Content-Type: application/json' \
--data-raw '{
"cuit":33333333333,
"razonSocial":"prueba endpoint adhesión de una empresa",
"fechaAdhesion":"2022-09-26 03:00:00"
}'

curl --location --request GET 'http://localhost:8080/empresas/adheridasMesActual'

curl --location --request GET 'http://localhost:8080/empresas/conTransferenciasMesActual'


