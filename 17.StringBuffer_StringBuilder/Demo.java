public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Harsh");
        System.out.println("capacity before append " + sb.capacity());
        sb.append(" Chaturvedi Umariya");

        System.out.println(sb);
        System.out.println("capacity after append " + sb.capacity());
        System.out.println(sb.length());

        // String str = sb.toString();
        // System.out.println(str);

        // sb.delete(0, 0);
        sb.insert(0, "Java");
        System.out.println(sb);

        sb.insert(16, "Java2");
        System.out.println(sb);

        sb.setLength(14);
        System.out.println(sb);

    }
}
