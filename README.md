# Student Management Spring Boot

A simple **Student Management System** built using **Spring Boot, Spring Data JPA, Hibernate, and MySQL**. This project demonstrates the basics of developing a backend application with Spring Boot and performing database operations using JPA.

## 📌 About

This project is created to understand the fundamentals of **Spring Boot application development** and **database integration**.

It manages student information and demonstrates how Spring Boot can be used to create a structured backend application with entity classes, services, repositories, and database connectivity.

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* REST API
* Lombok
* IntelliJ IDEA

## 📚 Concepts Covered

* Spring Boot Basics
* Spring Data JPA
* Hibernate ORM
* Entity Mapping
* JPA Annotations
* CRUD Operations
* Database Connectivity
* Service Layer
* Repository Layer
* REST API Fundamentals
* Maven Project Management

## 📂 Project Structure

```text
Student-Management-Spring-Boot/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/springboot001/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── SpringBoot001Application.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## ⚙️ Features

* Add student information
* Retrieve student information
* Manage student records
* Store student data in MySQL
* Perform database operations using JPA and Hibernate
* Layered application structure

## 🗄️ Database Configuration

Create a MySQL database and configure the database details in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/shitalb11/Student-Management-Spring-Boot.git
```

### 2. Open the Project

Open the project in **IntelliJ IDEA** or any Java IDE that supports Maven.

### 3. Configure MySQL

Create the required database and update the database configuration in `application.properties`.

### 4. Run the Application

Run the main Spring Boot application:

```text
SpringBoot001Application.java
```

Or use Maven:

```bash
mvn spring-boot:run
```

### 5. Test the Application

Use a browser or **Postman** to test the available API endpoints.

## 🎯 Learning Objectives

This project helps in understanding:

* Spring Boot application structure
* Creating entities using JPA
* Working with Hibernate
* Connecting Spring Boot with MySQL
* Creating service and repository layers
* Performing CRUD operations
* Understanding REST APIs
* Managing dependencies using Maven

## 👩‍💻 Author

**Shital Bhosale**

GitHub: https://github.com/shitalb11

---

⭐ If you find this project useful, feel free to explore the repository.
