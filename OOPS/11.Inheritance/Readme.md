# Inheritance in Java

Inheritance is a fundamental feature of object-oriented programming in Java that allows one class (subclass or child class) to inherit the properties and behaviors (fields and methods) of another class (superclass or parent class). Inheritance promotes code reuse and supports the concept of "is-a" relationships between classes.

## Syntax

In Java, inheritance is implemented using the `extends` keyword. The subclass extends the superclass, inheriting all of its public and protected members.

```java
public class Superclass {
    // Superclass members
}

public class Subclass extends Superclass {
    // Subclass members
}
```

### Types of Inheritance

#### Single Inheritance

- In single inheritance, a subclass inherits from only one superclass.

```java
public class Subclass extends Superclass {
    // Subclass inherits from Superclass
}
```

#### Multilevel Inheritance

- In multilevel inheritance, a subclass inherits from another subclass, creating a hierarchy of classes.

```java
public class Subclass1 extends Superclass {
    // Subclass1 inherits from Superclass
}

public class Subclass2 extends Subclass1 {
    // Subclass2 inherits from Subclass1
}

```

#### Hierarchical Inheritance

- In hierarchical inheritance, multiple subclasses inherit from the same superclass.

```java
public class Subclass1 extends Superclass {
// Subclass1 inherits from Superclass
}

public class Subclass2 extends Superclass {
// Subclass2 inherits from Superclass
}
```

#### Multiple Inheritance (Not Supported)

- Java does not support multiple inheritance of classes (i.e., a class cannot directly inherit from more than one class). However, it supports multiple inheritance of interfaces through interface implementation.

```java
// Multiple inheritance of interfaces
public class MyClass implements Interface1, Interface2 {
    // Class implementation
}
```

### Access Modifiers and Inheritance

- Members with public or protected access modifiers in the superclass are inherited by the subclass.
  Members with private access modifiers in the superclass are not inherited by the subclass.

### Overriding Methods

- Subclasses can override superclass methods to provide their own implementation. Method overriding allows subclasses to provide specialized behavior while still using the method signature defined in the superclass.

```java
public class Superclass {
    public void display() {
        System.out.println("Superclass display method");
    }
}

public class Subclass extends Superclass {
    @Override
    public void display() {
        System.out.println("Subclass display method");
    }
}
```

### Benefits of Inheritance

- <b>Code Reuse:</b> Inheritance allows subclasses to reuse code from the superclass, reducing redundancy and promoting modularity.
- <b>Polymorphism:</b> Inheritance enables polymorphism, allowing objects of different subclasses to be treated as objects of the superclass, leading to more flexible and modular code.
- <b> Hierarchy: </b> Inheritance facilitates the creation of class hierarchies that reflect real-world relationships between objects.

### Conclusion

- Inheritance is a powerful mechanism in Java that enables code reuse, promotes modularity, and supports the creation of class hierarchies. By extending classes and overriding methods, Java developers can create more flexible, modular, and maintainable code.
