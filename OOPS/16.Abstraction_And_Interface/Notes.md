
# Abstract Classes and Interfaces in Java

## Abstract Class

- **Definition**: An abstract class in Java is a class that cannot be instantiated. It is meant to be subclassed and typically contains a combination of fully implemented methods and methods that must be implemented by subclasses (abstract methods).

- **Characteristics**:
  - **Abstract Methods**: Methods declared without an implementation (`abstract void methodName();`). These must be implemented by the subclass.
  - **Concrete Methods**: An abstract class can have concrete methods with full implementations that subclasses can inherit or override.
  - **Constructors**: Can have constructors, which are called during the instantiation of a subclass.
  - **Instance Variables**: Can have instance variables to maintain state.
  - **Inheritance**: A class can only inherit (extend) one abstract class, promoting a strict hierarchical relationship.
  - **Access Modifiers**: Abstract classes can have any access modifier (public, protected, or private).

- **Use Cases**:
  - When you want to share code among closely related classes.
  - When you want to define a common interface for subclasses but also provide common behavior.
  - When a class has some methods that must be implemented by subclasses and some that should be shared.

- **Example**:
```java
abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();
    
    // Concrete method (implementation provided)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    // Implementation of the abstract method
    void sound() {
        System.out.println("Bark");
    }
}
```

## Interface

- **Definition**: An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures (abstract methods), default methods, static methods, and nested types. All methods in an interface are abstract by default (except default and static methods).

- **Characteristics**:
  - **Abstract Methods**: Methods declared in an interface are implicitly abstract and must be implemented by the implementing class.
  - **Default Methods**: Introduced in Java 8, these methods have a default implementation that can be inherited by implementing classes.
  - **Static Methods**: Also introduced in Java 8, these methods belong to the interface class itself.
  - **Constants**: Variables declared in an interface are implicitly public, static, and final.
  - **No Constructors**: Interfaces cannot have constructors.
  - **Multiple Inheritance**: A class can implement multiple interfaces, promoting more flexible design and reducing coupling.
  - **Functional Interfaces**: Interfaces with a single abstract method (SAM) are functional interfaces, useful for lambda expressions and method references.

- **Use Cases**:
  - When you want to specify behavior that multiple classes can implement.
  - When you want to define a contract for classes without dictating how they should be implemented.
  - Ideal for defining types that are completely unrelated by inheritance but should share a common behavior.

- **Example**:
```java
interface Animal {
    void sound();  // Abstract method
    default void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```

## Differences Between Abstract Class and Interface

| Feature                       | Abstract Class                                           | Interface                                             |
|-------------------------------|----------------------------------------------------------|-------------------------------------------------------|
| **Methods**                   | Can have both abstract and concrete methods              | Can only have abstract methods (until Java 8); from Java 8 onwards, can have default and static methods |
| **Instance Variables**        | Can have instance variables                              | Cannot have instance variables, only constants        |
| **Inheritance**               | A class can extend only one abstract class               | A class can implement multiple interfaces             |
| **Constructors**              | Can have constructors                                   | Cannot have constructors                             |
| **Access Modifiers**          | Can be abstract, protected, public, private              | Methods are public by default                         |
| **Usage**                     | Used when classes are closely related                    | Used to define a contract for classes, unrelated in terms of inheritance |
| **Multiple Inheritance**      | Not supported (a class can extend only one class)        | Supported (a class can implement multiple interfaces) |

