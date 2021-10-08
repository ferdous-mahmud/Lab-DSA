import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

public class FracKanpDriver{
   public static void main(String[] args){

      int capacity, num, i;

      // File input
      try {
         File myObj = new File("src/FracInput.txt");
         Scanner input = new Scanner(myObj);
         
         num = input.nextInt();
         capacity = input.nextInt();

         float weight[] = new float[num];
         float profit[] = new float[num];
         float ratio[] = new float[num];
   
         for(i = 0; i < num; i++){
            profit[i] = input.nextFloat();
            weight[i] = input.nextFloat();
      
            ratio[i] = profit[i] / weight[i];
         }

         input.close();

         FracKnapCalculator knapsackCal = new FracKnapCalculator(num, profit, weight, ratio, capacity);
         
         // Output in a File
         try {
            FileWriter myWriter = new FileWriter("src/FracOutput.txt");
            myWriter.write("Maximum Profit: "+knapsackCal.getMaxProfit()+"\n");

            float[] givenItem = knapsackCal.getGivenItem();

            for(i = 0; i < num; i ++){
               if(givenItem[i] > 0){
                  myWriter.write(i+1+"th item taken ");
                  myWriter.write(Float.toString(givenItem[i]));
                  myWriter.write(" times \n");
               }
            }

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
}

//    #- Input format - #
// line 1 - Number of Item
// line 2 - knapsack`s capacity
// line 3 - First items profit
// line 4 - First items weight
// line 5 - Second items profit
// line 6 - Second items profit
// line n - ....



//    #- Output format - #
// line 1 - Max Profit
// line 2 - nth item taken n times
// line 3 - nth item taken n times
// line 4 - ....
// line N - nth item taken n times
