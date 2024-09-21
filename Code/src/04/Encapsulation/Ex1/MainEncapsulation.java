package Week_04.Encapsulation.Ex1;

public class MainEncapsulation {
    // this is the driver code for the EncapsuledAccount class
    public static void main(String[] args) {
        EncapsuledAccount account = new EncapsuledAccount("Sherlock Holmes");

//        System.out.println(account.name); // not possible
        System.out.println(account.getName()); // correct

//        account.balance = 10_000; // not possible
        account.setBalance(10_000); // correct - this is 10,000. if you want to put , between numbers we use _ in the place of ,
    }
}
