package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultiButtons extends JFrame implements ActionListener {
    JTextField tf;
    JButton b, r;

    public MultiButtons() {
        super("Counter");
        setSize(200, 100);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Counter"));

        tf = new JTextField("0", 10);

        b = new JButton("Count");
        r = new JButton("Reset");

        add(tf);
        add(b);
        add(r);

        r.addActionListener(this);
        b.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == b) {

            tf.setText(Integer.parseInt(tf.getText()) + 1 + "");
        } else if (obj == r) {

            tf.setText("0");
        }
    }

    public static void main(String[] args) {
        new MultiButtons();
    }
}
