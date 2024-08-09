# Design Principles and Low-Level Design in Backend Architecture

## Table of Contents

- [1. SOLID Principles](#1-solid-principles)
  - [Single Responsibility Principle (SRP)](#single-responsibility-principle-srp)
  - [Open/Closed Principle (OCP)](#openclosed-principle-ocp)
  - [Liskov Substitution Principle (LSP)](#liskov-substitution-principle-lsp)
  - [Interface Segregation Principle (ISP)](#interface-segregation-principle-isp)
  - [Dependency Inversion Principle (DIP)](#dependency-inversion-principle-dip)
- [2. DRY Principle](#2-dry-principle)
- [3. YAGNI Principle](#3-yagni-principle)
- [4. KISS Principle](#4-kiss-principle)
- [Low-Level Design in Backend Architecture](#low-level-design-in-backend-architecture)
  - [Key Components](#key-components)
    - [Class Design and OOP Principles](#class-design-and-oops-principles)
    - [Data Structures](#data-structures)
    - [Database Interaction](#database-interaction)
    - [API Design](#api-design)
    - [Error Handling and Logging](#error-handling-and-logging)
    - [Security Implementation](#security-implementation)
    - [Concurrency and Multithreading](#concurrency-and-multithreading)
    - [Design Patterns](#design-patterns)
    - [Testing](#testing)
    - [Deployment](#deployment)
  - [Example: User Management System](#example-user-management-system)

## 1. SOLID Principles

### Single Responsibility Principle (SRP)

A class should have only one reason to change, meaning it should have one job or responsibility.

**Example:**

```java
// Violation of SRP
class Book {
    String title;
    String author;
    Date publicationDate;
    // Methods to handle notifications, database operations, and authentication
}

// Following SRP
class User {
    private String name;
    private String email;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

class AuthenticationRepository {
    public void authenticateUser() {
        // Authentication logic
    }
}
```

### Open/Closed Principle (OCP)

Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

**Example**

```java
// Violation of OCP
class PaymentSystem {
    public boolean processCreditCard() {}
    public boolean processUPI() {}
    public boolean processInternetBanking() {}
}

// Following OCP
abstract class PaymentProcessor {
    abstract boolean process();
}

class CreditCardProcessor extends PaymentProcessor {
    boolean process() {
        // Logic for credit card processing
    }
}

class UPIProcessor extends PaymentProcessor {
    boolean process() {
        // Logic for UPI processing
    }
}

class InternetBankingProcessor extends PaymentProcessor {
    boolean process() {
        // Logic for internet banking processing
    }
}

class DebitCardProcessor extends PaymentProcessor {
    boolean process() {
        // Logic for debit card processing
    }
}

```

### Liskov Substitution Principle (LSP)

Objects of a superclass should be replaceable with objects of a subclass without affecting the functionality of the program.

```java
// Violation of LSP
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Ostrich extends Bird {
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}

// Following LSP
abstract class Bird {
    public abstract void move();
}

class FlyingBird extends Bird {
    public void move() {
        System.out.println("Flying");
    }
}

class Ostrich extends Bird {
    public void move() {
        System.out.println("Running");
    }
}

```

### Interface Segregation Principle (ISP)

No client should be forced to depend on methods it doesn't use.

```java
// Violation of ISP
interface Worker {
    void code();
    void eat();
}

class Developer implements Worker {
    void code() {
        System.out.println("Coding");
    }
    void eat() {
        System.out.println("Eating");
    }
}

class ChatGPT implements Worker {
    void code() {
        System.out.println("Coding");
    }
    void eat() {
        throw new UnsupportedOperationException();
    }
}

// Following ISP
interface Coder {
    void code();
}

interface Eater {
    void eat();
}

class Developer implements Coder, Eater {
    void code() {
        System.out.println("Coding");
    }
    void eat() {
        System.out.println("Eating");
    }
}

class ChatGPT implements Coder {
    void code() {
        System.out.println("Coding");
    }
}

```

### Dependency Inversion Principle (DIP)

High-level modules should not depend on low-level modules. Both should depend on abstractions.

```java
// Violation of DIP
class Light {
    public void turnOn() {
        System.out.println("Light turned on");
    }
}

class Switch {
    private Light light;

    public Switch(Light light) {
        this.light = light;
    }

    public void operate() {
        light.turnOn();
    }
}

// Following DIP
interface Switchable {
    void turnOn();
}

class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light turned on");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan turned on");
    }
}

class Switch {
    private Switchable switchable;

    public Switch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void operate() {
        switchable.turnOn();
    }
}

public class Main {
    public static void main(String[] args) {
        Switchable switchableLight = new Light();
        Switch lightSwitch = new Switch(switchableLight);
        lightSwitch.operate();

        Switchable switchableFan = new Fan();
        Switch fanSwitch = new Switch(switchableFan);
        fanSwitch.operate();
    }
}

```

## 2. DRY Principle

Don't Repeat Yourself: Avoid code duplication by abstracting out common code into functions or classes.

```java
class User {
    private String name;
    private String email;

    // Getters and setters

    // Method to be implemented only when required
    public String convertClassToString() {
        // TODO: implement it when required
    }
}

```

## 3. YAGNI Principle

You Aren't Gonna Need It Don't implement features until they are necessary.

## 4. KISS Principle

Keep It Simple, Stupid Write simple and straightforward code. Avoid unnecessary complexity

# Low-Level Design in Backend Architecture

## Key Components

- **Class Design and OOP Principles**: Utilize classes, inheritance, polymorphism, and encapsulation to structure your system effectively.
- **Data Structures**: Select appropriate data structures (e.g., arrays, lists, hash maps) for efficient data management.
- **Database Interaction**: Implement SQL and NoSQL queries, and use Object-Relational Mapping (ORM) tools for database operations.
- **API Design**: Design API endpoints using proper HTTP methods and status codes.
- **Error Handling and Logging**: Develop robust error handling and logging mechanisms to ensure system reliability.
- **Security Implementation**: Implement authentication and authorization mechanisms to secure the system.
- **Concurrency and Multithreading**: Efficiently manage concurrent processes and threads.
- **Design Patterns**: Apply design patterns such as Singleton, Factory, and Observer to solve common design problems.
- **Testing**: Perform Unit Tests (UTs), Integration Tests (ITs), End-to-End (E2E) testing, and Test-Driven Development (TDD).
- **Deployment**: Utilize tools like Docker to streamline the deployment process.

## Example: User Management System

- **User Class**: Define fields such as `name`, `password`, `email`, and methods like `login`, `updateProfile`, `forgotPassword`.
- **Session Management**: Manage user sessions using a hash map.
- **Database Interaction**: Use SQL queries to retrieve user passwords from the database.
- **API Endpoints**: Define endpoints such as `/register`, `/login`, and `/updateProfile`.
- **Error Handling**: Implement custom exceptions and logging for different log levels (info, error, warn).
- **Security**: Include input validation on the registration form and use JWT-based authentication.
- **Concurrency**: Handle tasks like sending emails asynchronously to improve system performance.
- **Design Patterns**: Implement the Singleton pattern for managing user sessions.
- **Testing**: Conduct unit tests for the user class and end-to-end tests for user workflows.
- **Deployment**: Deploy the application using Docker for containerization.
