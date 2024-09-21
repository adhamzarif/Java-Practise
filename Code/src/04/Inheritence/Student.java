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
public class Student extends University{

    int id = 9;
    String name = "Silve";
    double cgpa;

    Student(int id, String name, double cgpa){
       super(id,name);
        this.cgpa=cgpa;
    }

    Student(){
        super();
        System.out.println("Default Student class - No value assign");
    }
    @Override

    void display(){
        super.display();
        System.out.println("cgpa="+cgpa);   
    }

    void display(double cgpa){
        System.out.println("id= "+id+" name= "+name);
        System.out.println("cgpa="+cgpa);
    }

}
