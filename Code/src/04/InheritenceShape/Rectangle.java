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
public class Rectangle extends Shape{
    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    @Override
    void area(){
        System.out.println("Rectangle's area= "+dim1*dim2);
    }
}
