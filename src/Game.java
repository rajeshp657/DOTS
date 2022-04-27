import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Game extends JPanel   {
    JButton generate = new JButton("Auto-Generate");
    JButton run = new JButton("Run");
    JButton clear = new JButton("Clear");

    JButton load = new JButton("Load");

    JButton save = new JButton("Save");

    JButton button = new JButton("Button");
    WhiteBoard whiteBoard;


    public Game(WhiteBoard whiteBoard){
        setSize(600,60);
        setVisible(true);
        setLayout(null);

        generate.setBounds(new Rectangle(10,10,140,20));
        generate.addActionListener(this::generateAction);

        run.setBounds(new Rectangle(160,10,60,20));
        run.addActionListener(this::runAction);

        clear.setBounds(new Rectangle(230,10,70,20));
        clear.addActionListener(this::clearAction);

        load.setBounds(new Rectangle(320,10,70,20));
        load.addActionListener(this::actionPerformed);

        save.setBounds(new Rectangle(400,10,70,20));
        save.addActionListener(this::saveaction);

        this.whiteBoard = whiteBoard;
        add(generate);
        add(run);
        add(clear);
        add(load);
        add(save);

    }

    public void generateAction(ActionEvent event) {
        for(int i=0 ; i<40;i++)
        whiteBoard.addDot(new Dot());
    }

    public void runAction(ActionEvent event) {
        JDialog runDiaLog = new RunDialog();
    }

    public void clearAction(ActionEvent event) {
        whiteBoard.clear();
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==load) {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File(".")); //sets current directory

            int response = fileChooser.showOpenDialog(null); //select file to open
            //int response = fileChooser.showSaveDialog(null); //select file to save

            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
    public void saveaction(ActionEvent e) {

        if(e.getSource()==save) {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File(".")); //sets current directory

            //int response = fileChooser.showOpenDialog(null); //select file to open
            int response = fileChooser.showSaveDialog(null); //select file to save

           if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
           }
        }
    }
    public static void main(String[] args) throws Exception {
        new MouseListeneroval();
        JFrame frame = new JFrame();
        frame.setLayout(null);
        WhiteBoard whiteBoard = new WhiteBoard();
        JPanel game = new Game(whiteBoard);
        game.setPreferredSize(new Dimension(600,200));
        whiteBoard.setBounds(0,61,600,860);
        frame.add(game);
        frame.setVisible(true);
        frame.setSize(600,660);
        frame.add(whiteBoard);
        JPanel panel = new JPanel();





    }
}
