package ClassMethodConstructor;

public class Main {
    String name;
    int num;
    double value;
    //constructor
    Main(String name, int num, double value){
        this.name = name;
        this.num = num;
        this.value = value;
    }
    //method
    public void disPlay()
    {
        System.out.println("Name: " + name);
        System.out.println("Num: " + num);
        System.out.println("Double: " + value);
    }
}
