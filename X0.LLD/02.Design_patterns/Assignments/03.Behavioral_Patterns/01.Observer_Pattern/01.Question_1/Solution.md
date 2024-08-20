```java
import java.util.ArrayList;
import java.util.List;

// Stock class, Observer interface, and StockObserver class.

// Observer Interface
interface Observer {
    void update(String stockName, float price);
}

class Stock {
    private String stockName;
    private float price;
    private List<Observer> observers;

    public Stock(String stockName, float price) {
        this.stockName = stockName;
        this.price = price;
        observers = new ArrayList<>();
    }

    // Method to add an observer (subscriber)
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer (unsubscribe)
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers about the price change
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }

    // Method to set a new price and notify observers
    public void setPrice(float newPrice) {
        this.price = newPrice;
        notifyObservers();  // Notify subscribers when the price changes
    }

    public String getStockName() {
        return stockName;
    }

    public float getPrice() {
        return price;
    }
}


class StockObserver implements Observer {
    private String observerName;

    public StockObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(String stockName, float price) {
        System.out.println(observerName + " received update: " + stockName + " is now $" + price);
    }
}


public class Main {
    public static void main(String[] args) {

      // Create stocks
        Stock appleStock = new Stock("AAPL", 150.0f);
        Stock googleStock = new Stock("GOOGL", 2800.0f);

        // Create stock observers (subscribers)
        StockObserver observer1 = new StockObserver("Alice");
        StockObserver observer2 = new StockObserver("Bob");

        // Alice subscribes to Apple stock updates
        appleStock.addObserver(observer1);

        // Bob subscribes to both Apple and Google stock updates
        appleStock.addObserver(observer2);
        googleStock.addObserver(observer2);

        // Simulate price changes
        appleStock.setPrice(155.0f);  // Both Alice and Bob will be notified
        googleStock.setPrice(2850.0f); // Only Bob will be notified

        // Alice unsubscribes from Apple stock updates
        appleStock.removeObserver(observer1);

        // Simulate another price change
        appleStock.setPrice(160.0f);  // Only Bob will be notified


    }
}
```
