package SuperMethodOverRiding;

public class B extends A{
    @Override
    public void display() {
        super.display();
        System.out.println("Inside B Method");
    }

}
