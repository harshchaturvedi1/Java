# Class and Object in Java

In Java, a class is a blueprint or template for creating objects. It defines the properties (fields) and behaviors (methods) that objects of that class will have. An object, on the other hand, is an instance of a class, representing a specific entity in a program.

## Class

A class in Java is declared using the `class` keyword followed by the class name. It can contain fields (variables) and methods (functions) to define the behavior and state of objects.

```java
public class MyClass {
    // Fields (variables)
    int myField;

    // Constructor
    public MyClass(int initialValue) {
        myField = initialValue;
    }

    // Method
    public void myMethod() {
        System.out.println("Value of myField: " + myField);
    }
}
```

- `MyClass` is a class declaration.
- `myField` is a field (variable) of the class.
- `MyClass` (int initialValue) is a constructor, used for initializing objects.
- `myMethod` () is a method of the class.

## Object

```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj = new MyClass(10);

        // Accessing fields and methods of the object
        obj.myMethod(); // Output: Value of myField: 10
    }
}

```

## Key Concepts

- Encapsulation: Classes encapsulate data (fields) and behavior (methods) into a single unit, providing a way to hide implementation details from the outside world.
- Constructor: A special method used for initializing objects. It has the same name as the class and no return type.
- Method: Functions defined within a class to perform certain actions or provide functionality.
- Instance Variables: Variables declared within a class, representing the state of individual objects.
- Instance Methods: Methods defined within a class, operating on the instance variables of objects.
