package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Basic5{
    JFrame f;
    JTextField tf;
    public Basic5(){
        f = new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setSize(200, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel("Counter"));
        tf = new JTextField(10);
        tf.setText("0");
        JButton b = new JButton("Count");
        f.add(tf); f.add(b);

        tf.setText(Integer.parseInt(tf.getText()) + 1 +"");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            }
        });
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Basic5();
    }
}
