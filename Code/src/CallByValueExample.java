class Operation{
    int data=50;

//    void change(int d)
//    {
//        data = d+100;
//
//    }

    void change(int data)
    {
        data = data+100; // changes will affect the local variable only
//        this.data = data+100; // changes will affect the instance variable
//        this.data = this.data+100; //  // changes will affect the instance variable  !!! But different output
    }

    void change2(Operation op1){
        op1.data=op1.data+100;//changes will be in the instance variable

        /*If we pass object in place of any primitive value, original value will be changed.
         In this example we are passing object as a value.*/
    }


    public static void main(String args[]){
        Operation op=new Operation();
        System.out.println("before change op " + op.data);
        op.change(500);
        System.out.println("after change op " + op.data);

        Operation op1=new Operation();
        System.out.println("before change op1 " + op1.data);
        op.change2(op1);
        System.out.println("after change op1 " + op1.data);


    }
}
