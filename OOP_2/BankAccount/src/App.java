public class App {
    public static void main(String[] args) throws Exception {
        
        // Normal Account
        BankAccount user1 = new BankAccount("User 1", 1, 50000);

        user1.deposit(20000);
        user1.withdraw(10000);
        System.out.println("User1`s balance: "+user1.getBalance());
        System.out.println();


        // Overdraft Account
        OverdraftAccount user2 = new OverdraftAccount("User 2", 2, 50000);

        user2.deposit(20000);
        user2.withdraw(10000);
        
        user2.setLimit(40000);
        user2.withdraw(41000);
        System.out.println("User2`s balance: "+user2.getBalance());
    }
}
