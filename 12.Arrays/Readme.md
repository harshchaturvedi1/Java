# Arrays in Java

Arrays in Java are objects that store multiple variables of the same type. They provide a way to store and access elements of the same data type in contiguous memory locations. Arrays offer various operations for manipulation and retrieval of elements.

## Declaration and Initialization

### Declaration

```java
dataType[] arrayName; // Preferred way
// or
dataType arrayName[];
```

### Initialization

```java
dataType[] arrayName = new dataType[size];
```

### Example

```java
int[] numbers = new int[5]; // Array of integers with size 5
```

### Accessing Elements

- Elements in an array can be accessed using the index, which starts from 0 and goes up to length - 1.

```java
int[] numbers = {10, 20, 30, 40, 50};
int firstElement = numbers[0]; // Accessing first element
int lastElement = numbers[numbers.length - 1]; // Accessing last element
```

### Operations

- Iterating Through an Array

```java
int[] numbers = {10, 20, 30, 40, 50};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Enhanced for Loop (for-each)

```java
int[] numbers = {10, 20, 30, 40, 50};
for (int number : numbers) {
    System.out.println(number);
}

```

### Arrays.copyOf()

- Creates a copy of an array with the specified length.

```java
int[] sourceArray = {1, 2, 3, 4, 5};
int[] copiedArray = Arrays.copyOf(sourceArray, 3); // Creates a copy of first 3 elements
```

### Arrays.sort()

- Sorts the specified array into ascending numerical order.

```java
int[] numbers = {5, 2, 8, 1, 3};
Arrays.sort(numbers); // Sorts the array
```

### Arrays.toString()

- Returns a string representation of the contents of the specified array.

```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(Arrays.toString(numbers)); // Prints: [10, 20, 30, 40, 50]
```

### Multidimensional Arrays

- Arrays can have more than one dimension, allowing the creation of matrices and other complex data structures.

```java
int[][] matrix = new int[3][3]; // 3x3 matrix
matrix[0][0] = 1;
matrix[0][1] = 2;
// etc.
```

### Notes

- Arrays in Java are fixed in size once initialized. If dynamic resizing is required, consider using ArrayList.
- Arrays can only store elements of the same data type.
- Arrays use zero-based indexing.

### Default values in array if not initialize

```java
public class DefaultArrayValues {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        byte[] byteArray = new byte[5];
        short[] shortArray = new short[5];
        long[] longArray = new long[5];
        float[] floatArray = new float[5];
        double[] doubleArray = new double[5];
        char[] charArray = new char[5];
        boolean[] booleanArray = new boolean[5];
        Object[] objectArray = new Object[5];

        System.out.println("Default values for different array types:");
        System.out.println("int array: " + Arrays.toString(intArray));
        System.out.println("byte array: " + Arrays.toString(byteArray));
        System.out.println("short array: " + Arrays.toString(shortArray));
        System.out.println("long array: " + Arrays.toString(longArray));
        System.out.println("float array: " + Arrays.toString(floatArray));
        System.out.println("double array: " + Arrays.toString(doubleArray));
        System.out.println("char array: " + Arrays.toString(charArray));
        System.out.println("boolean array: " + Arrays.toString(booleanArray));
        System.out.println("object array: " + Arrays.toString(objectArray));
    }
}
```
