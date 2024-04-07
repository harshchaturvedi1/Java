# Multidimensional Arrays in Java

Multidimensional arrays in Java are arrays of arrays, allowing for the creation of matrices and other complex data structures with multiple dimensions.

## Declaration and Initialization

### Declaration

```java
dataType[][] arrayName; // Preferred way
// or
dataType arrayName[][];
```

### Initialization

```java
dataType[][] arrayName = new dataType[rowSize][columnSize];
```

### Example

```java
int[][] matrix = new int[3][3]; // 3x3 matrix

```

### Accessing Elements

```java
int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
int element = matrix[1][2]; // Accessing element at row 1, column 2 (6)
```

### Operations

- Iterating Through a Multidimensional Array

```java
int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### Enhanced for Loop (for-each)

```java
int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
for (int[] row : matrix) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

### Notes

- Multidimensional arrays in Java are essentially arrays of arrays.
- The number of dimensions specifies the level of nesting.
- Each dimension of a multidimensional array can have a different size.
