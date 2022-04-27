import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class RunDialog extends JDialog {
    JTextField distanceField = new JTextField();
    JLabel distanceLabel = new JLabel("distance:");
    JButton confirm = new JButton("confirm");
    JLabel distancelength = new JLabel("distance:");
    public RunDialog() {
        setLayout(null);
        setVisible(true);
        setSize(300,300);
        distanceField.setBounds(new Rectangle(90,10,50,20));
        confirm.setBounds(new Rectangle(170, 10, 100, 20));
        confirm.addActionListener(this::confirmaction);
        distancelength.setBounds(new Rectangle(10, 10, 100, 20));
        add(distanceField);
        add(confirm);
        add(distancelength);
    }
    public void confirmaction(ActionEvent e) {

        if(e.getSource()==confirm) {
                System.exit(0);
            }

    }
}
