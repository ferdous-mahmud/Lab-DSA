public class Student{
    private String name;
    private double firstSemGPA;
    private double secondSemGPA;
    private double thirdSemGPA;
  
  
    public Student(String name, double firstSemGPA, double secondSemGPA, double thirdSemGPA){
      this.name = name;
      this.firstSemGPA = firstSemGPA;
      this.secondSemGPA = secondSemGPA;
      this.thirdSemGPA = thirdSemGPA;
    }

    public String getName(){
        return name;
    }

    public double calculateCGPA(){
        return ((firstSemGPA + secondSemGPA + thirdSemGPA) / 3);
    }
  }