package Oops.AWT.EventHandling;

import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event1 extends Frame implements ActionListener {
    TextField tf;
    Event1(){
        tf = new TextField();
        tf.setBounds(10,30,100,60);
        Button b = new Button("Click Here");
        b.setBounds(100,120,80,30);
        //Registering the listener
        b.addActionListener(this);

        //Adding in frame.
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        Event1 a = new Event1();
    }
}
