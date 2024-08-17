### Question 2: Shape Area Calculation

**Task:**
Consider the following `Shape` and `AreaCalculator` classes:

```java
class Shape {
    public String type;
    public double length;
    public double width;
    public double radius;

    public Shape(String type, double length, double width, double radius) {
        this.type = type;
        this.length = length;
        this.width = width;
        this.radius = radius;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        if ("rectangle".equalsIgnoreCase(shape.type)) {
            return shape.length * shape.width;
        } else if ("circle".equalsIgnoreCase(shape.type)) {
            return Math.PI * shape.radius * shape.radius;
        }
        return 0;
    }
}

```

**Requirement:**
Identify the violation in the `Shape` and `AreaCalculator` classes and refactor the code to adhere to the correct principles.
