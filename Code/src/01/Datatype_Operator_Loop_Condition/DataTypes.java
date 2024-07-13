package Week_01.Datatype_Operator_Loop_Condition;

public class DataTypes {
    public static void main(String[] args) {
        int a = 10, b = 20; // you can declare variables in one line just like C/C++
        float f = 10.00f;
        double d = 10.00, e = 10.00d; // Both works
        char c = 'c'; // single-quote, one character
        String str = "my name is ..."; // strings can easily be declared with the String class, wrap in double-quotes

        boolean isTrue = true, isFalse = false; // true/false for checking conditions
        byte i = 10;
        short p = 10;
        int in = 1000000000;
        long l = 1000000000000000000L; // missed this in class. put a L at the end to turn it into a long
//        System.out.println(in + " " + l);


        /** PRINTING VARIABLES
         * unlike in C where printf("%d", a);
         * we can just simply put the variable in the println() method
        */
        System.out.println(a);

        /**
         * What about printf("Value of a = %d\n", a); to get the output "Value of a is 10"?
         * string concatenate!!
         * Just put + after every string
         * LOOK BELOW
         */
        System.out.printf("The value of a is "+"\n", a );
        System.out.printf("The value of a is usinf printf %d\n", a);
        //Here, %d is the format specifier for an integer (d stands for "decimal").
        // The %d will be replaced by the value of a, and \n will produce a newline after printing the value of a.
        //If you want to print the value of a without using format specifiers, you can simply concatenate the value with the string:

        System.out.println("The value of a is using println " + a);
        System.out.println("The value of a is" + a); // notice there's no space after 'is'. Run and check formatting
        System.out.println("The value of b is " + b + " and the value of a is " + a);
        // this is similar to strcat in C, but with +

    }
}
