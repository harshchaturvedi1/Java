```java
// Coffee interface
interface Coffee {
    String create();
}

// BasicCoffee class
class BasicCoffee implements Coffee {
    @Override
    public String create() {
        return "Basic coffee";
    }
}

// Abstract CoffeeAddons class
abstract class CoffeeAddons implements Coffee {
    protected Coffee coffee;

    public CoffeeAddons(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String create() {
        return coffee.create();
    }
}

// MilkDecorator class
class MilkDecorator extends CoffeeAddons {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String create() {
        return super.create() + " with milk";
    }
}

// SugarDecorator class
class SugarDecorator extends CoffeeAddons {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String create() {
        return super.create() + " with sugar";
    }
}

// VanillaDecorator class
class VanillaDecorator extends CoffeeAddons {

    public VanillaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String create() {
        return super.create() + " with vanilla";
    }
}

// Main class to demonstrate the usage
public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new VanillaDecorator(new SugarDecorator(new MilkDecorator(new BasicCoffee())));
        System.out.println(coffee1.create());

        Coffee coffee2 = new MilkDecorator(new BasicCoffee());
        System.out.println(coffee2.create());

        Coffee coffee3 = new SugarDecorator(new VanillaDecorator(new BasicCoffee()));
        System.out.println(coffee3.create());
    }
}
```
