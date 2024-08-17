```java
class HelloWorld{
    public static void main(String[] args){
        Circle sq = new Circle(5);
        System.out.println(sq.calculateArea());
        AreaCalculator ar = new AreaCalculator();
        System.out.println(ar.calculateArea(sq));
    }
}
interface Shape{
    double calculateArea();
}

class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    // @override
    public double calculateArea(){
        return height * width;
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


class AreaCalculator {
    public double calculateArea(Shape shape) {
       return shape.calculateArea();
    }
}
```
