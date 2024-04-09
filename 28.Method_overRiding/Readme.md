# Method Overriding in Java

Method overriding is a feature of object-oriented programming in Java that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. Method overriding is used to achieve runtime polymorphism, where the method to be invoked is determined at runtime based on the type of the object.

## Rules for Method Overriding

To correctly override a method in Java, the following rules must be followed:

1. The method in the subclass must have the same signature (name, parameters, and return type) as the method in the superclass.
2. The access level of the overriding method in the subclass must be the same or more accessible than the method in the superclass.
3. The overriding method cannot declare a checked exception that is broader than the exception declared by the method in the superclass.

## Example of Method Overriding

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
```

- In this example, the Dog class overrides the makeSound() method defined in the Animal class to provide a specific implementation for a dog's sound.

### Polymorphic Behavior

- Method overriding enables polymorphic behavior, where a reference variable of the superclass can refer to objects of either the superclass or its subclasses, and the correct method implementation is determined dynamically at runtime.

````java
Animal animal = new Dog();
animal.makeSound(); // Output: Dog barks
    ```
````

- In this example, the makeSound() method of the Dog class is invoked, demonstrating polymorphic behavior.

### Conclusion

- Method overriding in Java allows subclasses to provide specialized implementations of methods defined in their superclasses. By adhering to the rules of method overriding, Java developers can achieve polymorphic behavior and create more flexible and maintainable code.
