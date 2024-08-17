```java
class HelloWorld{
    public static void main(String[] args){

        Square square = new Square(10);
        System.out.println(square.getArea());

        // Shape sh = new Rectangle(10,20);
        // Shape sh2 = new Square(20);
        // System.out.println(sh.getArea());
        // System.out.println(sh2.getArea());


    }
}

interface Shape{
    double getArea();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    Square(int side){
       this.side = side;
    }

    public double getArea(){
        return side * side;
    }
}
```
