import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtonFrame extends JFrame implements ActionListener{

    RadioButtonFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
