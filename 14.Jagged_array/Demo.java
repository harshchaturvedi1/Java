public class Demo {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];

        jagged[0] = new int[3];
        jagged[1] = new int[2];
        jagged[2] = new int[1];

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.println("(" + i + " ," + j + ")" + "=>" + jagged[i][j]);
            }
        }

        System.out.println("jagged array value =>" + jagged);

        for (int i = 0; i < jagged.length; i++) {
            System.out.println("jagged array index " + i + " value =>" + jagged[i]);
        }

    }
}