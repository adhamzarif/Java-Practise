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
public class TestInterface {
    public static void main(String[] args) {
        Duck c=new Duck();
        c.fly();
        Flyable f=new Duck();
        f.fly();
        ((Duck)f).display();
    }
}
