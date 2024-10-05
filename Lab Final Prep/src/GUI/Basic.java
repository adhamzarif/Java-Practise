package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Basic implements ActionListener{
    JFrame f;
    JTextField tf;
    public Basic(){
        f = new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setSize(200, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel("Counter"));
        tf = new JTextField(10);
        f.add(tf);
        tf.setText("0");
        JButton b = new JButton("Count");
        f.add(b);
        b.addActionListener(this);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        tf.setText(Integer.parseInt(tf.getText()) + 1 +"");
    }
    public static void main(String[] args) {
        new Basic();
    }
}
