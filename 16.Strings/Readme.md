# Strings in Java

Strings in Java are objects that represent sequences of characters. They are widely used for text processing and manipulation in Java programs.

## Declaration and Initialization

### Declaration

```java
String str;
```

- Java, new String() is a way to create a new String object using the default constructor. This constructor creates an empty string with a length of 0. Here's how you can use it:

```java
String emptyString = new String();
```

### Initialization

```java
String str = "Hello, World!";
```

### Example

```java
String greeting = "Hello";
```

### Example2

```java
char[] charArray = {'H', 'e', 'l', 'l', 'o'};
String helloString = new String(charArray);
```

### String Concatenation

- Strings can be concatenated using the + operator.

```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName; // Result: "John Doe"
```

### Methods and Operations

#### Length

- The length() method returns the length of the string.

```java
String str = "Hello";
int length = str.length(); // Result: 5
```

#### Concatenation

- Strings can also be concatenated using the concat() method.

```java
String str1 = "Hello";
String str2 = "World";
String result = str1.concat(str2); // Result: "HelloWorld"
```

#### Substring

- The substring() method returns a substring of the string.

```java
String str = "Hello, World!";
String substr = str.substring(7); // Result: "World!"
```

#### Comparison

- Strings can be compared using the equals() method for content comparison and compareTo() method for lexicographical comparison.

```java
String str1 = "Hello";
String str2 = "Hello";
boolean isEqual = str1.equals(str2); // Result: true
int comparison = str1.compareTo(str2); // Result: 0 (equal)
```

#### Conversion

- Strings can be converted to uppercase and lowercase using the toUpperCase() and toLowerCase() methods, respectively.

```java
String str = "Hello";
String upper = str.toUpperCase(); // Result: "HELLO"
String lower = str.toLowerCase(); // Result: "hello"
```

### Notes

- Strings in Java are immutable, meaning their values cannot be changed once created.
- String literals (e.g., "Hello") are stored in the string pool, which saves memory by reusing existing string literals.
- Use StringBuilder or StringBuffer for mutable strings if frequent manipulation is required.
