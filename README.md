# SpringWebFluxGradle

## Start MongoDb through Docker

cd SpringWebFluxGradle
docker-compose -f mongo-db-start.yml up

## build Spring boot Gradle Project
cd SpringWebFluxGradle
gradlew build 


## Run the Project

cd SpringWebFluxGradle
gradle bootRun

## Get DB data (Example)
GET http://localhost:8080/employees

## Consume another Api (Example)
GET http://localhost:8080/consume







 
