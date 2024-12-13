package Oops.Applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/*
<applet code="SimpleApplet" width=400 height=300>
</applet>
*/

public class Applet1 extends Applet {
    // The init() method initializes the applet
    @Override
    public void init() {
        setBackground(Color.LIGHT_GRAY); // Set background color
    }

    // The paint() method is used to draw on the applet
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE); // Set the drawing color
        g.drawString("Hello, Applet!", 150, 50); // Draw a string at (150, 50)

        g.setColor(Color.RED);
        g.drawRect(100, 100, 200, 100); // Draw a rectangle
        g.fillRect(110, 110, 180, 80);  // Fill a smaller rectangle inside

        g.setColor(Color.GREEN);
        g.drawOval(150, 150, 100, 100); // Draw a circle
    }
}
