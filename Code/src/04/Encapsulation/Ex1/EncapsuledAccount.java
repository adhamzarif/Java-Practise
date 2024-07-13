package Week_04.Encapsulation.Ex1;

public class EncapsuledAccount {
    private String name;
    private double balance;

    public EncapsuledAccount(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    void printDetails() {
        System.out.println("Account "+this.name+" has balance " + this.balance);
    }

    void deposit(double amount) {
        this.balance += amount;
    }


    void withdraw(double amount) {
        if(this.balance < amount) {
            System.out.println("Can't withdraw! Insufficient funds");
        } else {
            this.balance -= amount;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
