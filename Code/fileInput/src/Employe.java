public class Employe{
  private String name;
  private int id;
  private String address;
  private int salary;


  public Employe(String name, int id, String address, int salary){
    this.name = name;
    this.id = id;
    this.address = address;
    this.salary = salary;
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

  public void setSalary(int salary){
    this.salary = salary;
  }

  public int getSalary(){
    return salary;
  }
}
