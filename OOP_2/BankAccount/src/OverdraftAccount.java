public class OverdraftAccount extends BankAccount {
    public OverdraftAccount(String ownersName, int accountNumber, float balance) {
        super(ownersName, accountNumber, balance);
    }

    private float limit =  30000;

    public void setLimit(float limit){
        this.limit = limit;
    }

    public void withdraw(float amount){
        if(amount > 0.0 && limit >= amount ){
            balance -= amount;
            System.out.println("Amount "+amount+" withdraw successful");
        }
        else{
            System.out.println("Error!  Account limit "+limit);
        }
    }
}
