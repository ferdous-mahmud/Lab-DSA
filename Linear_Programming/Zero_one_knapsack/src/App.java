import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input number of total item: ");
        int size = input.nextInt();

        int value[] = new int[size];
        int weight[] = new int[size];

        int i = 0;
        System.out.println("Input value & weight for each item: ");
        for(i = 0; i < size; i++){
            value[i] = input.nextInt();
            weight[i] = input.nextInt();
        }

        System.out.print("Input knapsacks capacity: ");
        int capacity = input.nextInt();
        input.close();

        System.out.println("Max profit: "+knapsacksCalculator(value, weight, size - 1, capacity));


    }

    // Recursive function
    public static int knapsacksCalculator(int value[], int weight[], int size, int capacity){

        // Negative capcaity or wrong size & capacity
        if(capacity < 0 || size < 0 || capacity == 0){
            return 0;
        }

        int include = value[size] + knapsacksCalculator(value, weight, size - 1, capacity - weight[size]);

        int exclude = knapsacksCalculator(value, weight, size - 1, capacity);

        // TODO: Implement selected item logic
        // System.out.println("Item "+(capacity - 1)+" Selected");
    
        return Math.max(include, exclude);
    }
}
