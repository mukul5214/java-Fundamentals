package Oops.AWT.EventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factorial {
    public static void main(String[] args) {
        Frame f = new Frame();
        TextField t1 = new TextField();
        t1.setBounds(50,50,120,50);
        TextField t2 = new TextField();
        t2.setBounds(50,23,120,50);
        Button b = new Button("Click");
        b.setBounds(50,100,60,30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = t1.getText();
                int x = 2*(Integer.parseInt(str));
                String s = String.valueOf(x);
                t2.setText(s);
            }
        });

        f.setSize(300,300);
        f.setLayout(null);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.setVisible(true);
    }
}
