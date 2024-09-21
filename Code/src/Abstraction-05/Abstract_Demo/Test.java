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
public class Test {
    public static void main(String[] args) {
        Marks ob=new A(100.0,100,100);
        System.out.println
        ("result of student A ="+ob.getPercentage());
        Marks ob2=new B(70.0,67,94,85);
        System.out.println
        ("result of student B ="+ob2.getPercentage());
    }
}
