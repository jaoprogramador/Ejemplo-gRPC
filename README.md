# 🍲 Sistema de Gestión de Recetas y Restaurantes (Microservicios gRPC)

Este proyecto es una arquitectura de microservicios desarrollada con **Spring Boot 4.0** que demuestra la comunicación eficiente entre servicios mediante **gRPC**.

## 🏗️ Arquitectura del Sistema

El sistema se divide en dos microservicios principales:

1.  **Microservicio de Restaurantes**: Gestiona la información de los establecimientos. Actúa como **Servidor gRPC**.
2.  **Microservicio de Recetas**: Gestiona los platos y sus ingredientes. Actúa como **Cliente gRPC** para obtener detalles del restaurante asociado a cada receta.



---

## 🛠️ Tecnologías Utilizadas

* **Java 17**
* **Spring Boot 4.0.x**
* **gRPC & Protocol Buffers (proto3)**
* **Spring Data JPA**
* **H2 Database** (Base de datos en memoria)
* **Maven**

---

## 🚀 Configuración y Ejecución

### Requisitos Previos
* JDK 17 o superior.
* Maven instalado.
* Puerto `8080` (Recetas) y `9090` (gRPC Restaurantes) disponibles.

### Instalación
1. Clona el repositorio:
   ```bash
   git clone [https://github.com/tu-usuario/nombre-del-repo.git](https://github.com/tu-usuario/nombre-del-repo.git)
   
   
## Endpoints:
* http://localhost:8081/api/v1/restaurantes
* http://localhost:8080/api/v1/recetas
* http://localhost:8080/api/v1/recetas/complete/3
==RECETAS
{
    "nombre": "Lasagna della Nonna",
    "ingredientes": "Pasta fresca, carne de ternera, bechamel, queso parmesano, tomate natural",
    "restauranteId": 1,
    "precioSugerido": 18,
    "origen": "Italiana"
}
{
    "nombre": "Risotto ai Funghi",
    "ingredientes": "Arroz arborio, setas de temporada, caldo de verduras, mantequilla, cebolla",
    "restauranteId": 1,
    "precioSugerido": 22,
    "origen": "Italiana"
}
{
    "nombre": "Spaghetti alla Carbonara",
    "ingredientes": "Espaguetis, guanciale, yema de huevo, queso pecorino romano, pimienta negra",
    "restauranteId": 1,
    "precioSugerido": 15,
    "origen": "Italiana"
}

{
    "nombre": "Pato Pekín (Laqueado)",
    "ingredientes": "Pato asado, pepino, cebolleta, tortillas de trigo, salsa hoisin",
    "restauranteId": 4,
    "precioSugerido": 35,
    "origen": "China (Pekín)"
}
{
    "nombre": "Pollo Kung Pao",
    "ingredientes": "Pechuga de pollo, cacahuetes, chiles secos, pimiento, salsa agripicante",
    "restauranteId": 4,
    "precioSugerido": 14,
    "origen": "China (Sichuan)"
}
{
    "nombre": "Surtido de Dim Sum",
    "ingredientes": "Pasta de arroz, gambas, cerdo, jengibre, brotes de bambú, salsa de soja",
    "restauranteId": 4,
    "precioSugerido": 12,
    "origen": "China (Cantonesa)"
}
==RESTAURANTE
{
    "nombre": "Trattoria da Luigi",
    "direccion": "Vía Augusta, Barcelona",
    "especialidad": "Pasta Artesanal",
    "estado": 1
}
{
    "nombre": "Asador Elkano",
    "direccion": "Getaria, Gipuzkoa",
    "especialidad": "Rodaballo a la brasa",
    "estado": 1
}
{
    "nombre": "La Cantina del Sol",
    "direccion": "Calle Mayor, Madrid",
    "especialidad": "Tacos al Pastor",
    "estado": 1
}
{
    "nombre": "Gran Muralla China",
    "direccion": "Calle Correos, Portugalete",
    "especialidad": "Pollo Kung Pao",
    "estado": 1
}