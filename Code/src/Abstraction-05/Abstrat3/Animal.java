/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_05_Abstraction.Abstrat3;

/**
 *
 * @author Admin
 */
public abstract class Animal {
    public int legs;
    Animal(int legs){
        this.legs=legs;
    }
    abstract void eat();
    void walk(){
        System.out.println("This animal walks with "+legs+ " legs");
    }
}
