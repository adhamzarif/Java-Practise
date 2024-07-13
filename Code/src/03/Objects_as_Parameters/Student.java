/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_03.Objects_as_Parameters;

/**
 *
 * @author Admin
 */
public class Student {
    int id;
    String name;
    double cgpa;
    
    Student(int id, String name, double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }

    //getting value of an object, here getting ID
    void getObj(Student s)
    {

        System.out.println("getobject's student id="+s.id);
    }


    // sending a object through another object
    Student sendObj()
    {
       // Student s1=new Student(102,"D",3.6);
        //return s1;
        return new Student(102,"D",3.6);
    }


    //this method is overridden to get the value of an object
    public String toString()
    {

        return "id="+id+" name="+name+" cgpa="+cgpa;
    }
}
