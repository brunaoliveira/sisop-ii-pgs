# Sisop II - Programação guiada

### Running PG1
```
  cd sisop-ii-pgs/PG1_Websockets
  mvn jetty:run
```

### Running PG2
```
  cd sisop-ii-pgs
  javac -cp "jersey-bundle-1.19.jar" webservice/*.java
  java -cp ".:jersey-bundle-1.19.jar" webservice.Servidor
  javac -cp "jersey-bundle-1.19.jar" webservice/Cliente.java
  java -cp ".:jersey-bundle-1.19.jar" webservice.Cliente
```
* Add: `http://127.0.0.1:9000/calculadora/somarInt/2/3`
* Multiply: `http://127.0.0.1:9000/calculadora/multiplicarInt/2/3`
