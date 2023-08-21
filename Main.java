public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", 1000);
        BankAccount account2 = new BankAccount("67890", 500);

        account1.displayAccountInfo();
        account1.deposit(200);
        account1.withdraw(300);

        account2.displayAccountInfo();
        account2.withdraw(700);
    }
}