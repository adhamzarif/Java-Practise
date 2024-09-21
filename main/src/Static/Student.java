package Static;

public class Student {
    String name;
    static String uniName = "UIU";
    int age;
    Student(String name,int age)
    {
        this.age = age;
        this.name = name;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("University: " + Student.uniName);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student st = new Student("Zarif",19);
        st.display();
    }
}
