package Abstraction.Problem3;

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {

        setBalance(getBalance() + amount);

        System.out.println("Deposit of tk" + amount + " successful. Current balance: tk" + getBalance());
    }

    @Override
    public void withdraw(double amount) {

        if (getBalance() >= amount) {

            setBalance(getBalance() - amount);

            System.out.println("Withdrawal of tk" + amount + " successful. Current balance: tk" + getBalance());
        } else {

            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

