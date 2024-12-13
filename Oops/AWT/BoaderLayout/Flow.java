package Oops.AWT.BoaderLayout;

import javax.swing.*;
import java.awt.*;

public class Flow {
    JFrame j;
    Flow(){
        j = new JFrame();
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");

        j.setLayout(new FlowLayout());
        j.setLayout(new FlowLayout(FlowLayout.LEFT));
        j.setLayout(new FlowLayout(FlowLayout.RIGHT));

        j.add(b1);
        j.add(b2);
        j.add(b3);
        j.add(b4);
        j.add(b5);
        j.add(b6);

        j.setSize(1200,300);
        j.setVisible(true);

    }

    public static void main(String[] args) {
        Flow f = new Flow();
    }

}
