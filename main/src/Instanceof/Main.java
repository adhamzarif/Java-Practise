package Instanceof;

public class Main {
    public static class Person {

    }

    public static class Teacher extends Person {

    }

    public static class Student extends Teacher {

    }

    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();
        Student s = new Student();

        System.out.println(p instanceof Person); // true, p is an instance of Person
        System.out.println(t instanceof Person); // true, t is an instance of Teacher, which extends Person
        System.out.println(s instanceof Teacher); // true, s is an instance of Student, which extends Teacher
        System.out.println(s instanceof Person); // true, s is an instance of Student, which extends Person
        System.out.println(t instanceof Student); // false, Teacher is not a subclass of Student
    }
}
