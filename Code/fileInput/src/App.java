import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    int companySize = 5;
    int index = 0;
    Employe employe[] = new Employe[companySize];


    try {
      File myObj = new File("src/input.txt");
      Scanner input = new Scanner(myObj);

      while (input.hasNextLine() && companySize > index) {
        String name = input.next();
        String id = input.next();
        String address = input.next();
        String salary = input.next();

        employe[index] = new Employe(name, Integer.valueOf(id), address, Integer.valueOf(salary));
        index ++;
      }
      input.close();
    // Error
    } catch (FileNotFoundException exeption) {
      System.out.println("An error occurred when getting input form file.");
      exeption.printStackTrace();
    }

    int salary = 1;
    int higher = 0;

    for(int i = 0; i < companySize; i++){
     if(employe[i].getSalary() > salary){
       salary = employe[i].getSalary();
       higher = i;
     }
    }
    System.out.println("High paid employe: "+ employe[higher].getName()+" Salary: "+employe[higher].getSalary());
    }
}


 

