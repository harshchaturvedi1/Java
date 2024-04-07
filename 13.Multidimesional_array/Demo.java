public class Demo {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("(" + i + ", " + j + "): " + nums[i][j]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100) + 1;
            }
        }

        // Math.random(): This method returns a random double value between 0.0
        // (inclusive) and 1.0 (exclusive). So, Math.random() generates a random number
        // in the range [0.0, 1.0).

        // (Math.random() * 100): This part multiplies the random double value generated
        // by Math.random() by 100. This effectively scales the random number to be in
        // the range [0.0, 100.0). So, the result will be a random double in the range
        // [0.0, 100.0).

        // (int) (Math.random() * 100): Casting the result to an int truncates the
        // decimal part, effectively rounding down to the nearest integer. This means
        // that the result will be an integer between 0 and 99 inclusive.

        // (int) (Math.random() * 100) + 1: Adding 1 to the result shifts the range of
        // possible values from [0, 99] to [1, 100]. So, the expression now generates a
        // random integer between 1 and 100 inclusive.

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("(" + i + ", " + j + "): " + nums[i][j]);
            }
        }

        int[][] initialize = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < initialize.length; i++) {
            for (int j = 0; j < initialize[i].length; j++) {
                System.out.println("(" + i + ", " + j + "): " + initialize[i][j]);
            }
        }

    }
}
