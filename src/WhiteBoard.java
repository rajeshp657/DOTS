import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

public class WhiteBoard extends JPanel implements MouseListener {
    static int sizeX = 600;
    static int sizeY = 600;
    List<Dot> dotList = new ArrayList<>();
    public WhiteBoard() {
        setLayout(null);
        setSize(sizeX,sizeY);
        setBackground(Color.white);
        setVisible(true);
        this.addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        for (Dot dot : dotList) {
            g2d.setColor(Color.black);
            Ellipse2D.Double circle = new Ellipse2D.Double(dot.x, dot.y, dot.diameter, dot.diameter);
            g2d.fill(circle);
            g2d.setColor(Color.red);
            Ellipse2D.Double circle2 = new Ellipse2D.Double(dot.x-3, dot.y-3, dot.diameter+6, dot.diameter + 6);
            g2d.draw(circle2);
        }
    }

    public void addDot(Dot dot) {
        dotList.add(dot);
        repaint();
    }

    public void clear() {
        dotList.clear();
        removeAll();
        revalidate();
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        addDot(new Dot(e.getX(),e.getY()));
        repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
