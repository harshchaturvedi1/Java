public class Demo {
    public static void main(String[] args) {
        // direct initialization
        // String str = "Harsh";

        // initialize later
        // String str = new String();
        // str = "Harsh";

        // initialization 2
        String str = new String("Harsh");

        System.out.println(str);
        System.out.println(str.hashCode());
        System.out.println("Hello `" + str);
        System.out.println(str.charAt(0));
    }
}
