package Oops.AWT.EventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.BitSet;

public class ButtonExample2 {
    public static void main(String[] args) {
        Frame f = new Frame();
        TextField t = new TextField("hello");
        t.setBounds(50,50, 150,20);
        Button b = new Button("click here");
        b.setBounds(50,100,60,30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("Welcome motherfucker");
            }
        });

        f.add(t);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
