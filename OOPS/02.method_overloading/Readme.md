# Method Overloading in Java

Method overloading in Java allows a class to have multiple methods with the same name but different parameters. The compiler differentiates these methods based on the number of parameters and their types. It is a form of polymorphism and provides flexibility and clarity to the codebase.

## Syntax

```java
class ClassName {
    returnType methodName(parameterType1 parameter1) {
        // method body
    }

    returnType methodName(parameterType1 parameter1, parameterType2 parameter2) {
        // method body
    }

    // Additional overloaded methods can be defined similarly
}
```

## Rules for Method Overloading

1. Overloaded methods must have the same method name.
2. Overloaded methods can have different numbers of parameters.
3. Overloaded methods can have different types of parameters.
4. Overloaded methods can have different order of parameters.
5. Return types may or may not be different. However, changing only the return type is not sufficient to overload a method.

### Example

```java
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using overloaded methods
        System.out.println("Sum of 5 and 7 is: " + calculator.add(5, 7));
        System.out.println("Sum of 3.5 and 4.5 is: " + calculator.add(3.5, 4.5));
        System.out.println("Sum of 2, 4, and 6 is: " + calculator.add(2, 4, 6));
    }
}
```
