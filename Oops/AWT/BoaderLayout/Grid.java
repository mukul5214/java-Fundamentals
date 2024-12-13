package Oops.AWT.BoaderLayout;

import javax.swing.*;
import java.awt.*;

public class Grid {
    JFrame f;
    Grid(){
        f = new JFrame();
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");

//        f.setLayout(new GridLayout()); // Setting the layout.
//        f.setLayout(new GridLayout(2,3));
        f.setLayout(new GridLayout(2,3,20,25));

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(500,300);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        Grid g = new Grid();
    }

}
