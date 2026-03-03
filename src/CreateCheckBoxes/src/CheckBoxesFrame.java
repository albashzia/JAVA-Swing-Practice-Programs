import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxesFrame extends JFrame implements ActionListener {

    CheckBoxesFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox();

        this.setVisible(true);
        this.pack();
    }



    @Override
    public void actionPerformed(ActionEvent e){

    }
}
