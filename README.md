# Expense Tracker

A simple web-based expense tracking application built with Spring Boot and Thymeleaf.

## Features

- Add, view, and delete expenses
- Categorize expenses
- Track expense amounts with dates
- Simple and intuitive user interface

## Technologies Used

- Java 17
- Spring Boot 3.1.5
- Spring Data JPA
- H2 Database
- Thymeleaf
- HTML/CSS/JavaScript

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven

### Running the Application

1. Clone the repository
```bash
git clone [repository-url]
```

2. Navigate to the project directory
```bash
cd expense-tracker
```

3. Run the application using Maven
```bash
mvn spring-boot:run
```

4. Access the application at http://localhost:8080

## Database

The application uses H2 in-memory database. You can access the H2 console at http://localhost:8080/h2-console with these credentials:
- JDBC URL: jdbc:h2:mem:expensedb
- Username: sa
- Password: (empty)