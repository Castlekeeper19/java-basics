public class Student {
  String firstName;
  String lastName;
  int graduationYear;
  double gpa;
  String declaredMajor;

  public Student( String firstName, String lastName, int graduationYear, double gpa, String declaredMajor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.graduationYear = graduationYear;
    this.gpa = gpa;
    this.declaredMajor = declaredMajor;
  }

  public String studentProfile() {
    return this.firstName + " " + this.lastName;
  }

  public int badStudent() {
    if ((this.gpa) <= 2.0) {
      graduationYear += 1;
    }
    return graduationYear;
  }
}
