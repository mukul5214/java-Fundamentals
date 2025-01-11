package Oops.AWT.EventHandling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JButton b = new JButton("click");
        b.setBounds(150, 80, 100, 30);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f,"hello");
            }
        });

        f.add(b);

        f.setVisible(true);

    }
}
