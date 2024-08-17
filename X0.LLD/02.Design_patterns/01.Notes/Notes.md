# Design Patterns

## Table of Contents

1. [Creational Patterns](#creational-patterns)
   - [Factory Pattern](#factory-pattern)
   - [Singleton Pattern](#singleton-pattern)
   - [Builder Pattern](#builder-pattern)
2. [Structural Patterns](#structural-patterns)
   - [Adapter Pattern](#adapter-pattern)
   - [Facade Pattern](#facade-pattern)
   - [Decorator Pattern](#decorator-pattern)
3. [Behavioral Patterns](#behavioral-patterns)
   - [Observer Pattern](#observer-pattern)
   - [Strategy Pattern](#strategy-pattern)
   - [Command Pattern](#command-pattern)
   - [Chain of Responsibility Pattern](#chain-of-responsibility-pattern)

---

## Design Pattern Categories

### 1. Creational Patterns

Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. These patterns increase the flexibility and reuse of existing code.

### 2. Structural Patterns

Structural patterns deal with object composition or relationships. They help ensure that if one part of a system changes, the entire system doesn't need to change.

### 3. Behavioral Patterns

Behavioral patterns deal with communication between objects. They help in defining how objects interact and how responsibilities are distributed among them.

---

## Creational Patterns

### 1. Factory Pattern

### Meaning:

The Factory Pattern defines an interface for creating an object, but lets subclasses alter the type of objects that will be created. It promotes loose coupling by eliminating the need to bind application-specific classes into the code.

### Real-Life Example:

Think of a cake factory. You can order different types of cakes (Chocolate, Vanilla, Strawberry) without knowing how they are made. The factory handles the creation.

### Java Code:

```java
// Cake.java
public interface Cake {
    void bake();
}

// ChocolateCake.java
public class ChocolateCake implements Cake {
    @Override
    public void bake() {
        System.out.println("Baking a Chocolate Cake!");
    }
}

// VanillaCake.java
public class VanillaCake implements Cake {
    @Override
    public void bake() {
        System.out.println("Baking a Vanilla Cake!");
    }
}

// CakeFactory.java
public class CakeFactory {
    public static Cake getCake(String type) {
        switch (type) {
            case "Chocolate":
                return new ChocolateCake();
            case "Vanilla":
                return new VanillaCake();
            default:
                throw new IllegalArgumentException("Unknown cake type");
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Cake chocolateCake = CakeFactory.getCake("Chocolate");
        chocolateCake.bake();

        Cake vanillaCake = CakeFactory.getCake("Vanilla");
        vanillaCake.bake();
    }
}

```

### 2. Singleton Pattern

### Meaning:

The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

### Real-Life Example:

A CEO of a company. There can only be one CEO at any given time, and everyone refers to this single CEO.

### Java Code:

```java
// Singleton.java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from the Singleton!");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}

```

### 3. Builder Pattern

### Meaning:

The Builder Pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

### Real-Life Example:

Building a house. You can have different types of houses (wooden, brick, glass), but the construction process is the same.

### Java Code:

```java
// House.java
public class House {
    private String foundation;
    private String structure;
    private String roof;

    private House(Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
    }

    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;

        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + "]";
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setFoundation("Concrete")
                .setStructure("Brick")
                .setRoof("Shingles")
                .build();

        System.out.println(house);
    }
}

```

---

## Structural Patterns

### 1. Adapter Pattern

### Meaning:

The Adapter Pattern allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces.

### Real-Life Example:

A power adapter that allows a three-prong plug to fit into a two-prong outlet.

### Java Code:

```java
// Target.java
public interface Target {
    void request();
}

// Adaptee.java
public class Adaptee {
    public void specificRequest() {
        System.out.println("Specific request.");
    }
}

// Adapter.java
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}

```

### 2. Facade Pattern

### Meaning:

The Facade Pattern provides a simplified interface to a complex subsystem. It hides the complexities of the system and provides an interface to the client using which the client can access the system.

### Real-Life Example:

A TV remote. The remote is the facade that simplifies the interaction with the complex internal workings of the TV.

### Java Code:

```java
// Amplifier.java
public class Amplifier {
    public void on() {
        System.out.println("Amplifier on.");
    }

    public void off() {
        System.out.println("Amplifier off.");
    }
}

// DvdPlayer.java
public class DvdPlayer {
    public void on() {
        System.out.println("DVD Player on.");
    }

    public void play() {
        System.out.println("DVD Player playing.");
    }

    public void off() {
        System.out.println("DVD Player off.");
    }
}

// HomeTheaterFacade.java
public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd) {
        this.amp = amp;
        this.dvd = dvd;
    }

    public void watchMovie() {
        amp.on();
        dvd.on();
        dvd.play();
    }

    public void endMovie() {
        dvd.off();
        amp.off();
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd);

        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}

```

### 3. Decorator Pattern

### Meaning:

The Decorator Pattern allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.

### Real-Life Example:

A Christmas tree. You can add ornaments, tinsel, and lights to the tree to decorate it.

### Java Code:

```java
// ChristmasTree.java
public interface ChristmasTree {
    String decorate();
}

// BasicChristmasTree.java
public class BasicChristmasTree implements ChristmasTree {
    @Override
    public String decorate() {
        return "Christmas Tree";
    }
}

// TreeDecorator.java
public abstract class TreeDecorator implements ChristmasTree {
    protected ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    public String decorate() {
        return tree.decorate();
    }
}

// GarlandDecorator.java
public class GarlandDecorator extends TreeDecorator {
    public GarlandDecorator(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + " with Garland";
    }
}

// BubbleLightsDecorator.java
public class BubbleLightsDecorator extends TreeDecorator {
    public BubbleLightsDecorator(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + " with Bubble Lights";
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        ChristmasTree tree1 = new GarlandDecorator(new BasicChristmasTree());
        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new BubbleLightsDecorator(new GarlandDecorator(new BasicChristmasTree()));
        System.out.println(tree2.decorate());
    }
}

```

---

## Behavioral Patterns

### 1. Observer Pattern

### Meaning:

The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

### Real-Life Example:

A newsletter subscription. When there is a new newsletter, all subscribers are notified.

### Java Code:

```java
// Subject.java
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers

() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Observer.java
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

// BinaryObserver.java
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}

// HexObserver.java
public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}

```

### 2. Strategy Pattern

### Meaning:

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the algorithm vary independently from clients that use it.

### Real-Life Example:

A navigation system. You can choose different routes (shortest, fastest, avoid highways), and the navigation system can switch between these strategies.

### Java Code:

```java
// Strategy.java
public interface Strategy {
    int doOperation(int num1, int num2);
}

// OperationAdd.java
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

// OperationSubtract.java
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

// OperationMultiply.java
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

// Context.java
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

```

### 3. Command Pattern

### Meaning:

The Command Pattern encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.

### Real-Life Example:

A remote control. Each button on the remote is a command that tells the TV what to do (turn on, turn off, change the channel).

### Java Code:

```java
// Command.java
public interface Command {
    void execute();
}

// Light.java
public class Light {
    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}

// LightOnCommand.java
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

// LightOffCommand.java
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

// RemoteControl.java
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}

```

---

### Strategy Pattern

### Meaning

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern allows the algorithm to vary independently from the clients that use it.

### Real-Life Example

Consider a payment system for an online shopping platform where users can choose different payment methods like credit card, PayPal, or cryptocurrency. The system should be able to switch between these payment methods without altering the client code.

### Java Code

**Step 1: Define the Strategy Interface**

```java
// PaymentStrategy.java
public interface PaymentStrategy {
    void pay(int amount);
}

```

**Step 2: Implement Concrete Strategies**

```java
// CreditCardStrategy.java
public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String name;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String cardNumber, String name, String cvv, String dateOfExpiry) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}

// PayPalStrategy.java
public class PayPalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}

// CryptoStrategy.java
public class CryptoStrategy implements PaymentStrategy {
    private String walletAddress;

    public CryptoStrategy(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using cryptocurrency.");
    }
}

```

**Step 3: Create the Context Class**

```java
// ShoppingCart.java
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}

```

**Step 4: Define the Item Class**

```java
// Item.java
public class Item {
    private String upcCode;
    private int price;

    public Item(String upc, int cost) {
        this.upcCode = upc;
        this.price = cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}

```

**Step 5: Use the Strategy Pattern in the Main Class**

```java
// Main.java
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 100);
        Item item2 = new Item("5678", 300);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by credit card
        cart.pay(new CreditCardStrategy("1234567890123456", "John Doe", "123", "12/23"));

        // pay by PayPal
        cart.pay(new PayPalStrategy("myemail@example.com", "mypassword"));

        // pay by cryptocurrency
        cart.pay(new CryptoStrategy("wallet12345"));
    }
}

```

### Explanation

- **Strategy Interface (`PaymentStrategy`)**: Defines the interface that all payment strategies must implement.
- **Concrete Strategies (`CreditCardStrategy`, `PayPalStrategy`, `CryptoStrategy`)**: Implement the `PaymentStrategy` interface and provide specific payment methods.
- **Context Class (`ShoppingCart`)**: Maintains a reference to a `PaymentStrategy` object and uses it to execute the strategy.
- **Client Code (`Main`)**: Creates a `ShoppingCart`, adds items, and chooses a payment method. The payment method can be changed without modifying the `ShoppingCart` or `Item` classes.

### Chain of Responsibility Pattern

### Meaning

The Chain of Responsibility Pattern passes a request along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

### Real-Life Example

Consider a call center where customer issues are handled in tiers. If a customer service representative (CSR) cannot resolve an issue, it is escalated to a senior CSR, and if needed, further escalated to a manager.

### Java Code

**Step 1: Define the Handler Interface**

```java
// Handler.java
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String issue) {
        if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

```

**Step 2: Implement Concrete Handlers**

```java
// CSR.java
public class CSR extends Handler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("simple")) {
            System.out.println("CSR: Handling simple issue.");
        } else {
            System.out.println("CSR: Escalating issue.");
            super.handleRequest(issue);
        }
    }
}

// SeniorCSR.java
public class SeniorCSR extends Handler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("moderate")) {
            System.out.println("Senior CSR: Handling moderate issue.");
        } else {
            System.out.println("Senior CSR: Escalating issue.");
            super.handleRequest(issue);
        }
    }
}

// Manager.java
public class Manager extends Handler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("complex")) {
            System.out.println("Manager: Handling complex issue.");
        } else {
            System.out.println("Manager: Issue is too complex to handle.");
        }
    }
}

```

**Step 3: Use the Chain of Responsibility Pattern in the Main Class**

```java
// Main.java
public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler csr = new CSR();
        Handler seniorCsr = new SeniorCSR();
        Handler manager = new Manager();

        // Set the chain of responsibility
        csr.setNextHandler(seniorCsr);
        seniorCsr.setNextHandler(manager);

        // Handle requests
        System.out.println("Issue: simple");
        csr.handleRequest("simple");

        System.out.println("\\nIssue: moderate");
        csr.handleRequest("moderate");

        System.out.println("\\nIssue: complex");
        csr.handleRequest("complex");

        System.out.println("\\nIssue: unknown");
        csr.handleRequest("unknown");
    }
}

```

### Explanation

- **Handler Interface (`Handler`)**: Defines an interface for handling requests and setting the next handler.
- **Concrete Handlers (`CSR`, `SeniorCSR`, `Manager`)**: Implement the `Handler` interface, handle specific types of requests, and pass unhandled requests to the next handler.
- **Client Code (`Main`)**: Creates the chain of responsibility and processes requests by passing them to the first handler in the chain.
