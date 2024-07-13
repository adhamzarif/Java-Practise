package Static;

public class StaticBlock {
    static String name;
    static int age;
    static{
        name = "Zarif";
        age = 19;
    }
    static void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StaticBlock st = new StaticBlock();
        st.display();
    }
}
