package encapsulation;

public class BankManagementSystem {

    public static void main(String[] args) {

        BankManagement account = new BankManagement(
                "ACC101",
                "Dikshana",
                "Savings",
                "SBIN0001234",
                "CBE001",
                "Coimbatore",
                "9876543210",
                "dikshana@gmail.com",
                10000
        );

        account.displayAccountDetails();

        System.out.println();

        account.deposit(5000);

        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(3000);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
