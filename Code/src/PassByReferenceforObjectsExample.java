class Person {
    float height;
    float weight;

    public Person(float x, float y){
        height = x;
        weight = y;
    }

    void display(){
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
    }

    static void fun(Person x){
        System.out.println("Inside fun method: ");
        x.height *=10; //x.height = 6.2*10 = 62
        x.weight *=10; //x.weight = 51.7*10 = 57

        //Pass by Reference: Java uses pass by value for arguments, but for objects, the value passed is the reference to the object. 
        //Changes made to object attributes inside methods affect the object itself.

        //works like pass by reference
        //x and p2 poinitng the same address
        //change into one place will be reflects into another
        System.out.println(x.height);
        System.out.println(x.weight);
    }
}

class Input{
    public static void main(String[] args) {
        Person p1 = new Person(6.5F, 56.3F);
        Person p2 = new Person(6.2F, 51.7F);
        Person p3 = new Person(5.5F, 69.3F);
        Person p4 = new Person(4.2F, 45.7F);

        p1.display();
        p2.display();
        p3.display();
        p4.display();

        Person.fun(p2);

        System.out.println("Value changed after fun function called");
        p2.display();
        p1.display();

        Input i = new Input();
        i.methodA();

    }

    void methodA(){
        int num1 = 10, num2 = 60;
        if(num1>num2){
            System.out.println(num1+" is greater");
        }
        else{
            System.out.println(num2+" is greater");
        }

        for(int i=0;i<5;i++){
            System.out.println(i*10);
        }
    }
}
