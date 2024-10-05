package ExceptionHanding.ThrowThrows;

class AgeException extends Exception
{
    public AgeException(String message)
    {
        super(message);
    }
}
public class AgeEligibility2 {

    public static int checkEligibility(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Exception Found: Age less than 18.");
        } else {
            return age;
        }
    }

    public static void main(String[] args) {
        try {
            int age = checkEligibility(16);  // Method call
            System.out.println("Age is eligible: " + age);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
