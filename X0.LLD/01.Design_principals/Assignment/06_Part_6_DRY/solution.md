```java
interface Shape{
    double calculateArea();
}


class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // @override
    public double calculateArea() {
        return side * side;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // @override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```
