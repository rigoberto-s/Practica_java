# 🎵 MusicVault - Contexto General, Arquitectura y Estado del Proyecto

> **Documento de Contexto y Transferencia para Continuar el Proyecto**  
> *Diseñado para que cualquier desarrollador o asistente de IA retome el trabajo exactamente donde lo dejamos sin perder nada de contexto.*

---

## 👤 1. Sobre el Estudiante y la Dinámica de Trabajo

* **Perfil:** Rigoberto, estudiante de TICs (Tecnologías de la Información y Comunicación) en el área de **Desarrollo de Software**.
* **Estilo de aprendizaje:** Le apasiona entender el **porqué** de las cosas ("la magia detrás de Spring Boot"), no solo copiar código.
* **⚠️ REGLA DE ORO - NO TOCAR EL CÓDIGO DIRECTAMENTE:** 
  * **La IA NO debe editar ni escribir directamente en los archivos del proyecto.** 
  * La IA explica, enseña y muestra los bloques de código en el chat.
  * **Rigoberto es quien escribe, crea y edita los archivos en su editor** para aprender haciendo y practicar la memoria muscular.
* **Ritmo de trabajo:** **Paso a paso, con calma y uno por uno**. 
  * Un solo archivo o concepto a la vez. 
  * Explicar cada anotación, línea o concepto antes de avanzar. 
  * Esperar a que Rigoberto diga que lo escribió o pregunte dudas antes de pasar al siguiente archivo. Nunca abrumar con varios pasos a la vez.
* **Comentarios especiales en el código (`//?`):** Rigoberto deja comentarios de color azul con `//?` para marcar temas que entendió pero que desea practicar o profundizar al finalizar el proyecto. **Respetar y conservar siempre estos comentarios.**
* **Idioma del proyecto:** **100% Inglés** para nombres de paquetes, clases, variables, métodos, tablas y endpoints (sin mezclar con español).

---

## 📚 2. Repositorios de Referencia

1. **`Curso_java/Spring boot Miguel/tareas`**:
   * Proyecto base tomado de un curso con entidades `Usuario`, `Tarea`, `Tipo`.
   * Sirve de guía conceptual para relaciones JPA y métodos de consulta personalizados (Derived Query Methods).
2. **`Practicas_java/Practicas de springboot/prestamos`**:
   * Práctica previa con entidades `Autor`, `Libro`, `Prestamo`, `Usuario`.
   * Sirve de guía para la estructura de Services, Controllers y buenas prácticas de inyección.

---

## 🎧 3. ¿De qué trata la aplicación (`musicvault`)?

Es una API REST para gestionar un baúl o bóveda musical personal:
* **`User`**: Usuarios registrados en la plataforma.
* **`Genre`**: Catálogo de géneros musicales (Rock, Pop, Jazz, etc.).
* **`Song`**: Canciones agregadas por los usuarios, asociadas a un género, con atributos como duración, fecha de adición y si está marcada como favorita.

### 🛠️ Stack Tecnológico
* **Lenguaje:** Java 25 (OpenJDK).
* **Framework:** Spring Boot 4.1.1 (Maven).
* **Módulos:** Spring Data JPA, Spring Web MVC, PostgreSQL, Lombok, DevTools.
* **Arquitectura:** **Package-by-Feature** (`com.practica.musicvault.features.<feature>`).

---

## 🏗️ 4. Reglas de Arquitectura y Buenas Prácticas Establecidas

1. **Inyección de dependencias:** Siempre por **constructor** con campos `private final`, sin usar `@Autowired` en atributos.
2. **Lombok en Entidades JPA:**
   * **No usar `@Data` en entidades:** Evita bucles infinitos en `@EqualsAndHashCode` y `@ToString` cuando hay relaciones `@ManyToOne`.
   * **Se usa:** `@Getter`, `@Setter`, `@NoArgsConstructor`, `@AllArgsConstructor`.
3. **Nombres en Java vs SQL:**
   * En Java siempre se usa **camelCase** (`userId`, `addDate`).
   * En base de datos se mapea a **snake_case** (`user_id`, `add_date`).

---

## 📦 5. Estructura y Progreso Actual

```text
com.practica.musicvault
└── features
    ├── genres
    │   ├── Genre.java                      (Entidad)
    │   ├── GenreRepository.java            (Repositorio)
    │   ├── GenreService.java               (Interfaz del Servicio)
    │   ├── GenreServiceImplements.java     (Implementación)
    │   └── GenreController.java            (En proceso / recién propuesto)
    │
    ├── users
    │   ├── User.java                       (Entidad)
    │   ├── UserRepository.java             (Repositorio)
    │   ├── UserService.java                (Interfaz del Servicio)
    │   └── UserServiceImplement.java       (Implementación)
    │
    └── songs
        ├── Song.java                       (Entidad con relaciones @ManyToOne a User y Genre)
        ├── SongRepository.java             (Repositorio con consultas derivadas)
        ├── SongService.java                (Interfaz del Servicio)
        └── SongServiceImplement.java       (Implementación)
```

---

## 🧠 6. Dudas y Conceptos Clave ya Aclarados

1. **¿Por qué `findById(id)` usa `.orElse(null)` y `findByUsername(...)` no?**
   * `findById` viene de `JpaRepository` y devuelve un `Optional<T>`. Spring Boot te obliga a desempaquetar la caja porque al buscar por clave primaria es muy común que no exista el registro.
   * `findByUsername` fue definido directamente para devolver `User`. Si no lo encuentra, Spring automáticamente devuelve `null`.
2. **`findBy...` vs `findAllBy...` en repositorios:**
   * Si el tipo de retorno es `List<T>`, ambas expresiones hacen exactamente lo mismo. Spring genera un `SELECT` que trae todos los registros coincidentes.
3. **Advertencia de Lombok en VS Code ("Can't initialize javac processor..."):**
   * Es una advertencia visual de la extensión de Java de VS Code por compatibilidad interna de classloader con Java 25.
   * **El proyecto compila al 100% con Maven (`BUILD SUCCESS`).**

---

## 🎯 7. ¿En qué punto exacto estamos y qué sigue?

* **Punto actual:** Se terminaron al 100% las 3 entidades, los 3 repositorios y los 3 servicios.
* **Siguiente paso:** Desarrollar los **Controladores (Controllers)** uno por uno con calma:
  1. Revisar y confirmar `GenreController.java` (`GET`, `POST`, `DELETE /{id}`).
  2. Crear `UserController.java`.
  3. Crear `SongController.java` (incluyendo endpoints para los filtros por usuario, género, fecha y favoritos).
  4. Pruebas con Postman / endpoints.
  5. Siguiente fase: DTOs, validaciones (`@Valid`) y manejo global de excepciones.
