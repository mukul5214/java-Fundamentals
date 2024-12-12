package Oops.AWT.EventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event1 extends Frame implements ActionListener {

    TextField tf;
    Event1(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click");
        b.setBounds(100,120,80,30);

        //Registration.
        b.addActionListener(this);

        //Adding to the frame.
        add(b);
        add(tf);
        setLayout(null);
        setSize(350,350);
        setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("welcome");
    }

    public static void main(String[] args) {
        Event1 e = new Event1();
    }
}