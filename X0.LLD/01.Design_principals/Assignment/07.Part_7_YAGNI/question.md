**Question 7:**
Consider the following class:

```java
class Product {
    private String name;
    private double price;

    // Prematurely added methods
    public void convertPriceToDifferentCurrency(String currency) {
        // Code to convert price
    }

    public String toJson() {
        return "{\\"name\\":\\"" + name + "\\", \\"price\\":" + price + "}";
    }

    // Constructor, getters, and setters
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

```

**Task:**
Identify the YAGNI violation in the above code and refactor the class accordingly.
