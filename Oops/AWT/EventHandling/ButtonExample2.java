package Oops.AWT.EventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample2 {
    public static void main(String[] args) {
        Frame f  = new Frame();
        TextField t = new TextField();
        t.setBounds(50,50,120,50);
        Button b = new Button("Click heare");
        b.setBounds(50,100,60,30);
        Label greeting = new Label("");
        greeting.setBounds(50, 150, 300, 25);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                String mame = t.getText();
                greeting.setText("hello"+mame);
            }
        });
        f.add(t);
        f.add(b);
        f.add(greeting);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
