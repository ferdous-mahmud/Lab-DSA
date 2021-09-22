package oop;
import java.util.*;

public class Runner{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Scanner stringInput = new Scanner(System.in);

    System.out.print("Please input company size: ");
    int size  = input.nextInt();
    System.out.println();

    Employee employe[] = new Employee[size];

    for(int i = 0; i < size; i++){
      System.out.print("Input "+ i +"th Employee name: ");
      String name = stringInput.nextLine();
      System.out.print("Input "+ i +"th Employee age: ");
      int age = input.nextInt();
      employe[i] = new Employee(name, age);
      System.out.println();
    }

    System.out.println(employe[0].getName()+" "+employe[0].getAge());
    System.out.println(employe[1].getName()+" "+employe[1].getAge());
    System.out.println(employe[2].getName()+" "+employe[2].getAge());
    System.out.println(employe[3].getName()+" "+employe[3].getAge());
  }
}