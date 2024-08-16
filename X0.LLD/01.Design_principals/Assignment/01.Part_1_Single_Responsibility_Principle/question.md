**Question 1:**
Consider the following class:

```java
class Invoice {
    private int invoiceNumber;
    private double amount;

    public Invoice(int invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    public void printInvoice() {
        // Code to print the invoice
    }

    public void saveToDatabase() {
        // Code to save the invoice to the database
    }
}

```

**Task:**
Refactor the above class to adhere to the Single Responsibility Principle.
