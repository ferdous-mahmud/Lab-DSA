import java.util.*;

public class Dec2Bin{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // creating a stack
        Stack<Integer> stack = new Stack<Integer> ();

        // getting decimal input
        System.out.print("Please input decimal number : ");
        int number = input.nextInt();

        // checking number == 0
        if(number == 0){
            System.out.println("Converted Binary : 0");
        }
        else{
            while(number > 0){
                int remainder = number % 2;
                // pushing remainder inside the stack
                stack.push(remainder);
                number /= 2;
            }

            //Printing binary Number output
            System.out.print("Converted Binary : ");
            while(!(stack.isEmpty())){
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}