```java
class HelloWorld{
    public static void main(String[] args){
        PrintAble p = new PrintPaySlip();
        BonusCalculator b = new DefaultBonusCalculator();

        Employee e1 = new Employee("John" , 1000);

        System.out.println(b.calculateBonus(e1 , .1));
        p.print(e1);

    }
}

interface BonusCalculator{
    double calculateBonus(Employee employee,  double percentage);
}

interface PrintAble{
    void print(Employee employee);
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

}

class PrintPaySlip implements PrintAble{
    public void print(Employee employee){
        System.out.println("Employee name => " + employee.getName());
        System.out.println("Employee salary => " + employee.getSalary());
    }
}

class DefaultBonusCalculator implements BonusCalculator{
    // @override
    public double calculateBonus(Employee employee,  double percentage){
        return employee.getSalary() * percentage;
    }
}

```
