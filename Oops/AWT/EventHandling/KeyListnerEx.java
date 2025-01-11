package Oops.AWT.EventHandling;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListner extends Frame implements KeyListener {
    Label l;

    KeyListner(){
        setSize(500,500);
        TextArea area = new TextArea();l.setBounds (20, 50, 100, 20);

        area.addKeyListener(this);
        add(l);
        add(area);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l.setText("typing");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l.setText("Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l.setText("Relesed");
    }
}

public class KeyListnerEx{
    public static void main(String[] args) {
        KeyListnerEx x = new KeyListnerEx();
    }
}
