**Question 2:**
Consider the following class:

```java
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }
}

```

**Task:**
Refactor the above class so that it adheres to the Open/Closed Principle, allowing the bonus calculation to be extended without modifying the `Employee` class.
