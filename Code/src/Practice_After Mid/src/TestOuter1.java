class TestOuter1{
    static int data=30;
    static class Inner{
        void msg(){
            System.out.println("data is "+data);
        }
        static void msg(String msg){
            System.out.println(msg);
        }
    }
    public static void main(String args[]){
        TestOuter1.Inner obj=new TestOuter1.Inner();
        obj.msg();
        TestOuter1.Inner.msg("Hello");
        //no need to create the instance of static nested class
    }
}