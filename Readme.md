## java code flow

person/developer => Java code => compiler (Javac) => byte code => jvm (built different for each machines) => os ==> hw

## jvm

- executes only <b>public static void main (`String a[]`)</b>

### java

- java is an oject oriented programming language
- object oriented programming languages means everything is an object

### hello world in Java

```java
class Hello {
    public static void main(String a[]){
        system.out.println("Hello world!");
    }
}
```

### JVM

- jvm is part of jre(java runtime environment)

### WORA (write once run anywhere)

- java is platform independent bcz of jvm , the other machine need only jvm and jre and no need for `JDK` to execute java code.

- jdk is needed by developer for development and jdk brings new/updated jre and jvm

#### java is strongly typed language

#### System.out.print

```java
System.out.println() // ==> moves control to next line
```

# String[] args in Java

In Java, `String[] args` is a parameter in the `main` method declaration. It is an array of strings that allows you to pass command-line arguments to your Java program when you run it from the command line. Let's break it down in detail:

## `String[] args`

- **`String[]`**: This denotes that `args` is an array of strings. It means that you can store multiple strings in the `args` array.
- **`args`**: This is just a variable name. You can name it whatever you like, but `args` is a conventional name used in Java programs. It stands for "arguments".

## Purpose and Importance

The `String[] args` parameter allows you to pass information to your Java program from the command line when you execute the program. This can be useful for various purposes, such as:

1. **Configuration**: You can pass configuration parameters to your program at runtime, such as file paths, database connection details, or other settings.

2. **Customization**: It allows users to customize the behavior of your program by providing arguments when they run it.

3. **Input**: You can pass input data to your program from the command line, which your program can then process.

4. **Testing**: It facilitates testing your program with different inputs without modifying the source code.

## Example

Here's a simple example demonstrating how to use `String[] args` in a Java program:

```java
public class CommandLineArgumentsExample {
    public static void main(String[] args) {
        // Printing all the command-line arguments passed to the program
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

```

- if you compile and run this program from the command line like this:

```
java CommandLineArgumentsExample arg1 arg2 arg3
```

- it will output:

```
arg1
arg2
arg3

```

### conclusion

- In summary, String[] args in Java is a mechanism to pass command-line arguments to your program. While not strictly necessary for all programs, it is a convenient and powerful feature that allows your Java applications to be more flexible and customizable based on user input or configuration parameters provided at runtime.
