package Week_01.Datatype_Operator_Loop_Condition;

public class ArithmeticOpts {
    public static void main(String[] args) {
        int a = 10,b = 5;

        // Just like in C
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("The sum is " + sum);
        System.out.println("The sub is " + sub);
        System.out.println("The mult is " + mul);
        System.out.println("The div is " + div);


        /**
         * If you want to do like C, printf("The sum is %d\n", (a+b));
         * you can do that in Java too! without the %d
         */
        System.out.println("The sum is " + (a + b));

        /**
         * NOTE: YOU MUST put brackets around (a+b) else Java will not add them
         * it will CONCATENATE THEM
         * Java won't add like 10 + 5 = 15
         * but Java will concatenate like "10" + "5" = "105"
         * run the code below to see what I mean
         */
        System.out.println("The sum is " + a + b);
    }
}
