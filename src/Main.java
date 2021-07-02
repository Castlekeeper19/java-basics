import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int studentAge = 15;
    double studentGPA = 3.45;
    String studentFirstName = "Kayla";
    String studentLastName = "Hammon";
    char studentFirstIntial = studentFirstName.charAt(0);
    char studentLastIntial = studentLastName.charAt(0);
    boolean hasPerfectAttendance = true;

    System.out.println(studentFirstName + " " +studentLastName + " has a GPA of: " + studentGPA );
    System.out.println("What do you want to update it to?");

    Scanner input = new Scanner(System.in);
    studentGPA = input.nextDouble();

    System.out.println(studentFirstName + " " +studentLastName + " now has a GPA of: " + studentGPA );


  }
}
