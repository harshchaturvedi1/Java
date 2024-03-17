## type conversion and type cast

- type of variable can't be chaged

```java
byte b = 127;    // Valid byte literal within the range -128 to 127
int a = 256;     // Valid integer literal

b = a;           // This line will cause a compilation error.
// The error is: "Type mismatch: cannot convert from int to byte."
// This is because you're trying to assign a larger data type (int) to a smaller data type (byte) without explicit type casting.

// However, the reverse assignment will work:
a = b;           // This works because byte can be automatically promoted to int without loss of precision.
// This is an example of widening conversion, where a smaller data type is implicitly converted to a larger data type.

// To make the assignment from int to byte work, you need to perform explicit type casting:
b = (byte) a;    // This is type casting, where you explicitly tell the compiler to treat 'a' as a byte.
// This may result in loss of information if the value of 'a' is outside the range of byte (-128 to 127).


```
