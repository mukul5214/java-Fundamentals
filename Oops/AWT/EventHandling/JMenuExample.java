package Oops.AWT.EventHandling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);

        JMenuBar menu = new JMenuBar();

        JMenu files = new JMenu("Files");
        JMenu view = new JMenu("View");

        JMenuItem open = new JMenuItem("open");
        JMenuItem close = new JMenuItem("close");

        JMenuItem dark = new JMenuItem("dark mode");

        files.add(open);
        files.add(close);

        view.add(dark);

        menu.add(files);
        menu.add(view);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        f.setJMenuBar(menu);
        f.setLayout(null);
        f.setVisible(true);

    }
}
