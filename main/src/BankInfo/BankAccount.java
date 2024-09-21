package BankInfo;
//Create a Banking Application, where a user can create new account, deposit money, withdraw
//money and check the balance.

//Creating class
public class BankAccount {
    String uName;
    int ID;
    double depMoney = 0.00;
    double witMoney;
    double chBalance;

    //creating constructor
    BankAccount(String uName, int ID)
    {
        this.uName = uName;
        this.ID = ID;
    }

    //Creating Method
    double depMoney(double amount)
    {
        if(amount < 0)
        {
            System.out.println("Deposit Money Can't be 0 Or -1");
        }
        else
        {
            depMoney += amount;
        }
        return depMoney;
    }

    double witMoney(int amount)
    {
        if(amount < 0)
        {
            System.out.println("Withdraw Money Can't be 0 Or -1");
        }
        else
        {
            depMoney -= amount;
        }
        return depMoney;
    }
    double chBalance()
    {
        return depMoney;
    }
    String reply()
    {
       return  "Thank You For Banking With Us!!";
    }
}
