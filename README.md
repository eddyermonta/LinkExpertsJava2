
# Palindromo Microservice

Este microservicio procesa un texto y determina si es un palíndromo, además de calcular la longitud de la cadena y la cantidad de caracteres especiales.

## Endpoints

### POST /api/palindromo

#### Request

- **Content-Type**: `application/json`
- **Body**:
  ```json
  {
      "palindromo": "anita lava la tina"
  }
  ```

#### Response

- **Status**: `200 OK`
- **Body**:
  ```json
  {
      "lengthCadena": 18,
      "isPalindromo": 1,
      "lengthCaracteresEspeciales": 0
  }
  ```

## Tecnologías

- **Spring Boot**: Para crear el microservicio.
- **Lombok**: Para reducir el boilerplate code.
- **Swagger**: Para documentar y probar la API.

## Configuración

Para cambiar el puerto en el que se ejecuta la aplicación, edita el archivo `src/main/resources/application.properties`:

```properties
server.port=8080
```

## Ejecución

Para ejecutar la aplicación, usa el siguiente comando:

```sh
./gradlew bootRun
```

## Pruebas

Para probar el microservicio, puedes usar herramientas como Postman. Envía una solicitud POST a `http://localhost:8080/api/palindromo` con el cuerpo en formato JSON.

