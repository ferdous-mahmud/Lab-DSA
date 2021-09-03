import java.util.*;
public class Queue{
    
    // Global variables 
    public static int CAPACITY = 5;
    public static int ourQueue[] = new int[CAPACITY];
    public static int totalItem = 0, front = 0, rear = -1;

    // Check queue empty or not
    public static boolean isEmpty(){
        if(totalItem == 0){
            return true;
        }
        return false;
    }

    // Check queue full or not
    public static boolean isFull(){
        if(totalItem == CAPACITY){
            return true;
        }
        return false;
    }

    // Method for add item on queue
    public static void enqueue(int item){
        if(isFull()){
            System.out.println("Sorry! The queue is full.");
            return;
        }
        // Circular array
        rear = (rear + 1) % CAPACITY;
        ourQueue[rear] = item;
        totalItem ++;
    }

    // Method for remove and return item from queue
    public static int dequeue(){
        if(isEmpty()){
            System.out.println("Sorry! The queue is empty.");
            return -1;
        }
        // Circular array
        int frontItem = ourQueue[front];
        ourQueue[front] = -1;
        front = (front + 1) % CAPACITY;
        totalItem --;
        return frontItem; 
    }

    // Printing ourQueue
    public static void printQueue(){
        System.out.print("Queue : ");
        for (int i = 0; i < CAPACITY; i++){
            System.out.print(ourQueue[i]+ " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args){
        enqueue(11);
        enqueue(12);
        enqueue(13);
        enqueue(14);
        enqueue(15);
        printQueue();
        dequeue();
        printQueue();
        enqueue(16);
        printQueue();
    }
}