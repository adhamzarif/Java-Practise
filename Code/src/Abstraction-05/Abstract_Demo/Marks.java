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
public abstract class Marks {
    double a,b,c,d;
    Marks(double a, double b, double c, double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    abstract double getPercentage();
}
