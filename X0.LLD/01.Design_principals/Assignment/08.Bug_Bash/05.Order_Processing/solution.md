```java
class HelloWorld {
    public static void main(String[] args) {
        NotificationService notificationService = new OrderConfirmation();
        OrderProcessor orderProcessor = new OrderProcessor(notificationService);
        OrderStatus orderStatus = new OrderStatus();

        Order o1 = new Order("1234sw3",notificationService);
        notificationService.sendNotification(o1);

        // Process the order
        orderProcessor.processOrder(o1);

        // Update order status
        orderStatus.updateOrderStatus(o1.getOrderId(), "Shipped");

        // Send notification
        // order.getNotificationService().sendNotification(o1.getOrderId());
    }
}

interface NotificationService{
    void sendNotification(Order order);
}

class Order{
    private String Orderid;
    private final NotificationService notificationService;

    public Order(String Orderid , NotificationService notificationService){
        this.Orderid = Orderid;
        this.notificationService = notificationService;
    }

    public String getOrderId(){
        return Orderid;
    }
}

class OrderProcessor {
    private final NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        // Order processing logic
        System.out.println("Order is processing #" + order.getOrderId());
        notificationService.sendNotification(order);

    }
}

class OrderConfirmation implements NotificationService{
    public void sendNotification(Order order){
        System.out.println("Order confirmed #" + order.getOrderId());
    }
}

class OrderStatus {
    public void updateOrderStatus(String orderId, String status){
        System.out.println("Order status #" + status + " with order id #" + orderId);
    }
}

```
