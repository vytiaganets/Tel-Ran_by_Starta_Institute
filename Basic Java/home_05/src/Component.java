import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class Component extends JComponent
        implements MouseMotionListener {
    String theMessage;
    int messageX = 125, messageY = 95; //Координаты сообщения

    public Component(String message) {
        theMessage = message;
        addMouseMotionListener(this);
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

    public void mouseMoved(MouseEvent e) {

    }
}
