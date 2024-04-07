# StringBuffer and StringBuilder in Java

In Java, `StringBuffer` and `StringBuilder` are classes used for string manipulation. They provide similar functionality but differ in terms of synchronization and performance characteristics.

## StringBuffer

- Introduced in Java 1.0.
- Thread-safe: multiple threads can safely access and modify a `StringBuffer` object concurrently.
- Operations are synchronized, which makes it slower compared to `StringBuilder` in single-threaded environments.
- Suitable for multithreaded applications where thread safety is required.

### Example

```java
StringBuffer stringBuffer = new StringBuffer();
stringBuffer.append("Hello");
stringBuffer.append(" World");
String result = stringBuffer.toString(); // Result: "Hello World"
```

### StringBuilder

- Introduced in Java 5.0.
- Not thread-safe: operations on StringBuilder are not synchronized.
- Faster compared to StringBuffer in single-threaded environments.
- Suitable for single-threaded applications where better performance is desired.

#### Example

```java
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("Hello");
stringBuilder.append(" World");
String result = stringBuilder.toString(); // Result: "Hello World"
```
