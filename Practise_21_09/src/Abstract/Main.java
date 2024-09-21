package Abstract;

class Example1 {
    public void display1() {
        System.out.println("display1 method");
    }
}

abstract class Example2 {
    public void display2() {
        System.out.println("display2 method");
    }
}

abstract class Example3 extends Example1 {  // Corrected to Example1 (case-sensitive)
    abstract void display3();
}

class Example4 extends Example3 {
    public void display3() {
        System.out.println("display3 method");
    }
}

class Demo {
    public static void main(String[] args) {
        Example4 obj = new Example4();
        obj.display1();  // Inherited from Example1
        obj.display3();  // Implemented in Example4
    }
}
