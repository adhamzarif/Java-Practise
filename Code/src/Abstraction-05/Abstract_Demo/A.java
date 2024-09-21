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
public class A extends Marks{
    A(double a, double b, double c){
       super(a,b,c,0.0);
    }
    @Override
    public double getPercentage(){
        double p= (a+b+c)/3;
        return p;
    }
}
