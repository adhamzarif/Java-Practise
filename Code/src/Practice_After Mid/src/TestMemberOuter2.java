public class TestMemberOuter2 {
    public void show(){
        System.out.println("Show method");
        Inner inner = new Inner();
        inner.msg(); // Can access private member of inner class
        System.out.println("End of Show method");
    }
    class Inner{
        private void msg(){
            System.out.println("Inner Method");
        }
    }
    public static void main(String[] args) {
        TestMemberOuter2 tmo = new TestMemberOuter2();
        tmo.show();
        TestMemberOuter2.Inner in = tmo.new Inner();
        in.msg();
    }
}