class Human {
    private int age;
    private String name;

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class Demo {

    public static void main(String[] args) {

        Human h1 = new Human();
        // h1.age = 20;
        // h1.name = "Harsh";

        // System.out.println(h1.name);

        h1.setAge(10);
        h1.setName("Harsh");
        System.out.println(h1.getAge());
        System.out.println(h1.getName());
    }

}
