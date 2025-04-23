# Proyecto Spring Boot API

Esta es una aplicación Spring Boot que expone una API REST. La documentación de la API se genera automáticamente con Swagger, y la configuración sensible—como la conexión a la base de datos PostgreSQL—se maneja en un archivo seguro que se encuentra fuera del control de versiones.

## Características

- **API REST** diseñada con Spring Boot.
- **Documentación Swagger** para probar y documentar los endpoints:
  - [http://localhost:8081/swagger-ui/index.html](http://localhost:8081/swagger-ui/index.html)
  - [http://127.0.0.1:8081/swagger-ui/index.html](http://127.0.0.1:8081/swagger-ui/index.html)
- **Conexión a base de datos segura** mediante el archivo `postgresql_secure.yml`, el cual se encuentra incluido en `.gitignore` para proteger información sensible.

## Requisitos

- Java 17 (o superior)
- Maven
- PostgreSQL

## Instalación y Ejecución

1. **Clona el repositorio:**

   ```bash
   git clone https://github.com/LChumi/ClienteCRUD-SpringBoot.git
   
# 2 · Crear archivo con credenciales
cp src/main/resources/postgresql_secure.example.yml \
   src/main/resources/postgresql_secure.yml
#  – Edita usuario, password y URL en ese nuevo archivo –

# 3 · Compilar y arrancar la app
mvn spring-boot:run
