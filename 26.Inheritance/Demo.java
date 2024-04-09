public class Demo {
    public static void main(String[] a) {
        Calc obj = new Calc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        System.out.println(r1 + " " + r2);

        AdvCalc obj2 = new AdvCalc();
        int r3 = obj2.add(4, 5);
        int r4 = obj2.sub(7, 3);
        int r5 = obj2.multi(7, 3);
        int r6 = obj2.div(4, 2);
        System.out.println(r3 + " " + r4 + " " + r5 + " " + r6);
    }
}
