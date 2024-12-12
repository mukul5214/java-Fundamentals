package Oops.AWT.EventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Outter implements ActionListener{
    Event2 obj;
    Outter(Event2 e){
        this.obj = e;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        obj.tf.setText("welcome");
    }
}
public class Event2 extends Frame {
    TextField tf;
    Event2(){
        tf = new TextField("hello");
        tf.setBounds(40,130,40,12);
        Button b = new Button("click");
        b.setBounds(60,160,20,40);
        Outter obj = new Outter(this);
        b.addActionListener(obj);

        add(b);
        add(tf);
        setSize(350,350);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Event2 e = new Event2();
    }
}