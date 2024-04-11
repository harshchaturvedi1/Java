# HashMap Class

The `HashMap` class in Java is a part of the Java Collections Framework and provides a way to store key-value pairs. It uses a hash table to store the elements and provides constant-time performance for basic operations such as adding, removing, and retrieving elements.

## Common Methods

### 1. `V put(K key, V value)`

Associates the specified value with the specified key in the map. If the map previously contained a mapping for the key, the old value is replaced.

- Parameters:

  - `key`: The key with which the specified value is to be associated.
  - `value`: The value to be associated with the specified key.

- Returns:
  - The previous value associated with the specified key, or `null` if there was no mapping for the key.

### 2. `V get(Object key)`

Returns the value to which the specified key is mapped, or `null` if this map contains no mapping for the key.

- Parameters:

  - `key`: The key whose associated value is to be returned.

- Returns:
  - The value to which the specified key is mapped, or `null` if the map contains no mapping for the key.

### 3. `boolean containsKey(Object key)`

Returns `true` if this map contains a mapping for the specified key.

- Parameters:

  - `key`: The key whose presence in this map is to be tested.

- Returns:
  - `true` if this map contains a mapping for the specified key, otherwise `false`.

### 4. `V remove(Object key)`

Removes the mapping for the specified key from this map if present.

- Parameters:

  - `key`: The key whose mapping is to be removed from the map.

- Returns:
  - The previous value associated with the specified key, or `null` if there was no mapping for the key.

### 5. `int size()`

Returns the number of key-value mappings in this map.

- Returns:
  - The number of key-value mappings in this map.

## Example Usage

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        // Printing the elements of the map
        System.out.println("Map: " + map);

        // Removing a key-value pair from the map
        map.remove("banana");

        // Checking if a key exists in the map
        System.out.println("Contains key 'banana': " + map.containsKey("banana"));

        // Getting the value associated with a key
        System.out.println("Value for key 'apple': " + map.get("apple"));

        // Getting the size of the map
        System.out.println("Size of the map: " + map.size());
    }
}
```
