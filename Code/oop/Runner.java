package oop;
import java.util.*;

public class Runner{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    Employee employe = new Employee("Ferdous", 404, "Jashore", 23);

    System.out.println(employe.getName());
  }
}