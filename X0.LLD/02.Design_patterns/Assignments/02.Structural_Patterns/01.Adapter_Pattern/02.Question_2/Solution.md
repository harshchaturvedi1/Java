```java
import java.util.Map;
import java.util.HashMap;

// Target Interface
interface Inventory {
    void enterItem(String itemType, int itemQuantity);
    int viewItemQuantity(String itemType);
}

// InventoryType Interface for Legacy Systems
interface InventoryType {
    void addQuantity(int quantity);
    int getQuantity();
}

// Adaptee Class for Pen Inventory
class PenInventory implements InventoryType {
    private int quantity = 0;

    @Override
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }
}

// Adaptee Class for Rakhi Inventory
class RakhiInventory implements InventoryType {
    private int quantity = 0;

    @Override
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }
}

// Adaptee Class for Book Inventory (Example of adding another inventory type)
class BookInventory implements InventoryType {
    private int quantity = 0;

    @Override
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }
}

// Adapter Class to Support Multiple Legacy Systems
class InventoryAdapter implements Inventory {
    private Map<String, InventoryType> inventoryMap;

    public InventoryAdapter() {
        this.inventoryMap = new HashMap<>();
    }

    public void addInventoryType(String itemType, InventoryType inventoryType) {
        inventoryMap.put(itemType, inventoryType);
    }

    @Override
    public void enterItem(String itemType, int itemQuantity) {
        InventoryType inventoryType = inventoryMap.get(itemType);
        if (inventoryType != null) {
            inventoryType.addQuantity(itemQuantity);
        } else {
            System.out.println("No inventory type found for: " + itemType);
        }
    }

    @Override
    public int viewItemQuantity(String itemType) {
        InventoryType inventoryType = inventoryMap.get(itemType);
        if (inventoryType != null) {
            return inventoryType.getQuantity();
        } else {
            System.out.println("No inventory type found for: " + itemType);
            return 0;
        }
    }
}

// Legacy Inventory System implementing Inventory
class LegacyInventorySystem implements Inventory {
    private InventoryAdapter inventoryAdapter;

    public LegacyInventorySystem() {
        this.inventoryAdapter = new InventoryAdapter();
    }

    public void addInventoryType(String itemType, InventoryType inventoryType) {
        inventoryAdapter.addInventoryType(itemType, inventoryType);
    }

    @Override
    public void enterItem(String itemType, int itemQuantity) {
        inventoryAdapter.enterItem(itemType, itemQuantity);
    }

    @Override
    public int viewItemQuantity(String itemType) {
        return inventoryAdapter.viewItemQuantity(itemType);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        // Create specific inventory instances
        InventoryType penInventory = new PenInventory();
        InventoryType rakhiInventory = new RakhiInventory();
        InventoryType bookInventory = new BookInventory();

        // Create a legacy inventory system instance using the adapter
        LegacyInventorySystem legacyInventorySystem = new LegacyInventorySystem();

        // Register multiple inventory types with the legacy system
        legacyInventorySystem.addInventoryType("pen", penInventory);
        legacyInventorySystem.addInventoryType("rakhi", rakhiInventory);
        legacyInventorySystem.addInventoryType("book", bookInventory); // New type

        // Use the legacy inventory system through the adapter
        legacyInventorySystem.enterItem("pen", 100);
        System.out.println("Pen Inventory: " + legacyInventorySystem.viewItemQuantity("pen")); // Output: 100

        legacyInventorySystem.enterItem("rakhi", 50);
        System.out.println("Rakhi Inventory: " + legacyInventorySystem.viewItemQuantity("rakhi")); // Output: 50

        legacyInventorySystem.enterItem("book", 30);
        System.out.println("Book Inventory: " + legacyInventorySystem.viewItemQuantity("book")); // Output: 30
    }
}
```
