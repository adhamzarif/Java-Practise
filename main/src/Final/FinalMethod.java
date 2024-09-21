package Final;

public class FinalMethod {
    final void display()
    {
        System.out.println("This is final method");
    }
    void displayInfo()
    {
        System.out.println("This is non final");
    }

    public static void main(String[] args) {
        FinalMethod st = new FinalMethod();
        st.display();
        st.displayInfo();
    }
}
