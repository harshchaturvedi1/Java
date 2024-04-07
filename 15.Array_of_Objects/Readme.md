# Arrays of Objects in Java

Arrays of objects in Java allow you to create and manipulate arrays where each element is an object of a class. This provides flexibility in storing and accessing multiple instances of objects in a structured manner.

## Declaration and Initialization

### Declaration

```java
ClassName[] arrayName;
```

### Initialization

```java
ClassName[] arrayName = new ClassName[arrayLength];

```

### Example

```java
// Define an array of Student objects with size 5
Student[] students = new Student[5];
```

### Creating and Initializing Objects in Array

- Objects must be created individually and then assigned to the array elements.

```java
students[0] = new Student("John", 20);
students[1] = new Student("Alice", 22);
// Initialize other elements similarly
```

### Accessing Elements

- Objects in the array are accessed using their index.

```java
Student student = students[0];
```

### Operations

#### Iterating Through an Array of Objects

- You can iterate through the array using loops.

```java
for (int i = 0; i < students.length; i++) {
System.out.println(students[i].getName());
}
```

### Enhanced for Loop (for-each)

- The enhanced for loop simplifies iterating through the array.

```java
for (Student student : students) {
    System.out.println(student.getName());
}
```

### Array Methods

- Arrays provide methods for sorting and searching elements.

```java
Arrays.sort(students); // Sort the array
int index = Arrays.binarySearch(students, targetStudent); // Search for a student
```

### Notes

- Arrays of objects can store instances of any class.
- Each element in the array is a reference to an object, not the object itself.
- Ensure that each element is initialized before accessing it, as uninitialized elements will throw a `NullPointerException`.
