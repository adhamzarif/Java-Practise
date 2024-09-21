package Abstract;

abstract class example1 {
    protected abstract void display1();  // Protected abstract method
    public abstract void display2();     // Public abstract method
    public abstract void display3();     // Public abstract method
}

class example2 extends example1 {
    public void display1() {
        System.out.println("display1 method");
    }

    public void display2() {
        System.out.println("display2 method");
    }

    public void display3() {
        System.out.println("display3 method");
    }
}

class demo {
    public static void main(String[] args) {
        example2 obj = new example2();
        obj.display1();  // Calling the overridden method from example2
        obj.display2();  // Demonstrating the second method
        obj.display3();  // Demonstrating the third method
    }
}
