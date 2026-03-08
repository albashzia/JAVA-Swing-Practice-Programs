import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuBarFrame extends JFrame implements ActionListener{

    MenuBarFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e){

    }
}
