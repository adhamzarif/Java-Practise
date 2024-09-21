package Final;

public class Student {
    final String uniName = "UIU";
    int age;
    Student(int age)
    {
        this.age = age;
    }
    void display()
    {
        System.out.println("Name: " + uniName);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student st = new Student(19);
        st.display();
    }
}
