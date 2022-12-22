package gr.aueb.cf.ch11OOP;

public class AccountMain {

    public static void main(String[] args) {
        Account alice = new Account(1, "GR1234","Alice","W", "R123",100.5);
        try {
            alice.deposit(1100);
            System.out.println("Successful deposit");

            alice.withdraw(400, "R123");
            System.out.println("Successful withdraw");

            System.out.println("Alice balance: " + alice.getAccountBalance());
            System.out.println(alice.getAccountState());

            alice.withdraw(200, "R456");
            System.out.println("Successful Withdrawal");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
