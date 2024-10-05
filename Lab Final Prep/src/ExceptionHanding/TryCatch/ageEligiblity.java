package TryCatch;

public class ageEligiblity
{
    public static int chekEligiblity(int age){
        if( age < 18)
        {
            throw new ArithmeticException("Exception Found");
        }
        else
        {
            return age;
        }
    }
    public static void main(String[] args)
    {
        try
        {
            int age = chekEligiblity(16);
            System.out.println("Age is eligible: " + age);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}