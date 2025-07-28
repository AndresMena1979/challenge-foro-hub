Practicando Spring Boot: Challenge Foro Hub

🌐 API Rest - Challenge Foro Hub

Este proyecto es una API REST desarrollada en Java con Spring Boot, como parte de mi formación en el programa ONE - Oracle Next Education de Alura Latam y Oracle. La aplicación simula un sistema de foros de discusión, permitiendo gestionar tópicos (temas de debate) y usuarios, implementando las mejores prácticas de desarrollo backend.

✨ Funcionalidades principales

✍️ Registro de nuevos tópicos (con validación de unicidad en título y mensaje)

✉️ Listado de todos los tópicos registrados

❌ Eliminación de tópicos por ID

🔒 Autenticación de usuarios con JWT (Login)

🔐 Seguridad de endpoints con Spring Security y filtros

⚖️ Manejo centralizado de errores y respuestas personalizadas

📃 Migraciones automáticas de base de datos con Flyway

🛠️ Tecnologías y herramientas utilizadas

Java 21

Spring Boot 3

Spring Data JPA

Spring Security con JWT

Flyway (para migraciones)

MySQL como base de datos relacional

HikariCP (conexionado eficiente a la BD)

Insomnia para pruebas de endpoints

Swagger/OpenAPI para documentación

📁 Estructura del proyecto

├── main/
│   ├── java/com.aluracursos.challenge_foro_hub/
│   │   ├── controller/ # Controladores REST (TopicoController, UsuarioController)
│   │   ├── domain/     # Entidades y registros DTO (Topico, Usuario, etc.)
│   │   ├── infra/      # Seguridad, Excepciones, Configuración (TokenService, etc.)
│   │   └── repository/ # Repositorios JPA
│   └── resources/
│       ├── application.properties # Config BD y seguridad
│       └── db/migration # Scripts de migración Flyway

🔧 Ejecución del proyecto

Clona el repositorio:

git clone https://github.com/AndresMena1979/Challenge-Foro-Hub.git
cd Challenge-Foro-Hub

Configura las propiedades de tu base de datos en application.properties

Ejecuta la aplicación desde tu IDE o usando Maven:

./mvnw spring-boot:run

Realiza peticiones usando Insomnia o Postman.

🧰 Lecciones y aprendizajes

Durante este proyecto reforcé conocimientos clave del desarrollo backend:

Diseño de APIs REST seguras y bien estructuradas

Implementación de autenticación y autorización con JWT y Spring Security

Validaciones robustas de datos y gestión de errores personalizados

Uso de migraciones automáticas para mantener consistencia en la base de datos

Principios SOLID y separación de responsabilidades en la arquitectura

📊 Estado del proyecto

☑️ Finalizado y funcional

Próximas mejoras:

👀 Paginación y ordenamiento de tópicos

📈 Estadísticas de actividad de usuarios

🌐 Deploy en nube (Railway o Render)

🌟 Autor

Andres Fernando MenaAprendiz en desarrollo Backend Java | ONE - Oracle Next EducationLinkedIn | GitHub

📄 Licencia

Este proyecto fue desarrollado con fines educativos y está bajo la licencia MIT.
