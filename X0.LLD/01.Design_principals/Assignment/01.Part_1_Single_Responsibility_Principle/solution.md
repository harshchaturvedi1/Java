**Issue** -
The given Invoice class voilated the SRP principal as it handle multiple responsibilities

1. It stores invoice related data i.e. invoice number and invoice data
2. It handles invoice printing logic
3. It handles logic for saving invoice details to database

As per SRP one class should handle only one responsibility whereas currently Invoice class have three responsibilities

** Solution ** - to adhere the issue of SRP , there should be three different classes

1. Invoice class to handle invoice data
2. InvoicePrinter class to handle invoice printing operation
3. InvoiceSave class to handle invoice saving operation

**Refactored code**

```java
class Invoice {
    private int invoiceNumber;
    private double amount;

    public Invoice(int invoiceNumber, double amount ){
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    public int getInvoiceNumber(){
        return this.invoiceNumber;
    }

    public double getInvoiceAmount(){
        return this.amount;
    }
}

class InvoicePrinter{
    public void print(Invoice invoice){
        // code to handle invoice printing
        System.out.println("Printing invoice #" + invoice.getInvoiceNumber());
    }
}

class InvoiceSave{
    public void save(Invoice invoice){
        // code to save invoice
        System.out.println("Saving invoice #" + invoice.getInvoiceNumber());
    }
}
```
