public class Demo {

    public static void main(String[] args) {
        int[] num = new int[4];
        int[] num2 = { 5, 6, 7 };

        System.out.println("num 1==>" + num[0]);
        System.out.println("num 1==>" + num[1]);
        System.out.println("num 1==>" + num[2]);
        System.out.println("num 1==>" + num[3]);

        // printing values of array
        for (int i = 0; i < num2.length; i++) {
            System.out.println("num 2==>" + num2[i]);
        }

        // changing values in array
        num2[0] = 8;
        System.out.println("num 2 changed==>" + num2[0]);
    }
}