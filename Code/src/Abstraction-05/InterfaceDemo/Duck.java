/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_05_Abstraction.InterfaceDemo;

/**
 *
 * @author Admin
 */
public class Duck implements Flyable,Walkable{
    
    @Override
    public void fly(){
        System.out.println("Duck can fly through "+
                Flyable.media);   
    }
    void display(){
        System.out.println("This is a duck");   
    }
}
