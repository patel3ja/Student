class Student {
  String name;
  double gpa;
  String major;

  String getName() {
    return name;
  }

  double getGPA() {
    return gpa;
  }

  String getMajor() {
    return major;
  }

  void setName(String theName) {
    name = theName;
  }

  void setGPA(double theGPA) {
    gpa = theGPA;
  }

  void setMajor(String theMajor) {
    major = theMajor;
  }

  public static void print() {
    Student student1 = new Student();
    student1.name = "Arnold Spielberg";
    student1.gpa = 4.0;
    student1.major = "Electrical Engineering";

    System.out.println("The student's name is " + student1.name);
    System.out.println("The student's GPA is " + student1.gpa);
    System.out.println("The student's major is " + student1.major);

    Student student2 = new Student();
    student2.name = "Jay Patel";
    student2.gpa = 4.3;
    student2.major = "Information Systems";

    System.out.println("The student's name is " + student2.name);
    System.out.println("The student's GPA is " + student2.gpa);
    System.out.println("The student's major is " + student2.major);    
  }

}