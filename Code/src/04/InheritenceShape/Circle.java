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
public class Circle extends Shape {
     Circle(double dim1){
        super(dim1,0);
    }
    @Override
    void area(){
        System.out.println("Circle's area= "+Math.PI*dim1*dim1);
    }
}
