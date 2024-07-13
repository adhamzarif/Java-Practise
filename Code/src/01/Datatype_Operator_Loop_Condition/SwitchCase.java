package Week_01.Datatype_Operator_Loop_Condition;

public class SwitchCase {
    public static void main(String[] args) {

        /**
         * works the same way just like in C.
         */
        // find if a number is 1,0 or neither
        int a = 1;
        switch (a) {
            case 0: {
                System.out.println("Number is 0");
                break;
            }
            case 1: {
                System.out.println("Number is 1");
                break;
            }
            default: {
                System.out.println("Neither");
            }
        }

        // BUT, we can REMOVE THE BREAK STATEMENT in Java, this is called "Enhanced switch"

        switch (a) {
            case 0 -> {
                System.out.println("Number is 0");
            }
            case 1 -> {
                System.out.println("Number is 1");
            }
            default -> {
                System.out.println("Neither");
            }
        }


        /**
         * Another example:
         * vowel/consonants using switch case
         */

        char ch = 'a';
        switch (ch) {
            case 'a': {
                System.out.println("Vowel");
                break;
            }
            case 'e': {
                System.out.println("Vowel");
                break;
            }
            case 'i': {
                System.out.println("Vowel");
                break;
            }
            case 'o': {
                System.out.println("Vowel");
                break;
            }
            case 'u': {
                System.out.println("Vowel");
                break;
            }
            default: {
                System.out.println("Consonant");
            }
        }
        // This is too much repetitive...You have to copy paste again and again....


        // here's a better version, case 'a', 'e', 'i', 'o' ---> If any of the one pass, print Vowel
        // remove the break from all of them, and then just put it on 'u'

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': {
                System.out.println("Vowel");
                break;
            }
            default: {
                System.out.println("Consonant");
            }
        }
        // there's also a much better way!

        // Why not we group 'a', 'e', 'i', 'o', 'u' as they all give same output (Vowel)?
        // see code below

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
                System.out.println("Vowel");
            }
            default -> {
                System.out.println("Consonant");
            }
        }

    }
}
