package Week_01.Datatype_Operator_Loop_Condition;

public class Conditionals {
    public static void main(String[] args) {
        /**
         * just like in C, you have
         * ==, !=
         * >, <, >=, <=
         * && (and), || (or)
         */

        /**
         * if-else or if-else if-else
         * works just like C!
         */

        int age = 18;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        char ch = 'a';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }


        // the best part is, you can save conditionals to a variable!
        boolean isAdult = age >= 18;
        if (isAdult)
            System.out.println("Voter");
        else
            System.out.println("Non Voter");

        boolean isVowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        if (isVowel) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
