class Student {
    int rollNo;
    String name;
    int marks;
}

public class Demo {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.rollNo = 1;
        S1.name = "Harsh";
        S1.marks = 90;

        Student S2 = new Student();
        S2.rollNo = 2;
        S2.name = "Navin";
        S2.marks = 80;

        Student S3 = new Student();
        S3.rollNo = 3;
        S3.name = "Kiran";
        S3.marks = 70;

        Student[] students = new Student[3];
        students[0] = S1;
        students[1] = S2;
        students[2] = S3;

        // Example: Printing details of the first student
        // System.out.println("Roll No: " + students[0].rollNo);
        // System.out.println("Name: " + students[0].name);
        // System.out.println("Marks: " + students[0].marks);

        // iterating over array
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student details " + i + " =>");
            System.out.println("Roll No: " + students[i].rollNo);
            System.out.println("Name: " + students[i].name);
            System.out.println("Marks: " + students[i].marks);
        }
    }
}
