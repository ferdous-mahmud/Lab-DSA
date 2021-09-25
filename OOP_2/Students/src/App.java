import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    int totalStudent = 5;
    int index = 0;
    Student student[] = new Student[totalStudent];


    try {
      File file = new File("src/input.txt");
      Scanner input = new Scanner(file);

      while (input.hasNextLine() && totalStudent > index) {
        String name = input.next();
        String first = input.next();
        String second = input.next();
        String third = input.next();

        student[index] = new Student(name, Double.valueOf(first),Double.valueOf(second),Double.valueOf(third));
        index ++;
      }
      input.close();
    // Error
    } catch (FileNotFoundException exeption) {
      System.out.println("An error occurred when getting input form file.");
      exeption.printStackTrace();
    }

    double toper = student[0].calculateCGPA();
    double backbecnher = toper;
    int higher = 0;
    int lower = 0;

    for(int i = 0; i < totalStudent; i++){
        if(student[i].calculateCGPA() >= toper){
          toper = student[i].calculateCGPA();
          higher = i;
        }
        if(student[i].calculateCGPA() <= backbecnher){
          backbecnher = student[i].calculateCGPA();
          lower = i;
        }
    }

    System.out.println();
    System.out.println("Higher CGPA: "+String.format("%.2f",student[higher].calculateCGPA())+"  Name: "+student[higher].getName());
    System.out.println("Lower CGPA:  "+String.format("%.2f",student[lower].calculateCGPA())+"  Name: "+student[lower].getName());

  }
}