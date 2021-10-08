public class FracKnapCalculator {
    private int num;
    private float profit[];
    private float weight[];
    private float ratio[];
    private int capacity, i , j;
    private float temp;
    private float maxProfit;
    
    // Array for keep track of givenItems
    float givenItem[];


    public FracKnapCalculator(int num, float profit[], float weight[], float ratio[], int capacity){
        this.num = num;
        this.profit = profit;
        this.weight = weight;
        this.ratio = ratio;
        this.capacity = capacity;
    }

    public float getMaxProfit(){

        // Sort item by using selection sort and reasign
        for (i = 0; i < num; i++) {
            for (j = i + 1; j < num; j++) {
                if (ratio[i] < ratio[j]) {
                    temp = ratio[j];
                    ratio[j] = ratio[i];
                    ratio[i] = temp;
        
                    temp = weight[j];
                    weight[j] = weight[i];
                    weight[i] = temp;
        
                    temp = profit[j];
                    profit[j] = profit[i];
                    profit[i] = temp;
                }
            }
        }

        float givenItem[] = new float[num];

        // Put zero on each positon
        for (i = 0; i < num; i++){
            givenItem[i] = 0;
        }
    
        for (i = 0; i < num; i++){
            if(weight[i] > capacity)
                break;
            else{
                // When item taken make zero to one
                givenItem[i] = 1;
                maxProfit += profit[i];
                capacity -= weight[i];
            }
        }

        if (i < num){
            givenItem[i] = capacity / weight[i];
        }

        maxProfit = maxProfit + (givenItem[i] * profit[i]);
        this.givenItem = givenItem;

        return maxProfit;
    }

    public float[] getGivenItem(){
        return givenItem;
    }
}
