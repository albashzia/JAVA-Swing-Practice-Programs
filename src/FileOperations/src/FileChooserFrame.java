import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FileChooserFrame extends JFrame implements ActionListener {

    FileChooserFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());



        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
