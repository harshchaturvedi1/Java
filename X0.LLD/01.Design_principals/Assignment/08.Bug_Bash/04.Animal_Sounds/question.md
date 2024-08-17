### Question 4: Animal Sounds

**Task:**
Consider the following `Animal` and `SoundMaker` classes:

```java
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class SoundMaker {
    public void playSound(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Playing dog sound");
        } else {
            animal.makeSound();
        }
    }
}

```

**Requirement:**
Identify the violation in the `Animal` and `SoundMaker` classes and refactor the code to adhere to the correct principles.
