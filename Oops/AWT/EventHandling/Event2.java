package Oops.AWT.EventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Outter implements ActionListener {
    Event2 obj;

    Outter(Event2 e) {
        this.obj = e; // Storing reference to Event2 instance
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Setting the text in the TextField when the button is clicked
        obj.tf.setText("Welcome");
    }
}

public class Event2 extends Frame {
    TextField tf;

    Event2() {
        // Initialize TextField with initial text "hi"
        tf = new TextField("hi");
        tf.setBounds(60, 50, 170, 20);

        // Initialize Button
        Button b = new Button("Click Me");
        b.setBounds(100, 120, 80, 30);

        // Registering Outter as the ActionListener for the button
        Outter obj = new Outter(this);
        b.addActionListener(obj);  // Register the listener

        // Add the button and text field to the frame
        add(tf);
        add(b);

        // Set up the frame
        setSize(300, 300);
        setLayout(null); // Use null layout to position components manually
        setVisible(true);
    }

    public static void main(String[] args) {
        new Event2(); // Create the Event2 object which will set up the GUI
    }
}
