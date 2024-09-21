package Info;

public class InfoData {
    public String name;
    public int age;
    InfoData()
    {
        System.out.println("Hlw");
    }

    InfoData(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
