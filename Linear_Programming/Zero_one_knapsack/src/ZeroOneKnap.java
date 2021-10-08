import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZeroOneKnap {
    public static void main(String[] args) throws Exception {

      try {
        File myObj = new File("src/ZeroOneInput.txt");
        Scanner input = new Scanner(myObj);
        
        int size = input.nextInt();
        int capacity = input.nextInt();

        int value[] = new int[size];
        int weight[] = new int[size];
  
        int i = 0;
        for(i = 0; i < size; i++){
            value[i] = input.nextInt();
            weight[i] = input.nextInt();
        }
        input.close();

        // Output in a File
        try {
           FileWriter myWriter = new FileWriter("src/ZeroOneOutput.txt");

           int maxProfit = knapsacksCalculator(value, weight, size - 1, capacity);
           myWriter.write("Max profit: "+maxProfit);
           
           myWriter.close();
           System.out.println("Done!");
        } catch (IOException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();
        }

      // Handaling Error
      } catch (FileNotFoundException exeption) {
        System.out.println("An error occurred when getting input form file.");
        exeption.printStackTrace();
      }
    }

    // Recursive function
    public static int knapsacksCalculator(int value[], int weight[], int size, int capacity){

        // Negative capcaity or wrong size & capacity
        if(capacity < 0 || size < 0 || capacity == 0){
            return 0;
        }

        int include = value[size] + knapsacksCalculator(value, weight, size - 1, capacity - weight[size]);
        int exclude = knapsacksCalculator(value, weight, size - 1, capacity);

        return Math.max(include, exclude);
    }
}
