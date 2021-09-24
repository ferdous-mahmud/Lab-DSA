import java.util.Scanner;

class App {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double x1, x2 , f, fd , equvalue, root = 0, trueError = 0.0001;

      System.out.print("Please input value of x: ");
      x1 = input.nextDouble();
      f = f(x1);
      fd = fd(x1);
  
      do {
        System.out.println("x1: "+x1);
        x2 = x1 - (f/fd);
        System.out.println("x2: "+x2);

        if(Math.abs(x2 -x1) > trueError){
          x1 = x2;
          f = f(x1);
          fd = fd(x1);
          continue;
        }
        else if(f(x2) == 0){
          root = x2;
          break;
        }
        else{
          root = x2;
          break;
        }
      }while(root != x2);
      
      System.out.println("Root   : " + root);
      equvalue = f(root);
      System.out.println("f(Root): " + equvalue);
      input.close();
    }
  
    public static double f(double x) {
      return (x * x) - (2 * x) - 2;
    }

    public static double fd(double x){
      return (2 * x) - 2;
    }
  }