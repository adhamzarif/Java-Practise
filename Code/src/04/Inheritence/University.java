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
public class University {
    int id = 002;
    String name;

    University(){

        System.out.println("Parent University class - No value assign");
    }
    University(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){

        System.out.println("id= "+id+" name= "+name);
    }
}
