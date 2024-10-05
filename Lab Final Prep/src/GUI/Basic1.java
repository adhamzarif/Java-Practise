package GUI;

import java.awt.*;
import javax.swing.*;

public class Basic1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Frame");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 100);
        Container p = f.getContentPane();
        JButton b = new JButton("Click here");
        p.add(b);
        f.setVisible(true);
    }
}
