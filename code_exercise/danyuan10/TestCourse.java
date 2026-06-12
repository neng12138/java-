package java_code.danyuan10;

public class TestCourse {
  public static void main(String[] args) {
    System.out.println();

    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");

    course1.addStudent("Peter");
    course1.addStudent("Kim Smith");
    course1.addStudent("Anne Kennedy");

    course2.addStudent("Jhones");
    course2.addStudent("Setev");

    System.out.println("Number of students in coursel: "+course1.getNumberofstudent());

    String[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberofstudent(); i++) {
      System.out.print(students[i] + ", ");
    }

      System.out.println();
      System.out.println("Number of student in course2: "+course2.getNumberofstudent());
  }
}


class Course{
  private String coursename;
  private String[] students = new String[100];
  private int numberofstudent;

  Course(String coursename){
    this.coursename = coursename;
  }

  void addStudent(String student){
    students[numberofstudent] = student;
    numberofstudent++;
  }

  String[] getStudents(){
    return students;
  }

  int getNumberofstudent(){
    return numberofstudent;
  }

  String getCoursename(){
    return coursename;
  }
}

