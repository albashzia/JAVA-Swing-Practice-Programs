import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CreateFrameTextField extends JFrame implements ActionListener{

    JButton button = new JButton("Submit");
    JTextField textField = new JTextField();

    CreateFrameTextField(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField.setPreferredSize(new Dimension(250,40));

        textField.setFont(new Font("Consolas",Font.BOLD,30));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("username");

        button.addActionListener(this);

        this.add(textField);
        this.add(button);
        this.setVisible(true);
        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            String inp = textField.getText();
            System.out.println(inp);
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
