package Oops.Swing;

import javax.swing.*;
import java.awt.*;

public class Swing1 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        Button b = new Button("click here");
        b.setBounds(10,20,100,13);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
