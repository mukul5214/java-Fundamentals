package Oops.AWT.EventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        Frame f = new Frame();
        TextField t = new TextField();
        t.setBounds(50,50,120,50);
        Button b = new Button("Click here");
        b.setBounds(50,100,60,30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("hello");
            }
        });

        f.add(t);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);


    }
}
