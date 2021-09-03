package stack;
import java.util.*;

public class Runner{
    public static void main(String[] args){
        
        int capacity = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter stack capacity value: ");

        capacity = input.nextInt();
        //Initialize stack
        ArrayStack<Integer> stack = new ArrayStack<Integer>(capacity);

        //push opertaion
        for(int i = 0; i < capacity; i ++){
            System.out.print("Please enter " +(i+1)+ "th value for push : ");
            int value = input.nextInt();
            stack.push(value);
            System.out.println("Success!  pushed " + value + " on position " + stack.size());
        }

        //peek opertation
        System.out.println("Peeked item = " +stack.peek());

        //pop operation
        for(int i = 0; i < capacity; i++){
            int position = stack.size();
            System.out.println("poping..."+ (i+1)+ "th value from the stack : " +stack.pop());
            System.out.println("Success! item removed form position " +position);
        }

        //check empty stack
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
    }
}