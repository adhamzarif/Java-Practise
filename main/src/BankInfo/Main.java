package BankInfo;

public class Main {
    public static void main(String[] args) {
        BankAccount usr1  = new BankAccount("Zarif",18365864);
        BankAccount usr2  = new BankAccount("Adham",159865639);
        usr1.depMoney(100);
        usr1.witMoney(50);
        System.out.printf("Name: " + usr1.uName + " " + usr1.depMoney + " " + usr1.reply());

        System.out.println();

        usr2.depMoney(1000);
        usr2.witMoney(500);
        System.out.printf("Name: " + usr2.uName + " " + usr2.depMoney +  " " + usr2.reply());
    }
}
