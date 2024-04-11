# ArrayList in Java

## Introduction

ArrayList is a part of the Java Collections Framework and is found in the java.util package. It is a resizable array implementation of the List interface. Unlike arrays, ArrayLists can dynamically grow and shrink in size. They provide better flexibility and functionality compared to arrays.

## Declaration

To use ArrayList, you need to import the java.util package and then declare an ArrayList object:

```java
import java.util.ArrayList;

ArrayList<Type> listName = new ArrayList<Type>();
```

- Replace Type with the type of elements you want to store in the ArrayList.

## Basic Operations

### Adding Elements

- You can add elements to an ArrayList using the add() method:

```java
listName.add(element);
```

### Accessing Elements

- You can access elements in an ArrayList using the get() method, which takes the index of the element as an argument:

```java
Type element = listName.get(index);
```

### Removing Elements

- You can remove elements from an ArrayList using the remove() method, which takes the index of the element to be removed as an argument:

```java
listName.remove(index);
```

### Size

- You can get the size of an ArrayList using the size() method:

```java
int size = listName.size();
```

### Iterating through ArrayList

- You can iterate through an ArrayList using enhanced for loop or using Iterator:

```java
// Using enhanced for loop
for (Type element : listName) {
    // Do something with each element
}

// Using Iterator
Iterator<Type> iterator = listName.iterator();
while (iterator.hasNext()) {
    Type element = iterator.next();
    // Do something with each element
}
```

## Additional Operations

- `isEmpty() `: Returns true if the ArrayList is empty.
- `contains(Object o) `: Returns true if the ArrayList contains the specified element.
- `clear()`: Removes all elements from the ArrayList.
- `addAll(Collection<? extends Type> c)`: Adds all elements of a collection to the ArrayList.

## Advantages

- `Dynamic size`: ArrayLists can grow and shrink dynamically.
- `Easy manipulation`: Provides methods for easy addition, removal, and retrieval of elements.
- `Compatible with generics`: Supports generics, allowing type-safe collections.
