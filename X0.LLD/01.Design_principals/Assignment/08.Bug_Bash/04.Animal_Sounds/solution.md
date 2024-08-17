```java
class HelloWorld {
    public static void main(String[] args) {
        SoundMaker sd = new SoundMaker();

        Animal a1 = new Dog();

        sd.playSound(a1);
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class SoundMaker {
    public void playSound(Animal animal) {
        animal.makeSound();
    }
}
```
