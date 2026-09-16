# TicketBookingSystem
A movie ticket booking application built using Java, Spring Boot, Spring Security and MySQL.
# 🎬 TicketBooking 

A backend application inspired by BookMyShow, developed using **Java and Spring Boot**. The project provides REST APIs for managing movies, theatres, screens, seats, shows, users, and movie ticket bookings.

## 🚀 Features

* 👤 User Management
* 🎬 Movie Management
* 🏢 Theatre Management
* 🖥️ Screen Management
* 💺 Seat Management
* 🕐 Show Management
* 🎟️ Movie Ticket Booking
* 📋 Booking Management
* 🔎 Movie Search
* 🗄️ MySQL Database Integration
* 🌐 RESTful APIs
* 🧪 API Testing with Postman

## 🛠️ Technologies Used

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **Spring Security**
* **MySQL**
* **Maven**
* **Postman**
* **Git & GitHub**

## 🏗️ Architecture

The project follows a layered architecture:

```text
Client
  ↓
Controller
  ↓
Service
  ↓
Repository
  ↓
MySQL Database
```

### Layers

**Controller**

* Handles HTTP requests.
* Provides REST API endpoints.

**Service**

* Contains the application's business logic.

**Repository**

* Handles database operations.

**Entity**

* Represents the application's database entities.

## 📂 Main Modules

```text
User
Movie
Theatre
Screen
Seat
Show
Booking
```

### Movie

The movie module provides functionality to:

* Add movies
* View movies
* Search movies
* Update movie details
* Delete movies

### Theatre

The theatre module manages:

* Theatre details
* Screens
* Seats
* Theatre-related information

### Shows

The show module manages:

* Movie shows
* Show timings
* Screen allocation
* Movie-theatre relationships

### Booking

The booking module manages:

* Seat selection
* Ticket booking
* Booking details
* User booking information

## 🗄️ Database

The project uses **MySQL** for storing application data.

The database contains information related to:

```text
Users
Movies
Theatres
Screens
Seats
Shows
Bookings
```

Relationships between entities are managed using Spring Data JPA.

## 📡 REST APIs

The application provides REST APIs for different modules.

```text
User APIs
Movie APIs
Theatre APIs
Screen APIs
Seat APIs
Show APIs
Booking APIs
```

The APIs can be tested using **Postman**.

## 🧪 API Testing

Postman is used to test the application's REST APIs.

Example workflow:

```text
1. Create / Register User
        ↓
2. View Movies
        ↓
3. Search Movie
        ↓
4. Select Theatre
        ↓
5. Select Show
        ↓
6. Check Available Seats
        ↓
7. Select Seats
        ↓
8. Book Tickets
        ↓
9. View Booking Details
```

## ⚙️ How to Run

### 1. Clone the Repository

```bash
git clone <YOUR_REPOSITORY_URL>
```

### 2. Open the Project

Open the project using IntelliJ IDEA, Eclipse, or another Java IDE.

### 3. Configure MySQL

Create a database in MySQL:

```sql
CREATE DATABASE bookmyshow;
```

Configure your database details in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookmyshow
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
```

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run the Application

```bash
mvn spring-boot:run
```

The application will run on:

```text
http://localhost:8080
```

## 📌 Project Highlights

* Developed RESTful APIs using Spring Boot.
* Implemented layered architecture using Controller, Service, and Repository layers.
* Integrated MySQL database.
* Implemented movie, theatre, show, seat, and booking management.
* Tested APIs using Postman.
* Used Git and GitHub for version control.

## 🔮 Future Improvements

* Online payment integration
* Email booking confirmation
* Movie ratings and reviews
* Real-time seat availability
* Admin dashboard
* Frontend integration
* Deployment to cloud

 
