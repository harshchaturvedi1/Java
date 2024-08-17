### Question 1: User Authentication

**Task:**
Consider the following `UserAuthenticator` class:

```java
class UserAuthenticator {
    public boolean authenticate(String username, String password) {
        // Authentication logic
        return true;
    }

    public void logAuthenticationAttempt(String username, boolean success) {
        // Logging logic
    }

    public void sendAuthenticationNotification(String username) {
        // Notification logic
    }
}

```

**Requirement:**
Identify the violation in the `UserAuthenticator` class and refactor the code to adhere to the correct principles.
