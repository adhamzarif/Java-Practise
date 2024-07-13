/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.ClassObjectConstrcutorOverloading;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i; String n; double cg;

        n=sc.nextLine();
        cg=sc.nextDouble();
        i=sc.nextInt();
        //taking user input for passing to constructor
        Student s1 = new Student(i,n,cg);
        s1.display();

        //Student with no information for parameterless constructor
        Student s2 = new Student();
        s2.display();

        Student s3 = new Student(103,"C");
        s3.display();


        Student s4 = new Student(104,"C",3.8);

        // We don't have to manually insert values for each attribute. So time consuming !! Just pass to constructor
        // s2.id=102;
        //  s2.name="B";
        //  s2.cgpa=3.50;
        s4.display();

        //3 parameter constructor but order change
        Student s5 = new Student("H",105,3.8);
        s5.display();

        //creating object with no parameter constructor but assigning value with input method
        Student s6 = new Student();
        s6.input(106, "M", 4.00);
        s6.display();
    }
}
