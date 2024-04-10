import tools.Calc;
import tools.AdvCalc;
import tools.VeryAdvCalc;

public class Demo {
    public static void main(String[] a) {
        Calc obj = new Calc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        System.out.println(r1 + " " + r2);

        // single inheritance
        AdvCalc obj2 = new AdvCalc();
        int r3 = obj2.add(4, 5);
        int r4 = obj2.sub(7, 3);
        int r5 = obj2.multi(7, 3);
        int r6 = obj2.div(4, 2);
        System.out.println(r3 + " " + r4 + " " + r5 + " " + r6);

        // multilevel inheritance
        VeryAdvCalc obj3 = new VeryAdvCalc();
        int r7 = obj3.add(4, 5);
        int r8 = obj3.sub(7, 3);
        int r9 = obj3.multi(7, 3);
        int r10 = obj3.div(4, 2);
        double r11 = obj3.power(4, 2);
        System.out.println(r7 + " " + r8 + " " + r9 + " " + r10 + " " + r11);
    }
}
