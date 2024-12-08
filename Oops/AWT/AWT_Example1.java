package Oops.AWT;

import java.awt.*;

class AWT extends Frame {
    AWT(){
        Button b = new Button("click here");
        b.setBounds(10, 20, 100, 30); // Adjusted size to fit the button properly

        // Add button to the frame
        add(b);

        // Set the layout of the frame (no layout manager)
        setLayout(null); // Using null layout manager so we can use setBounds for exact positioning

        // Set the frame size
        setSize(300, 200);
    }
}
public class AWT_Example1 {
    public static void main(String[] args) {
        AWT a = new AWT();
        a.setVisible(true);
    }
}
