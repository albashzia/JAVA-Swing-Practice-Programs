import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserFrame extends JFrame implements ActionListener {

    ColorChooserFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
