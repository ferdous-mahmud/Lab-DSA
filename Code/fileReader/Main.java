package fileReader;

import java.io.File;
import java.io.FileNotFoundException;  //handle errors
import java.util.Scanner; 

public class Main {
  public static void main(String[] args) {

    int companySize = 6;
    int index = 0;
    Employee employe[] = new Employee[companySize];


    try {
      File myObj = new File("input.txt");
      Scanner input = new Scanner(myObj);

      while (input.hasNextLine() && companySize > index) {
        String name = input.nextLine();
        int id = input.nextInt();
        String address = input.nextLine();
        int age = input.nextInt();
        System.out.println(data);

        employe[index] = new Employe(name, id, address, age);
      }
      input.close();
    // Error
    } catch (FileNotFoundException exeption) {
      System.out.println("An error occurred when getting input form file.");
      exeption.printStackTrace();
    }

    int age = 1;
    int older = 0;

    for(int i = 0; i < companySize; i++){
     if(employe[i].getAge() > age){
       age = employe[i].getAge()
       older = i;
     }
    }

    System.out.println("Older employe: "+ employe[older].getName()+" Age: "+employe[0].getAge());
 
  }
}