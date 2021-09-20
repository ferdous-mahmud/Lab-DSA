package fileReader;

import java.util.*;

public class Employee{
  private String name;
  private int id;
  private String address;
  private int age;


  public Employee(String name, int id, String address, int age){
    this.name = name;
    this.id = id;
    this.address = address;
    this.age = age;
  }

  public  void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setId(int id){
    this.id = id;
  }

  public int getId(){
    return id;
  }

  public void setAddress(String address){
    this.address = address;
  }

  public String getAddress(){
    return address;
  }

  public void setAge(int age){
    this.age = age;
  }

  public int getAge(){
    return age;
  }

  
}