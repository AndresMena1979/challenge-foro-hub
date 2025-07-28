Challenge Foro Hub

Aplicación desarrollada como parte de mi formación en el programa ONE - Oracle Next Education de Alura Latam y Oracle. Este proyecto consiste en una API RESTful creada con Spring Boot, enfocada en la gestión de tópicos de discusión entre usuarios, simulando un foro. El proyecto está diseñado con buenas prácticas de arquitectura, seguridad y persistencia de datos.

Tecnologías y herramientas utilizadas

Java 21

Spring Boot 3.3

Spring Data JPA

Spring Security con JWT

Flyway para migraciones de base de datos

MySQL

Maven

Insomnia (para pruebas de la API)

Características principales

✅ Gestión de tópicos

Crear, listar, actualizar y eliminar tópicos.

Validación para evitar títulos y mensajes duplicados.

✅ Gestión de usuarios

Registro y eliminación de usuarios.

Asociación de tópicos a usuarios mediante llaves foráneas.

✅ Seguridad con JWT

Autenticación mediante token JWT.

Protección de endpoints mediante filtros personalizados de seguridad.

Manejo de errores de autenticación y autorización.

✅ Migraciones de base de datos

Creación de tablas y restricciones con Flyway.

Reseteo de IDs automáticos tras eliminación de registros.

✅ Validaciones y manejo de errores

Validaciones con anotaciones como @NotBlank, @NotNull, @Email, etc.

Control global de errores con clases personalizadas.

Respuestas HTTP adecuadas: 201 (Creado), 400 (Bad Request), 404 (No encontrado), etc.

✅ Documentación con Swagger (SpringDoc)

Integración de Swagger UI.

Configuración de esquemas de seguridad para enviar JWT desde la interfaz.

Ejecución del proyecto

Clonar el repositorio:

git clone https://github.com/tuusuario/challenge-foro-hub.git

Configurar el archivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/challenge_foro_hub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
api.security.secret=clave_secreta_para_jwt

Ejecutar la aplicación desde tu IDE o usando Maven:

./mvnw spring-boot:run

Acceder a la documentación Swagger en:

http://localhost:8080/swagger-ui.html

Lecciones aprendidas

Diseño de APIs RESTful limpias y seguras

Implementación de seguridad avanzada con JWT

Manejo de errores efectivo y validaciones robustas

Uso de migraciones para gestión de base de datos en entornos reales

Buenas prácticas en arquitectura backend con Spring Boot

Estado del proyecto

✨ Proyecto finalizado, con posibilidad de extensión
