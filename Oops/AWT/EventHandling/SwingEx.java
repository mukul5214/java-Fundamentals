package Oops.AWT.EventHandling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEx {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField t = new JTextField();
        t.setBounds(180, 30, 150, 25);
        JButton button = new JButton("click");
        button.setBounds(150, 70, 100, 30);
        JLabel l = new JLabel();
        l.setBounds(50, 30, 120, 25);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t.getText();
                if(!name.isEmpty()){
                    l.setText("hello"+name);
                }else {
                    l.setText("PLEASE ENTER YOUR NAME");
                }
            }
        });

        f.add(t);
        f.add(button);
        f.add(l);

        f.setLayout(null);
        f.setVisible(true);

    }
}
