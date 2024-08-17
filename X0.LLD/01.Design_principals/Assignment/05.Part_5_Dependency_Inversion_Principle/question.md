**Question 5:**
Consider the following classes:

```java
class Lamp {
    public void turnOn() {
        System.out.println("Lamp turned on");
    }
}

class Switch {
    private Lamp lamp;

    public Switch(Lamp lamp) {
        this.lamp = lamp;
    }

    public void operate() {
        lamp.turnOn();
    }
}

```

**Task:**
Refactor the above classes to adhere to the Dependency Inversion Principle.
