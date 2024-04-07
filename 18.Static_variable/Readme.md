# Static Variables in Java

Static variables, also known as class variables, are variables that belong to the class itself rather than to instances of the class. They are shared among all instances of the class and are declared using the `static` keyword.

## Declaration

Static variables are declared at the class level and are prefixed with the `static` keyword.

```java
public class MyClass {
    static int count;
}
```

### Initialization

- Static variables are initialized when the class is loaded by the JVM. They are typically initialized with default values if not explicitly initialized by the programmer.

```java
public class MyClass {
    static int count = 0;
}
```

### Accessing

- Static variables can be accessed using the class name followed by the dot operator, without the need to create an instance of the class.

```java
MyClass.count = 10;
```

### Shared Across Instances

- Static variables are shared among all instances of the class. Changes made to a static variable by one instance are visible to all other instances.

### Common Use Cases

- Static variables are commonly used for constants, counters, configuration values, or any data that needs to be shared across instances of the class.

### Example

```java
public class MyClass {
    static int count = 0;

    public MyClass() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        displayCount(); // Output: Count: 3
    }
}
```

- In this example, the count variable is declared as static. Each time an instance of MyClass is created, the count variable is incremented. The displayCount() method displays the current value of count. Since count is static, it is shared among all instances of MyClass, and changes made to it by one instance are visible to all other instances.
