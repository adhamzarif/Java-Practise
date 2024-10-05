package Abstraction.Problem3;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("SA001", 100);

        System.out.println("Savings A/c: Initial Balace: tk" + savingsAccount.getBalance());

        savingsAccount.deposit(500);

        savingsAccount.withdraw(250);

        System.out.println("\nTry to withdraw: tk" + 1000);

        savingsAccount.withdraw(1000);

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount("CA001", 5000);

        System.out.println("Current A/c: Initial Balace: tk" + 5000);

        currentAccount.deposit(1000.0);

        currentAccount.withdraw(3000.0);

        System.out.println("\nTry to withdraw: tk" + 6000);

        savingsAccount.withdraw(6000);
    }
}

