import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseListeneroval extends JPanel implements MouseListener {

    MouseListeneroval() {
        addMouseListener(this);
        setSize(50, 50);
        setLayout(null);
        setVisible(true);
    }
    public  void mouseClicked(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(e.getX(), e.getY(), 10, 10);
    }


    public void mouseEntered(MouseEvent arg0){
    }
    public void mousePressed(MouseEvent arg0){
    }
    public void mouseReleased(MouseEvent arg0){
    }
    public void mouseExited(MouseEvent arg0){
    }

    public  void mselstner (String[]arg0){
        new MouseListeneroval();
    }

}

