package oop;

import java.util.*;

public class Employee{
  private String name;
  private int id;
  private String address;
  private int age;

  // constructor 
  public Employee(String name, int id, String address, int age){
    this.name = name;
    this.id = id;
    this.address = address;
    this.age = age;
  }

  // constructor overloading
  public Employee(String name, int age){
    this.name = name;
    this.age = age;
  }

  // setter method
  public  void setName(String name){
    this.name = name;
  }

  // getter method
  public String getName(){
    return name;
  }

  // setter method
  public void setId(int id){
    this.id = id;
  }

  // getter method
  public int getId(){
    return id;
  }

  // getter method
  public void setAddress(String address){
    this.address = address;
  }

  // getter method
  public String getAddress(){
    return address;
  }

  // setter method
  public void setAge(int age){
    this.age = age;
  }

  // getter method
  public int getAge(){
    return age;
  }

  
}