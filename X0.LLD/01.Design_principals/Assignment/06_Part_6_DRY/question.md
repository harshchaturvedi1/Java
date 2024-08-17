**Question 6:**
Consider the following classes:

```java
class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

```

**Task:**
Refactor the above classes to avoid code duplication, adhering to the DRY principle.
