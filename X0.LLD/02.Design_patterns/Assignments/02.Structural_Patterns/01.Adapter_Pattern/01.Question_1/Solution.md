```java
// InventoryType interface for different types of inventory items
interface InventoryType {
    void addQuantity(int quantity);
    int getQuantity();
}

// PenInventory implementing InventoryType
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

// RakhiInventory implementing InventoryType
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

// Adapter Class
class InventoryAdapter implements Inventory {
    private InventoryType inventoryType;

    public InventoryAdapter(InventoryType inventoryType) {
        this.inventoryType = inventoryType;
    }

    @Override
    public void enterItem(String itemType, int itemQuantity) {
        inventoryType.addQuantity(itemQuantity);
    }

    @Override
    public int viewItemQuantity(String itemType) {
        return inventoryType.getQuantity();
    }
}


// Legacy Inventory System implementing Inventory
class LegacyInventorySystem implements Inventory {
    private InventoryAdapter inventoryAdapter;

    public LegacyInventorySystem(InventoryType inventoryType) {
        this.inventoryAdapter = new InventoryAdapter(inventoryType);
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


public class Main {
    public static void main(String[] args) {
        // Create specific inventory instances
        InventoryType penInventory = new PenInventory();
        InventoryType rakhiInventory = new RakhiInventory();

        // Create legacy inventory system instances using the adapter
        LegacyInventorySystem legacyPenInventory = new LegacyInventorySystem(penInventory);
        LegacyInventorySystem legacyRakhiInventory = new LegacyInventorySystem(rakhiInventory);

        // Use the legacy inventory system through the adapter
        legacyPenInventory.enterItem("pen", 100);
        System.out.println("Pen Inventory: " + legacyPenInventory.viewItemQuantity("pen")); // Output: 100

        legacyRakhiInventory.enterItem("rakhi", 50);
        System.out.println("Rakhi Inventory: " + legacyRakhiInventory.viewItemQuantity("rakhi")); // Output: 50
    }
}
```
