package Interface;

interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

class TestNestedInterface1 implements Showable, Showable.Message {
    public void msg() {
        System.out.println("Hello nested interface 1");
    }

    public void show() {
        System.out.println("Hello nested interface 2");
    }

    public static void main(String[] args) {
        Showable show = new TestNestedInterface1();  // upcasting here
        Showable.Message msg = new TestNestedInterface1();  // reference to the nested interface
        msg.msg();
        show.show();
    }
}

