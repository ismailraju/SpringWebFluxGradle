# SpringWebFluxGradle

## Start MongoDb through Docker
```
cd SpringWebFluxGradle
docker-compose -f mongo-db-start.yml up
```
## Build Spring boot Gradle Project
```
cd SpringWebFluxGradle
gradlew build 
```

## Run the Project
```
cd SpringWebFluxGradle
gradle bootRun
```
## Get DB data (Example)
```
GET http://localhost:8080/employees
```
##### Response
```
[{"id":"1","name":"Employee 1"},{"id":"2","name":"Employee 2"},{"id":"5","name":"Employee 5"},{"id":"6","name":"Employee 6"},{"id":"4","name":"Employee 4"},{"id":"3","name":"Employee 3"},{"id":"8","name":"Employee 8"},{"id":"7","name":"Employee 7"},{"id":"9","name":"Employee 9"},{"id":"10","name":"Employee 10"}]
```
## Consume another Api (using `WebClient`)
```
GET http://localhost:8080/consume
```
##### Response
```
[{"id":"1","name":"Employee 1"},{"id":"2","name":"Employee 2"},{"id":"5","name":"Employee 5"},{"id":"6","name":"Employee 6"},{"id":"4","name":"Employee 4"},{"id":"3","name":"Employee 3"},{"id":"8","name":"Employee 8"},{"id":"7","name":"Employee 7"},{"id":"9","name":"Employee 9"},{"id":"10","name":"Employee 10"}]
```







 
