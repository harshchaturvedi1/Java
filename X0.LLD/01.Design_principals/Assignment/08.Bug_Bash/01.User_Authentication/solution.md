```java
class HelloWorld{
    public static void main(String[] args){

    }
}

interface Logger{
    void logAuthenticationAttempt(String username, boolean success);
}

interface NotificationService{
     void sendAuthenticationNotification(String username);
}

class UserAuthenticator {
    private final Logger logger;
    private final NotificationService notificationservice;

    public UserAuthenticator(Logger logger , NotificationService notificationservice){
        this.logger = logger;
        this.notificationservice=notificationservice;
    }

    public boolean authenticate(String username, String password) {
        boolean success = true;// auth logic
        logger.logAuthenticationAttempt(username,success);
        if(success){
            notificationservice.sendAuthenticationNotification(username);
        }
        // Authentication logic
        return success;
    }

}

class ConsoleLogger implements Logger{
    // @override
    public void logAuthenticationAttempt(String username, boolean success) {
        // Logging logic
    }
}


class EmailNotificationService implements NotificationService{
    // @override
    public void sendAuthenticationNotification(String username) {
        // Notification logic
    }
}
```
