import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTest2 implements ActionListener {
    JTextField tf;
    JFrame f;
    JButton b;
    JButton m;
    public GuiTest2()
    {
        f = new JFrame("Counting");
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,400);

        f.add(new JLabel("Counting"));
        tf = new JTextField(10);
        tf.setText("0");
        f.add(tf);

        b = new JButton("Count");
        f.add(b);
        m = new JButton("Minus");
        f.add(m);
        b.addActionListener(this);
        m.addActionListener(this);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b)
        {
            tf.setText(Integer.parseInt(tf.getText()) + 1 + "");
        }
        else if(e.getSource() == m)
        {
            tf.setText(Integer.parseInt(tf.getText()) - 1 + "");
        }
    }

    public static void main(String[] args) {
        new GuiTest2();
    }
}
