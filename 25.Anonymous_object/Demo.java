class A {
    public A() {
        System.out.println("inside A constructor");
    }

    public void show(String message) {
        System.out.println("in show method==> " + message);
    }
}

public class Demo {
    public static void main(String[] args) {
        new A().show("first instance");
    }
}
