class Student {
    int age;
    String Name;
    float CGPA;
    static String course; //static variable can be accessed via ClassName
    final int CourseCode = 1116; //final variable can be accessed via ObjectName
    //Value should be assigned at the time of declaring Variable
    //Value can not be changed later
    final static String sec = "H";//final static variable can be accessed via ClassName

    void show(){
        System.out.println("OOP is fun:D");
        System.out.println("I am from section: "+ sec+" age: "+age);
    }
}

class Main{
    public static void main(String[] args) {
        //To access non-static members (variables, methods), use ObjectName
        //To access static members (variables, methods), use className
        Student s = new Student();
        s.age= 20;
        s.Name = "Joy";
        s.CGPA = 3.5F;

        Student a = new Student();
        a.CGPA = 2.5F;
        a.Name = "Ahsan";
        a.age = 23;

        Student.course = "OOP";

        System.out.println(s.age +" "+ s.Name +" "+ s.CGPA +" "+Student.course +" "+s.CourseCode+" "+Student.sec);

        Student.course = "OOP LAB";

        System.out.println(a.age +" "+ a.Name +" "+ a.CGPA +" "+Student.course+" "+a.CourseCode+" "+Student.sec);

        System.out.println("a holds the address of s: ");
        a = s; //a and s are pointing to the same address
        System.out.println(a.age +" "+ a.Name +" "+ a.CGPA +" "+Student.course+" "+a.CourseCode+" "+Student.sec);

        s.show();
        a.show();

        //flag is a different method inside Main class
        //To call flag method, you have to first create a Main class object
        Main m = new Main();
        m.flag();
        //To call a static method, just use className
        Main.run();

    }

    void flag(){
        System.out.println("Hello I am from Flag inside Main");
    }

    static void run(){
        System.out.println("Hello I am static Run inside Main");
    }
}
