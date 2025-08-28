# 🐾 Vet App - Clínica Veterinaria

Este proyecto es una aplicación backend para la gestión de una **clínica veterinaria**, desarrollada con **Spring Boot** y basada en una arquitectura multicapa.  
Permite administrar dueños de mascotas (**Owner**) y mascotas (**Pet**) con operaciones CRUD a través de endpoints REST.

---

## 🚀 Tecnologías utilizadas

- **Java 17**
- **Spring Boot** (con Spring Initializr)
- **Maven** (gestor de dependencias)
- **Spring Data JPA** (para acceso a datos)
- **MySQL** (base de datos relacional)
- **Docker & Docker Compose** (para contenerización y despliegue)
- **Postman** (para pruebas de los endpoints REST)
- **XAMPP** (para pruebas locales con Postman y administrar base de datos desde phpMyAdmin)

---

## 📂 Arquitectura del proyecto

El proyecto sigue una **arquitectura multicapa**:

- **Model (`model/`)**  
  Contiene las entidades principales del dominio:
  - `Owner`
  - `Pet`

- **DTO (`dto/`)**  
  Objeto de transferencia de datos para estructurar las respuestas.
  Devuelve en formato plano un conjunto de datos.

- **Repository (`repository/`)**  
  Interfaces que extienden de JPA Repository para interactuar con la base de datos:
  - `IOwnerRepository`
  - `IPetRepository`

- **Service (`service/`)**  
  Contiene la lógica de negocio:
  - Interfaces: `IOwnerService`, `IPetService`
  - Implementaciones: `OwnerService`, `PetService`

- **Controller (`controller/`)**  
  Define los endpoints REST para la interacción con la aplicación:
  - `OwnerController`
  - `PetController`

---

## 📌 Funcionalidades principales

- **Owner**
  - Crear un dueño
  - Obtener lista de dueños
  - Obtener un dueño por ID
  - Editar un dueño existente
  - Eliminar un dueño

- **Pet**
  - Crear una mascota
  - Obtener lista de mascotas
  - Obtener una mascota por ID
  - Obtener los datos en formato plano de una mascota y su dueño (DTO)
  - Buscar mascotas en base a su especie (dog, cat, etc)
  - Editar datos de una mascota
  - Eliminar una mascota

---

## 🔧 Configuración y ejecución con repositorio

```bash

### 1. Clonar el repositorio

git clone https://github.com/fiorelladifiore/vet_app.git
cd vet_app/clinicaVet

2. Configuración de base de datos

En application.properties configurar los datos de conexión a MySQL o usando variables de entorno:

spring.datasource.url=jdbc:mysql://localhost:3306/veterinaria?useSSL=false&serverTimezone=UTC&createDatabaseIfNotExist=true
spring.datasource.username=admin
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update


3. Construir y ejecutar con Maven
mvn clean install
mvn spring-boot:run

4. Ejecutar con Docker
-docker-compose build
-docker-compose up

4.1 O, sin ejecutar en Docker, usar un proveedor de servidor web + administrador de base de datos (Por ejemplo Xampp)

📮 Endpoints principales
Los endpoints fueron probados con Postman. Se recomienda ejecutar manualmente las peticiones a las rutas listadas abajo.

Owner

GET /owners → Listar todos los dueños

GET /owner/{id} → Obtener un dueño por ID

POST /owner/save → Crear un nuevo dueño

PUT /owner/edit/{id} → Editar un dueño existente

DELETE /owner/delete{id} → Eliminar un dueño

Pet

GET /pets → Listar todas las mascotas

GET /pet/{id} → Obtener una mascota por ID

POST /pet/save → Crear una nueva mascota

PUT /pet/edit/{id} → Editar una mascota existente

DELETE /pet/delete/{id} → Eliminar una mascota

GET /getInfo/{id} → Obtener los datos en formato plano de una mascota y su dueño (DTO)

GET /pet/getSpecies/{species} → Buscar mascotas en base a su especie (dog, cat, etc)

📌 Futuras mejoras

Gestión de turnos/vacunas.

Relación entre dueño y mascotas en las consultas.

Seguridad con Spring Security y JWT.

Documentación de la API con Swagger.

👩‍💻 Autora

Proyecto desarrollado por Fiorella Di Fiore.
