package Abstraction.Inheritance.Problem3;

public class Rectangle  extends Shape{
    double val1,val2;

    Rectangle(double val1, double val2)
    {
        this.val1 = val1;
        this.val2 = val2;
    }
    void getArea()
    {
        double recArea = 0.5 * val1 * val2;
        System.out.println("Rectangle Area: " + recArea);
    }
}
