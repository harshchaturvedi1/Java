# For Loop in Java

In Java, the `for` loop is a control flow statement that allows you to repeatedly execute a block of code a specified number of times. It's commonly used when you know the number of iterations in advance or when iterating over a range of values.

## Syntax

```java
for (initialization; condition; update) {
    // code to be executed in each iteration
}


for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

```

# Enhanced For Loop (for-each) in Java

In Java, the enhanced for loop, also known as the for-each loop, provides a concise way to iterate over arrays, collections, or any object that implements the `Iterable` interface. It simplifies the syntax of iterating over elements and is particularly useful when you want to iterate over all elements in a collection without needing to keep track of indices.

## Syntax

```java
for (type variableName : arrayOrCollection) {
    // code to be executed for each element
}


String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};

for (String fruit : fruits) {
    System.out.println(fruit);
}

```
