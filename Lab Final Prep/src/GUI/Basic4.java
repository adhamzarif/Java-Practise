package GUI;

import javax.swing.*;

public class Basic4{
    JFrame f;
    Basic4(){
        f=new JFrame();
        f.setSize(200,200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1=new JButton("1");
        JButton b2=new JButton("Test 2");
        JButton b3=new JButton("3");
        b1.setBounds(10, 10, 50, 20);
        b2.setBounds(10, 50, 150, 20);
        b3.setBounds(50, 100, 50, 20);
        f.add(b1);f.add(b2);f.add(b3);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Basic4();
    }
}
