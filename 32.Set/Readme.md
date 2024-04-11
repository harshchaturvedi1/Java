# Set Interface

The `Set` interface in Java is a part of the Java Collections Framework and represents a collection of unique elements. A `Set` does not allow duplicate elements and does not guarantee the order of elements.

## Common Methods

### 1. `boolean add(E e)`

Adds the specified element to the set if it is not already present.

- Parameters:

  - `e`: The element to be added to the set.

- Returns:
  - `true` if the set did not already contain the specified element, otherwise `false`.

### 2. `boolean remove(Object o)`

Removes the specified element from the set if it is present.

- Parameters:

  - `o`: The element to be removed from the set.

- Returns:
  - `true` if the set contained the specified element, otherwise `false`.

### 3. `boolean contains(Object o)`

Returns `true` if the set contains the specified element, otherwise `false`.

- Parameters:

  - `o`: The element whose presence in the set is to be tested.

- Returns:
  - `true` if the set contains the specified element, otherwise `false`.

### 4. `int size()`

Returns the number of elements in the set.

- Returns:
  - The number of elements in the set.

### 5. `void clear()`

Removes all elements from the set.

## Implementing Classes

Some commonly used implementing classes of the `Set` interface in Java include:

- `HashSet`: Stores elements using a hash table.
- `TreeSet`: Stores elements in sorted order using a red-black tree.
- `LinkedHashSet`: Maintains insertion order while also allowing unique elements.

## Example Usage 1

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating a HashSet of integers
        Set<Integer> set = new HashSet<>();

        // Adding elements to the set
        set.add(10);
        set.add(20);
        set.add(30);

        // Printing the elements of the set
        System.out.println("Set: " + set);

        // Removing an element from the set
        set.remove(20);

        // Checking if an element exists in the set
        System.out.println("Contains 20: " + set.contains(20));

        // Getting the size of the set
        System.out.println("Size of the set: " + set.size());

        // Clearing the set
        set.clear();

        // Printing the elements of the set after clearing
        System.out.println("Set after clearing: " + set);
    }
}
```

## Example Usage 2

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Printing the elements of the set
        System.out.println("Set: " + set);

        // Removing an element from the set
        set.remove("banana");

        // Checking if an element exists in the set
        System.out.println("Contains 'banana': " + set.contains("banana"));

        // Getting the size of the set
        System.out.println("Size of the set: " + set.size());

        // Clearing the set
        set.clear();

        // Printing the elements of the set after clearing
        System.out.println("Set after clearing: " + set);
    }
}
```
