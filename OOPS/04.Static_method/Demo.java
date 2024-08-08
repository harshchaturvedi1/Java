class Mobile {
    String brand;
    int price;
    // String name;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1() {
        System.out.println("Inside static show1 of mobile class");

        // non static variables cannot be used inside static methods
        // System.out.println(brand + " : " + price + " : " + name);

        // to use non static variables inside static method we need it's object
        // reference ==> refer to method show2

    }

    public static void show2(Mobile obj) {
        System.out.println("Inside static show2 of mobile class");
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class Demo {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1700;
        // obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1500;
        // obj2.name = "SmartPhone";

        // obj2.name = "Phone";
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        // obj1.show1();
        Mobile.show1();

        Mobile.show2(obj2);
        Mobile.show2(obj1);
    }
}
