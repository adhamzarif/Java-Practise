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
public class Shape {
    double dim1,dim2;
    
    Shape(double dim1, double dim2){
     this.dim1=dim1;
     this.dim2=dim2;
    }
    void area(){
        System.out.println("Shape's area method");
    }
}
