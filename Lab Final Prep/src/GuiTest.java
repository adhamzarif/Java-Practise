import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class GuiTest implements ActionListener{
    JFrame f;
    JTextField tf;
    public GuiTest()
    {
        f = new JFrame("Testing Gui");
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,400);
        f.add(new JLabel("Counter"));
        tf = new JTextField(10);
        f.add(tf);
        tf.setText("0");
        JButton jb = new JButton("Count");
        f.add(jb);
        jb.addActionListener(this);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText(Integer.parseInt(tf.getText())  + 1 + "");
    }
    public static void main(String[] args) {
        new GuiTest();
    }
}
