class Mobile {
    String brand;
    int price;
    static String name;

    static {
        System.out.println("Inside static block of Mobile");
        name = "Phone";
    }

    public Mobile() {
        brand = "";
        price = 200;
        // it can be done in below format also
        // but with each instance of class it will be initialized
        // name = "Phone";

    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1700;

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1500;

        // first class loads and than the instance is created
        // if there is no instance of class than the class is also not loaded
        // so if the class is not loaded than the static is not not created

        // to load the class and create static even without creating instance we need to
        // use Class class in java
        // i.e.
        Class.forName("Mobile");
    }
}
