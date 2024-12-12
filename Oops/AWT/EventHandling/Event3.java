package Oops.AWT.EventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event3 extends Frame {
    TextField tf;
    Event3(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(50,120,80,30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("welcome");
            }
        });

        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Event3();
    }
}
