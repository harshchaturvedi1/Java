# Polymorphism in Java

Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows objects to be treated as instances of their superclass or interface, even if they are actually instances of their subclass. Polymorphism enables flexibility and code reuse by allowing objects of different types to be treated uniformly through a common interface.

## Types of Polymorphism

### 1. Compile-Time Polymorphism (Method Overloading)

Compile-time polymorphism, also known as static polymorphism, occurs when multiple methods with the same name but different parameter lists (method overloading) are defined within the same class. The appropriate method to be invoked is determined by the compiler based on the method signature.

````java
public class MyClass {
    public void display() {
        System.out.println("Display method without parameters");
    }

    public void display(String message) {
        System.out.println("Display method with parameter: " + message);
    }
}
### 2. Run-Time Polymorphism (Method Overriding)
Run-time polymorphism, also known as dynamic polymorphism, occurs when a method in a subclass overrides a method with the same signature in its superclass. The appropriate method to be invoked is determined at runtime based on the type of the object.

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
````

### Benefits of Polymorphism

- <b> Code Reusability: </b> Polymorphism promotes code reusability by allowing objects of different types to be treated uniformly through a common interface.
- <b> Flexibility: </b> Polymorphism enables flexible and extensible designs by allowing new subclasses to be added without modifying existing code.
- <b> Maintainability: </b> Polymorphism enhances code maintainability by promoting loose coupling and modular design.

### Conclusion

- Polymorphism is a powerful concept in Java that enables flexibility, code reuse, and maintainability in object-oriented programming. By supporting both compile-time and run-time polymorphism through method overloading and method overriding, Java developers can create more flexible, modular, and maintainable code.
