# Getters and Setters in Java

Getters and setters are methods used to access and modify the private fields (variables) of a class. They are commonly used as part of the encapsulation principle in Java to provide controlled access to the class's internal state.

## Getters

Getters are methods used to retrieve the values of private fields (variables) of a class. They typically have a `get` prefix followed by the name of the field they retrieve. Getters are often declared as `public` methods to allow other classes to access the values.

```java
public class MyClass {
    private int myField;

    // Getter method
    public int getMyField() {
        return myField;
    }
}
```

### Setters

- Setters are methods used to modify the values of private fields (variables) of a class. They typically have a set prefix followed by the name of the field they modify. Setters are often declared as public methods to allow other classes to modify the values.

```java
public class MyClass {
    private int myField;

    // Setter method
    public void setMyField(int newValue) {
        myField = newValue;
    }
}
```

### Benefits of Getters and Setters

- <b>Encapsulation : </b> Getters and setters encapsulate the access to private fields, allowing controlled access and modification of the class's internal state.
- <b>Data Validation : </b> Setters can include validation logic to ensure that the new value meets certain criteria before modifying the field.
- <b>Flexibility : </b> By using getters and setters, you can modify the internal implementation of the class without affecting the external users, promoting code flexibility and maintainability.
