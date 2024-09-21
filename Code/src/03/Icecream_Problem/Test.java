/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_03.Icecream_Problem;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {
        Icecream I1 = new Icecream("Chocolate", "Polar", 290.0);
        
        Icecream I2 = new Icecream("Chocolate", "Polar", 290.0);
        System.out.println(I1.equals(I2));
    }
}
