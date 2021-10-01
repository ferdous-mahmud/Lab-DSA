public class BankAccount {
    protected String ownersName;
    protected int accountNumber;
    protected float balance;

    public BankAccount(String ownersName, int accountNumber, float balance){
        this.ownersName = ownersName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(float amount){
        if(amount > 0.0){
            balance += amount;
            System.out.println("Amount "+amount+" deposit successful");
        }
    }

    public void withdraw(float amount){
        if(amount > 0.0 && balance >= amount){
            balance -= amount;
            System.out.println("Amount "+amount+" withdraw successful");
        }
    }

    public float getBalance(){
        return balance;
    }
}
