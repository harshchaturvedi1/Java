# Stack in Java

## Introduction

A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. It means that the element which is inserted last is the first one to be removed. In Java, the `Stack` class is a part of the `java.util` package and extends the `Vector` class. However, it's recommended to use the `Deque` interface and its implementations (`ArrayDeque` or `LinkedList`) instead of `Stack` for more flexibility and better performance.

## Declaration

To use a Stack in Java, you can import the `java.util.Stack` class:

```java
import java.util.Stack;

Stack<Type> stack = new Stack<>();
```

Certainly! Here's a simple documentation on the Stack data structure in Java using Markdown format:

markdown
Copy code

# Stack in Java

## Introduction

A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. It means that the element which is inserted last is the first one to be removed. In Java, the `Stack` class is a part of the `java.util` package and extends the `Vector` class. However, it's recommended to use the `Deque` interface and its implementations (`ArrayDeque` or `LinkedList`) instead of `Stack` for more flexibility and better performance.

## Declaration

- To use a Stack in Java, you can import the `java.util.Stack` class:

```java
import java.util.Stack;

Stack<Type> stack = new Stack<>();
```

- Replace Type with the type of elements you want to store in the Stack.

## Basic Operations

### Push

- You can add elements to the top of the Stack using the push() method:

```java
stack.push(element);
```

### Pop

- You can remove and return the top element of the Stack using the pop() method:

```java
Type element = stack.pop();
```

### Peek

- You can peek at the top element of the Stack without removing it using the peek() method:

```java
Type element = stack.peek();

```

### isEmpty

- You can check if the Stack is empty using the isEmpty() method:

```java
boolean isEmpty = stack.isEmpty();
```

### Size

- You can get the number of elements in the Stack using the size() method:

```java
int size = stack.size();
```

## Example

- Here's a simple example demonstrating the usage of a Stack in Java:

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
```

## Conclusion

- Stacks are a fundamental data structure in computer science and are widely used in various algorithms and applications. In Java, the Stack class provides a convenient way to implement stacks, but it's recommended to use the Deque interface and its implementations for better performance and flexibility.
