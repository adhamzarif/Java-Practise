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
public class TestAnimal {

    public static void main(String[] args) {
        Animal a = new Spider();
        a.eat();
        a.walk();
        Spider s = new Spider();
        s.eat();
        s.walk();

    }
}
