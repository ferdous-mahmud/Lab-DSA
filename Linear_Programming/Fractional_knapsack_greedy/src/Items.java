public class Items{
    private String itemName;
    private int profit;
    private int weight;
  
    public Items(String itemName, int profit, int weight){
      this.itemName = itemName;
      this.profit = profit;
      this.weight = weight;
    }
  
    public String getItemsName(){
      return itemName;
    }

    public int getProfit(){
      return profit;
    }

    public int getWeight(){
      return weight;
    }

    public double getRatio(){
        return profit / weight;
    }
  }
