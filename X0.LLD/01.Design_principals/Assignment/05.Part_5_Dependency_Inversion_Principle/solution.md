```java
class HelloWorld{
    public static void main(String[] args){
        Switchable switchable = new Fan(); // Can also be new Lamp();
        Switch fanSwitch = new Switch(switchable);
        fanSwitch.operate();
    }
}

interface Switchable{
    void turnOn();
}

class Lamp implements Switchable{
    // @override
    public void turnOn() {
        System.out.println("Lamp turned on");
    }
}

class Fan implements Switchable{
    // @override
    public void turnOn() {
        System.out.println("Fan turned on .. it has round switch");
    }
}

class Switch {
    private Switchable switchable;

    public Switch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void operate() {
        switchable.turnOn();
    }
}
```
