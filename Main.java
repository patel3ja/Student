import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student.print();
    ArrayList<Double>gpa = new ArrayList<Double>();
    gpa.add(4.0);
    gpa.add(4.3);
    double sum = 0;
    for(int i = 0; i < gpa.size(); i++) {
    sum += gpa.get(i);
    }
    double avg;
    avg = sum / gpa.size();
    System.out.println("The average GPA is " + avg);
  }
}