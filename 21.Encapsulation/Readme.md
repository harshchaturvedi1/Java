# Encapsulation in Java

Encapsulation is one of the four fundamental concepts of object-oriented programming in Java, along with inheritance, polymorphism, and abstraction. It is a mechanism of wrapping the data (variables) and code (methods) together as a single unit, also known as a class. Encapsulation allows you to control the access to the data by hiding the implementation details and exposing only the necessary functionality through methods.

## Principles of Encapsulation

### Data Hiding

Encapsulation hides the internal state (data) of an object from the outside world. It prevents direct access to the data and restricts modifications to the data through controlled access points (methods).

### Access Modifiers

Access modifiers (e.g., `public`, `private`, `protected`) are used to control the visibility of variables and methods in a class. They determine whether a member can be accessed by other classes and how it can be accessed.

### Information Hiding

Encapsulation promotes information hiding by exposing only the necessary functionality through public methods while hiding the internal implementation details. This allows you to change the internal implementation without affecting the external users of the class.

## Benefits of Encapsulation

- **Data Protection**: Encapsulation protects the internal state of an object from unauthorized access and modification.
- **Flexibility**: It allows you to change the internal implementation without affecting the external users of the class, promoting code flexibility and maintainability.
- **Modularity**: Encapsulation promotes modularity by organizing code into self-contained units (classes), making it easier to manage and understand.

## Example

```java
public class Car {
    private String model;
    private int year;

    // Getter methods
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
```

- In this example, the Car class encapsulates the model and year variables using private access modifiers. Access to these variables is provided through public getter and setter methods, allowing controlled access to the data while hiding the implementation details.

### Conclusion

- Encapsulation is a key principle of object-oriented programming in Java, enabling data hiding, information hiding, and code modularity. By encapsulating the data and behavior within a class, you can create more robust, maintainable, and flexible code.
