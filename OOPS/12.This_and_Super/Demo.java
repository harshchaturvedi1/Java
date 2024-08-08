// -- by default a class extends Object class
// class A extends Object {
class A extends Object {
    public A() {
        super();
        System.out.println("inside normal A");
    }

    public A(int n) {
        super();
        System.out.println("inside int A");
    }

}

class B extends A {
    public B() {
        // super gets called automatically
        super();
        // -- in case we want to call parameterized constructor for A
        // super(4);
        System.out.println("inside normal B");
    }

    public B(int n) {
        // -- this method calls constructor if same clas
        this();
        // super(n);
        System.out.println("inside int B");
    }

}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        B obj2 = new B(3);
    }
}
