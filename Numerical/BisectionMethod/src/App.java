//  Bisection Mehtod:
//  step 1: find two points (a , b) where a < b & f(a) * f(b) < 0
//  step 2: find mid point c = (a + b) / 2
//  step 3: if f(c) = 0 .  or next step ...
//  step 4: if f(c) * f(b) < 0 then a = c or b = c
//  step 5: repeat until f(c) = 0

class App {
    public static void main(String[] args) {
      double lower = 0, uper = 2, mid = 0, trueError = 0.1;
      
      double estimatedError = uper - lower;
      int count = 0;
  
      while (Math.abs(estimatedError) > trueError && count < 20 && f(mid) != 0) {
        // False position
        //mid = (lower * f(uper) - uper * f(lower)) / (f(uper) - f(lower));
        mid = (lower + uper) / 2;
        if (f(mid) * f(uper) < 0) {
          lower = mid;
          estimatedError = uper - lower;
        } else {
          uper = mid;
          estimatedError = uper - lower;
        }
        count++;
      }
      System.out.println("Root: " + mid);
      System.out.println("Estimated Error: " + estimatedError);
      System.out.println("Iteration Number: " + count);
    }
  
    public static double f(double x) {
      return (4*(x*x*x) - 6*(x * x) + (7 * x) - 2.3);
    }
  }