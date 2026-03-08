import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ColorChooserFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        label = new JLabel();

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
