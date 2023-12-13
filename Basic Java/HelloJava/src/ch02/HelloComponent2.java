package ch02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class HelloComponent2 extends JComponent
        implements MouseMotionListener { //интерфейс
    String theMessage;
    int messageX = 125, messageY = 95; //Координаты сообщения

    public HelloComponent2(String message) {
        theMessage = message;
        addMouseMotionListener(this);//HelloComponent2 обьект
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        //сохранить ккоординаты мыши и перерисовать текст сообщения
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {//обязательно, требует MouseMotionListener

    }
}
