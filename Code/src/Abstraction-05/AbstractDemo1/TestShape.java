/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_05_Abstraction.AbstractDemo1;

/**
 *
 * @author Admin
 */
public class TestShape {
    public static void main(String[] args) {
        Shape s;
        s=new Rectangle(10.0,15.2);
        ((Rectangle)s).area();
     
        Square sq=new Square(10);
        sq.area();
        sq.display();
    }
}
