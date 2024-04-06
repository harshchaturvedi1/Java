class Calculator {
    int a;

    public int add(int num1, int num2) {
        return num1 + num2;

    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }
}

public class Demo {
    public static void main(String a[]) {

        Calculator calObj = new Calculator();
        int result = calObj.add(3, 4);
        System.out.println(result);
        int result2 = calObj.add(3, 4, 5);
        System.out.println(result2);

    }
}