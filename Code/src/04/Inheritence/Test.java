/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_04.Inheritence;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {

        University u1 = new University();
        University u2 = new University(01,"UIU");
        Student s1=new Student();
        Student s2=new Student(100,"student1",3.54);
        Teacher t1=new Teacher(10002,"teacher1","Prof");

        u1.display();
        u2.display();
        s1.display(4.0);
        s2.display();
        t1.display();
    }
}
