package Abstraction.Problem2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println();
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
