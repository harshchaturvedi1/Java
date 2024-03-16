## java code flow

person/developer => Java code => compiler (Javac) => byte code => jvm (built different for each machines) => os ==> hw

## jvm

- executes only <b>public static void main (`String a[]`)</b>

### java

- java is an oject oriented programming language
- object oriented programming languages means everything is an object

### hello world in Java

```java
class Hello {
    public static void main(String a[]){
        system.out.println("Hello world!");
    }
}
```

### JVM

- jvm is part of jre(java runtime environment)

### WORA (write once run anywhere)

- java is platform independent bcz of jvm , the other machine need only jvm and jre and no need for `JDK` to execute java code.

- jdk is needed by developer for development and jdk brings new/updated jre and jvm

#### java is strongly typed language

#### System.out.print

```java
System.out.println() // ==> moves control to next line
```
