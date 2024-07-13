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
public class Square extends Rectangle{
    Square(double dim1){
        super(dim1,0);
    }
    void area(){
        System.out.println(dim1*dim1);
    }
}
