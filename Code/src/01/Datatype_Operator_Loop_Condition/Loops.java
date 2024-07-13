package Week_01.Datatype_Operator_Loop_Condition;

public class Loops {
    public static void main(String[] args) {
        // same as in C

        // Sum of first 10 natural numbers
        int sum = 0;
        for (int i = 1; i <= 10; ++i) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers is " + sum);

        // product upto 10
        int product = 1;
        for (int i = 1; i < 10; i++) {
            product *= i;
        }
        System.out.println("Product of first 10 numbers is " + product);

        // print numbers from 10 -> 0
        System.out.println("Using while:");
        int n = 10;
        while(n >= 0) {
            System.out.println(n);
            n--;
        }

        n = 10;
        System.out.println("Using do-while:");
        do {
            System.out.print(n + " "); // print() does not add a default \n like println()
            n--;
        } while (n >= 0);
    }
}
