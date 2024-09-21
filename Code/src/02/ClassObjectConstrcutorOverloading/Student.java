/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.ClassObjectConstrcutorOverloading;


public class Student {
    int id;
    String name;
    double cgpa;
    
    Student(){
        System.out.println("No record to show. Student with no information. Parameterless constructor invoked");
    }
    Student(int id, String name,double cgpa){
         this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
     Student(int id, String name){
         this.id=id;
        this.name=name;
        
    }
     Student( String name,int id,double cgpa){
         this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }


    // a method for passing the values instead of constructor.
    void input(int id, String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }


    void display(){
        System.out.println("id= "+id);
        System.out.println("name= "+name);
        System.out.println("cgpa= "+cgpa);
        System.out.println("");
    }
}
