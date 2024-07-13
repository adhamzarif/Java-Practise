/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_04.InheritenceShape;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        //Shape s=new Shape(10.6,20.3);
        Shape s;
        s=new Rectangle(10.6,20.3);
        s.area();
        s=new Triangle(15,30);
        s.area();
        Rectangle r=new Rectangle(10.6,20.3);
        r.area();
        Triangle t=new Triangle(10.5,20.0);
        t.area();
        Circle c=new Circle(6.50);
        c.area();
    }
}
