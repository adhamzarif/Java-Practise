package Polymorphism;

public class poly1 {
    void s1(double x,double y)
    {
        System.out.println(x+y);
    }
    void s2(int x,int y,int z)
    {
        System.out.println(x+y+z);
    }
    void s3()
    {
        System.out.println("Nothing to add");
    }

    public static void main(String[] args) {
        poly1 p = new poly1();
        p.s1(2.2,2.4);
        p.s2(2,3,4);
        p.s3();
    }
}
