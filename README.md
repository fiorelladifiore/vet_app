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

```

📮 Endpoints principales
Los endpoints fueron probados con Postman. Se recomienda ejecutar manualmente las peticiones a las rutas listadas abajo.

Owner
---
GET /owners → Listar todos los dueños

<img width="1370" height="713" alt="Captura de pantalla 2025-08-28 085620" src="https://github.com/user-attachments/assets/bd8009c1-5b26-49c8-8a43-21067028d480" />

---
GET /owner/{id} → Obtener un dueño por ID

<img width="1366" height="544" alt="Captura de pantalla 2025-08-28 085856" src="https://github.com/user-attachments/assets/1f67e61d-9ba7-45e4-9658-ef124e9030c3" />

---
POST /owner/save → Crear un nuevo dueño
<img width="1377" height="587" alt="Captura de pantalla 2025-08-28 085212" src="https://github.com/user-attachments/assets/988e814e-1f38-4185-afd0-d3639ca83a21" />

---
PUT /owner/edit/{id} → Editar un dueño existente
<img width="1385" height="694" alt="Captura de pantalla 2025-08-28 085952" src="https://github.com/user-attachments/assets/6e69fef4-b0d5-4b27-bfc0-d0228a772b5f" />

---
DELETE /owner/delete{id} → Eliminar un dueño
<img width="1363" height="509" alt="Captura de pantalla 2025-08-28 090038" src="https://github.com/user-attachments/assets/84a1c2b7-ec8c-40a6-adb6-e9c3d558fadc" />

---
Pet
---

GET /pets → Listar todas las mascotas
<img width="1360" height="813" alt="Captura de pantalla 2025-08-28 090649" src="https://github.com/user-attachments/assets/25e51909-3dff-42b0-bdc1-d0b3eec780f8" />

---
GET /pet/{id} → Obtener una mascota por ID
<img width="1360" height="723" alt="Captura de pantalla 2025-08-28 091042" src="https://github.com/user-attachments/assets/7cbc66dc-6fde-4133-b14a-a2ecede7286e" />

---
POST /pet/save → Crear una nueva mascota
<img width="1371" height="561" alt="Captura de pantalla 2025-08-28 090509" src="https://github.com/user-attachments/assets/b533c442-c743-4b6a-8301-011dd022427d" />

---
PUT /pet/edit/{id} → Editar una mascota existente
<img width="1371" height="831" alt="Captura de pantalla 2025-08-28 090924" src="https://github.com/user-attachments/assets/1990a55f-118c-4e9e-90fb-8f498496f8cd" />

---
DELETE /pet/delete/{id} → Eliminar una mascota
<img width="1370" height="449" alt="Captura de pantalla 2025-08-28 091141" src="https://github.com/user-attachments/assets/b2de799c-8a93-48d2-8170-e7a28d3b6c56" />

---
GET /getInfo/{id} → Obtener los datos en formato plano de una mascota y su dueño (DTO)
<img width="1362" height="596" alt="Captura de pantalla 2025-08-28 091253" src="https://github.com/user-attachments/assets/341d3763-14df-4716-8799-65c1d4d25e41" />

---
GET /pet/getSpecies/{species} → Buscar mascotas en base a su especie (dog, cat, etc)
<img width="1357" height="795" alt="Captura de pantalla 2025-08-28 091324" src="https://github.com/user-attachments/assets/4e3affda-ed41-4a01-b9de-b16349671eda" />

---

📌 Futuras mejoras

Gestión de turnos/vacunas.

Relación entre dueño y mascotas en las consultas.

Seguridad con Spring Security y JWT.

Documentación de la API con Swagger.

👩‍💻 Autora

Proyecto desarrollado por Fiorella Di Fiore.
