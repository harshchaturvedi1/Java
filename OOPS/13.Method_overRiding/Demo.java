class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Demo {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.makeSound();
    }
}
