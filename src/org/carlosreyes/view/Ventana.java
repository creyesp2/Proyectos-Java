package org.carlosreyes.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; // add la clase keylistener y agregar todos los metodos abstracts
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana extends JFrame implements KeyListener {

    public Ventana() {
        this.setSize(600, 400);
        this.setTitle("ejemplo de interface");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
     // JOptionPane.showMessageDialog(null, "code:"+ KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyPressed(KeyEvent e) {
    //  JOptionPane.showMessageDialog(null, "code:"+ KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override 
    public void keyReleased(KeyEvent e) {
     JOptionPane.showMessageDialog(null, "code:"+ KeyEvent.getKeyText(e.getKeyCode()));
    }

}
