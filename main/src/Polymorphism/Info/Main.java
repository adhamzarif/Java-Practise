package Polymorphism.Info;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        p.display();
        p = new Student();
        p.display();
        p = new People();
        p.display();
//        Person p = new Person();
//        Student s = new Student();
//        People P = new People();
//
//        p.display();
//        s.display();
//        P.display();

    }
}
