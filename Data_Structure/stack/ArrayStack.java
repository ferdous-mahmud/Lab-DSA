package stack;
import java.util.*;

public class ArrayStack<E> {
    private E[] data;
    private int top = -1;
    private int capacity;

    public ArrayStack(int capacity){
        this.capacity = capacity;
        data = (E[]) new Object[capacity];
    }

    public void initializeStack(){
        //
        //
        // implement or make change here
    }

    // check stack size
    public int size(){
        return top + 1;
    }

    // Check stack empty or not
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    // check stack full or not
    public boolean isFull(){
        if(top == capacity - 1){
            return true;
        }
        else{
            return false;
        }
    }

    // add new element on top of stack
    public void push(E value) throws IllegalStateException {
        if(isFull()) throw new IllegalStateException("Stack is Full");
        top ++;
        data[top] = value;
    }

    // Remove element from top of stack and return it
    public E pop(){
        if(isEmpty()) throw new IllegalStateException("Stack is Empty");
        E value = data[top];
        data[top] = null; // free up memory
        top --;
        return value;
    }

    // return top element of stack
    public E peek(){
        E value = data[top];
        return value;
    }


    // Main method
    /* public static void main(String[] args){
        
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
    } */

}