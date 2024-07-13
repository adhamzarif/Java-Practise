/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_05_Abstraction.Abstract_Demo;

/**
 *
 * @author Admin
 */
public class B extends Marks{
    
    B(double a,double b,double c,double d){
     super(a,b,c,d);   
    }
    
    @Override
    double getPercentage(){
        return (a+b+c+d)/4;
    }
}
