# Contexto del proyecto Melody

## Proyectos

El proyecto nuevo en el que estamos trabajando es:

```text
/home/rigoberto/Documentos/GitHub/Practica_java/Practicas de springboot/melody
```

El proyecto anterior queda intacto como referencia:

```text
/home/rigoberto/Documentos/GitHub/Practica_java/Practicas de springboot/musicvault
```

En el proyecto anterior existe `CONTEXTO_PROYECTO.md`, que contiene decisiones, dudas y contexto previo.

## Forma de trabajo

- Las explicaciones son en español.
- El código, clases, paquetes, variables, endpoints y tablas usan nombres en inglés.
- Rigoberto escribe y modifica los archivos.
- La IA no edita directamente el código.
- Las clases sencillas pueden entregarse completas en un solo bloque.
- Los métodos grandes o conceptos complejos se explican por partes.
- Después de cada archivo se revisa el código.
- Se ejecuta Maven antes de avanzar cuando corresponde.
- Se conservan los comentarios `//?`.
- No se agregan funcionalidades innecesarias.
- La dificultad debe mantenerse cercana al proyecto del curso `tareas`.
- Primero se construye una versión básica; después se agregan validaciones, DTOs y excepciones como mejoras.

## Configuración del proyecto

- Spring Boot `4.1.2`
- Java `25`
- Maven
- Spring Web MVC
- Spring Data JPA
- PostgreSQL
- Lombok
- Spring Boot DevTools

Paquete principal:

```java
com.practica.melody
```

Clase principal:

```java
MelodyApplication
```

## Base de datos

```text
Base de datos: melody_db
Host: localhost
Puerto: 5432
Usuario: root
```

La conexión ya fue probada correctamente.

`src/main/resources/application.properties` contiene:

```properties
spring.application.name=melody

spring.datasource.url=jdbc:postgresql://localhost:5432/melody_db
spring.datasource.username=root
spring.datasource.password=<configurada localmente>

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

La contraseña no debe subirse a GitHub. Más adelante se moverá a una variable de entorno.

## Arquitectura

Usamos `package-by-feature`:

```text
features
├── genres
├── users
└── songs
```

Cada funcionalidad tendrá su propia entidad, repositorio, servicio, implementación y controller.

## Módulo `genres`

El módulo básico está terminado en:

```text
src/main/java/com/practica/melody/features/genres
```

Archivos:

- `Genre.java`
- `GenreRepository.java`
- `GenreService.java`
- `GenreServiceImplementation.java`
- `GenreController.java`

### Entidad `Genre`

- Tabla: `genres`
- Campos:
  - `Integer id`
  - `String name`
- `name` es único, obligatorio y tiene máximo de 50 caracteres.
- Usa Lombok:
  - `@Getter`
  - `@Setter`
  - `@NoArgsConstructor`
  - `@AllArgsConstructor`

### Endpoints

```text
GET    /api/genres
GET    /api/genres/{id}
POST   /api/genres
DELETE /api/genres/{id}
```

Se probaron en Bruno y funcionan.

### Diferencia entre rutas

```text
GET /api/genres?id=2
```

Llama al endpoint que obtiene todos los géneros y puede devolver `[]` con `200 OK`.

```text
GET /api/genres/2
```

Busca específicamente el ID `2` y devuelve `404 Not Found` si no existe.

### Estado temporal del DELETE

El `DELETE` actual devuelve `204 No Content` incluso si el ID no existe. Se decidió dejarlo así temporalmente porque todavía estamos trabajando en la versión básica.

En una mejora posterior, el servicio devolverá si el registro existía y el controller responderá `404` cuando corresponda.

## Módulo `users`

Ubicación:

```text
src/main/java/com/practica/melody/features/users
```

Ya existen y fueron revisados:

- `User.java`
- `UserRepository.java`
- `UserService.java`
- `UserServiceImplementation.java`

### Entidad `User`

Campos:

```text
id
username
password
name
```

La contraseña actualmente es un `String` normal únicamente para practicar. En una aplicación real se cifrará con BCrypt cuando lleguemos a seguridad.

### Repositorio

Tiene:

```java
User findByUsername(String username);
```

También hereda métodos de `JpaRepository`.

### Servicio

Tiene:

```java
List<User> getAllUsers();
User getUserById(Integer id);
User getUserByUsername(String username);
User saveUser(User user);
void deleteUser(Integer id);
```

La implementación usa:

- `findAll()`
- `findById(id).orElse(null)`
- `findByUsername(username)`
- `save(user)`
- `delete(user)`

Posteriormente se puede mejorar el uso de `Optional`, las validaciones y las respuestas para IDs inexistentes.

## Punto exacto donde quedamos

Se indicó crear:

```text
src/main/java/com/practica/melody/features/users/UserController.java
```

El siguiente paso es confirmar si ya fue escrito. Después:

1. Revisar `UserController.java`.
2. Ejecutar:

   ```bash
   ./mvnw test
   ```

3. Probar los endpoints de usuarios en Bruno.
4. Confirmar que `Genre` y `User` funcionan.
5. Continuar con la entidad `Song`, que tendrá relaciones con `User` y `Genre`.
6. Explicar las relaciones `@ManyToOne` con calma, porque será un concepto más complejo.

Todavía no avanzar a DTOs, validaciones, excepciones globales ni seguridad hasta completar el CRUD básico.
