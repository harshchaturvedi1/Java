# Static Initialization Blocks in Java

Static initialization blocks in Java are used to initialize static variables or perform some computation that needs to be executed only once when the class is loaded by the JVM (Java Virtual Machine). Static blocks are declared using the `static` keyword followed by a block of code enclosed in braces `{}`.

## Syntax

```java
static {
    // Static initialization code
}
```

### Execution

- Static initialization blocks are executed when the class is loaded by the JVM.
- They are executed in the order they appear in the class file.

### Use Cases

- Initializing static variables with complex values that cannot be initialized inline.
- Performing one-time computations that need to be executed before the class is used.
- Loading resources or setting up environment configurations.

```java
public class MyClass {
    // Static variable
    static int myStaticVar;

    // Static initialization block
    static {
        // Initialization logic
        myStaticVar = 42;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        // Main method
        System.out.println("Main method executed");
        System.out.println("Value of myStaticVar: " + myStaticVar);
    }
}
```

- In this example, the static initialization block initializes the static variable myStaticVar with the value 42 when the class MyClass is loaded by the JVM. The static block is executed before the main method when the program starts.

### Notes

- Static initialization blocks are executed only once when the class is loaded, regardless of the number of instances created or methods called.
- Static initialization blocks can throw exceptions, but the class will not be initialized if an unhandled exception occurs in the static block.
