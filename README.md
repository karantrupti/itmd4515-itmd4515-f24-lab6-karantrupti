Lab 6 - EJB Service Layer
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
**Overview**
This project implements an Enterprise JavaBeans (EJB) service layer to perform CRUD operations for a domain model using Java Persistence API (JPA). It includes:

Stateless EJB components for business logic.
A Singleton EJB to seed the database with sample data.
Entity classes to map to the database.
Abstract Service for reusable CRUD operations.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
**Features**
Entity Classes:
Represent the domain model for Person, Product, and Order.

Stateless EJB Services:
PersonService, ProductService, and OrderService provide CRUD functionality.

Database Seeder:
DatabaseSeeder initializes the database with sample data and logs the details.

Persistence:
Configured with persistence.xml using JPA and H2 in-memory database.

Logging:
Configured with logging.properties for monitoring application actions.

src/
├── main/
│   ├── java/
│   │   ├── com/example/entity/
│   │   │   ├── Person.java
│   │   │   ├── Product.java
│   │   │   ├── Order.java
│   │   ├── com/example/service/
│   │   │   ├── AbstractService.java
│   │   │   ├── PersonService.java
│   │   │   ├── ProductService.java
│   │   │   ├── OrderService.java
│   │   ├── com/example/startup/
│   │   │   ├── DatabaseSeeder.java
│   ├── resources/
│   │   ├── META-INF/
│   │   │   ├── persistence.xml
│   ├── logging.properties


--------------------------------------------------------------------------------------------------------------------------------------------------------------------
