package UserDefined;
class AgeExceptionHoice extends Exception
{
    AgeExceptionHoice(String message)
    {
        super(message);
    }
}
public class AgeException {
    public static int checkEligiblity(int age) throws AgeExceptionHoice
    {
        if(age < 18)
        {
            throw new AgeExceptionHoice("Exception Found: Age less than 18.");
        }
        else
        {
            return age;
        }
    }

    public static void main(String[] args) {
        try
        {
            int age = checkEligiblity(19);
            System.out.println("Age is eligible: " + age);
        }
        catch (Exception e)
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
