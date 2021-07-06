import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Triangle triangleA = new Triangle(15, 8, 15, 8, 8);
    Triangle triangleB = new Triangle(3, 2.98, 3, 3, 3);

    Student studentA = new Student("Luke", "Chatelain", 2021, 1.9, "Java" );
    studentA.badStudent();


    System.out.println(studentA.graduationYear);
    System.out.println(studentA.studentProfile());

  }
}
