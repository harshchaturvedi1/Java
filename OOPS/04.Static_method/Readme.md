# Static Methods in Java

Static methods in Java are methods that belong to the class itself rather than to instances of the class. They can be called using the class name followed by the dot operator, without the need to create an instance of the class. Static methods are declared using the `static` keyword.

## Declaration

Static methods are declared at the class level and are prefixed with the `static` keyword.

```java
public class MyClass {
    public static void staticMethod() {
        // Method implementation
    }
}
```

### Invocation

- Static methods can be invoked using the class name followed by the dot operator.

```java
MyClass.staticMethod();
```

### Accessing Instance Variables

- Static methods cannot directly access instance variables or instance methods of the class, as they are not associated with any particular instance of the class. However, they can access other static variables and static methods of the class.

### Common Use Cases

- Utility methods: Static methods are commonly used for utility methods that perform some generic functionality and do not require access to instance-specific data.
- Factory methods: Static methods can be used as factory methods to create instances of the class.
- Helper methods: Static methods can be used as helper methods within the class to perform common tasks.

```java
public class MathUtils {
    // Static method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }

    // Static method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int squareResult = MathUtils.square(5); // Output: 25
        int factorialResult = MathUtils.factorial(4); // Output: 24
    }
}
```

- In this example, square() and factorial() are static methods of the MathUtils class. They can be called using the class name MathUtils followed by the dot operator, without creating an instance of the MathUtils class.
