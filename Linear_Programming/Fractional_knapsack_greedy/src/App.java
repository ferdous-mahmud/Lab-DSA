import java.util.Scanner;

public class App{
   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      int capacity, num, i;

      System.out.print("Enter number of objects: ");
      num = input.nextInt();

      float weight[] = new float[num];
      float profit[] = new float[num];
      float ratio[] = new float[num];


      System.out.println("Enter profit & weight of each objects: ");
      for(i = 0; i < num; i++){
         profit[i] = input.nextFloat();
         weight[i] = input.nextFloat();

         ratio[i] = profit[i] / weight[i];
      }

      System.out.print("Enter knapsack`s capacity: ");
      capacity = input.nextInt();


      KnapsackCalculator knapsackCal = new KnapsackCalculator(num, profit, weight, ratio, capacity);

      System.out.println("Maximum Profit: "+knapsackCal.getMaxProfit());
      float[] givenItem = knapsackCal.getGivenItem();

      for(i = 0; i < num; i ++){
         if(givenItem[i] > 0){
            System.out.print(i+1+"th item taken ");
            System.out.printf("%.2f", givenItem[i]);
            System.out.print(" times \n");
         }
      }

      input.close();
   }
}