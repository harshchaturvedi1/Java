```java
class HelloWorld{
    public static void main(String[] args){
        BonusCalculator bonusCalculator = new DefaultBonusCalculator();

        Employee employee = new Employee("john" , 1000, bonusCalculator);
        Employee employee2 = new Employee("john2" , 10000, bonusCalculator);

        System.out.println("Bonus1 " + employee.calculateBonus(.1));
        System.out.println("Bonus2 " + employee2.calculateBonus(.1));


    }
}

interface BonusCalculator{
    double calculateBonus(double salary, double percentage);
}

class DefaultBonusCalculator implements BonusCalculator{
    // @override
    public double calculateBonus(double salary, double percentage){
        return salary * percentage;
    }
}

class Employee {
    private String name;
    private double salary;
    private BonusCalculator bonusCalculator;

    public Employee(String name, double salary, BonusCalculator bonusCalculator) {
        this.name = name;
        this.salary = salary;
        this.bonusCalculator = bonusCalculator;
    }

    public double calculateBonus(double percentage) {
        return bonusCalculator.calculateBonus(salary,percentage);
    }
}




```
