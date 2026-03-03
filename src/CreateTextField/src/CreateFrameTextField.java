import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CreateFrameTextField extends JFrame implements ActionListener{

    CreateFrameTextField(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Submit");

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));

        button.addActionListener(this);

        this.add(textField);
        this.add(button);
        this.setVisible(true);
        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
