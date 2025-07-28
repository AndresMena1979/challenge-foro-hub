# Challenge Foro Hub - API REST con Spring Boot
---
#📌 Descripción del Proyecto
---
Este proyecto consiste en el desarrollo de una API REST de foro de discusión llamada Challenge Foro Hub, construida con Java y Spring Boot, como parte de mi formación en el programa ONE - Oracle Next Education de Alura Latam y Oracle.
La API permite gestionar usuarios, tópicos de discusión y sus relaciones, con enfoque en buenas prácticas backend, incluyendo seguridad, validaciones y migraciones de base de datos.

## 🚀  Funcionalidades principales

    📝 Crear, listar y eliminar tópicos

    👤 Asociar tópicos a usuarios registrados

    🔐 Seguridad con autenticación basada en JWT

    🛡️ Validaciones y manejo de errores personalizados

    🗄️ Migraciones de base de datos con Flyway

## 🛠️  Tecnologías utilizadas
---
    Java 21

    Spring Boot 3.3

    Spring Data JPA

    MySQL (como base de datos relacional)

    Flyway (gestión de migraciones SQL)

    Spring Security (autenticación con JWT)

    Maven (gestión de dependencias)

    Insomnia/Postman (para pruebas de endpoints REST)

📁## Estructura del Proyecto
---

```src/
├── main/
│   ├── java/
│   │   └── com.aluracursos.challenge_foro_hub/
│   │       ├── controller/       # Controladores REST (TopicoController, UsuarioController)
│   │       ├── domain/           # Entidades y repositorios (Topico, Usuario)
│   │       ├── infra/            # Seguridad JWT y configuración global
│   │       └── service/          # Lógica de negocio y validaciones
│   └── resources/
│       ├── db/migration/         # Archivos SQL de migración Flyway
│       └── application.properties
```
---

## 🧪 Cómo ejecutar el proyecto
---
    Clona el repositorio:

git clone https://github.com/TU_USUARIO/Challenge-Foro-Hub.git
cd Challenge-Foro-Hub

Configura el archivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/challenge_foro_hub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

api.security.secret=tu_clave_secreta_para_jwt

Ejecuta el proyecto desde tu IDE o con Maven:

    ./mvnw spring-boot:run

    Accede a la API mediante Insomnia/Postman y usa JWT para autenticar las peticiones.

## 🔐  Seguridad y JWT
---
La API implementa seguridad basada en tokens JWT. Para autenticarte:

    Realiza un POST a /login con:

{
  "login": "usuario@ejemplo.com",
  "clave": "123456"
}

Obtén el token JWT en la respuesta y úsalo en el header de futuras peticiones:

    Authorization: Bearer tu_token

## ⚠️ Validaciones y Errores Comunes
---
    ❌ Títulos y mensajes de tópicos deben ser únicos

    ❌ No se permite registrar usuarios o tópicos con campos vacíos

    ⚠️ Se maneja la validación y mensajes de error con clases personalizadas para mayor claridad

## 🧠  Aprendizajes Clave
---
    Estructuración de APIs REST limpias y seguras

    Uso de migraciones con Flyway

    Configuración de filtros de seguridad en Spring Boot

    Gestión de errores personalizados para mejorar la experiencia del cliente REST

    Implementación de relaciones entidad-usuario y control de duplicados

## 🪪  Licencia
---
Este proyecto es de uso educativo, con licencia MIT.
✨ Autor

Andrés Fernando Mena
Aprendiz en desarrollo Backend Java | Programa ONE - Oracle Next Education


