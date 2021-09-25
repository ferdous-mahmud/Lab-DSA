import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

    int totalItem = 3;
    int capacity = 50;
    int index = 0;
    Items items[] = new Items[totalItem];


    try {
      File myObj = new File("src/input.txt");
      Scanner input = new Scanner(myObj);

      while (input.hasNextLine() && totalItem > index) {
        String itemName = input.next();
        String profit = input.next();
        String weight = input.next();
        

        items[index] = new Items(itemName, Integer.valueOf(profit), Integer.valueOf(weight));
        index ++;
      }
      input.close();
    // Error
    } catch (FileNotFoundException exeption) {
      System.out.println("An error occurred when getting input form file.");
      exeption.printStackTrace();
    }
    System.out.println();
    System.out.println(items[0].getItemsName());

    double ratio[] = new double[totalItem];
    int profit[] = new int[totalItem];
    int weight[] = new int[totalItem];

    for(int i = 0; i < totalItem; i++){
        ratio[i] = items[i].getRatio();
        profit[i] = items[i].getProfit();
        weight[i] = items[i].getWeight();

    }

    for (double element: ratio) {
        System.out.println(element);
    }

    Arrays.sort(ratio);

    for (double element: ratio) {
        System.out.println(element);
    }

  }
}
