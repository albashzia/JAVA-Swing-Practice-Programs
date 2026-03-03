import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxesFrame extends JFrame implements ActionListener {

    JButton button = new JButton();

    CheckBoxesFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        button.setText("Submit");
        button.addActionListener(this);

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.BOLD, 30));

        this.add(checkBox);

        this.setVisible(true);
        this.pack();
    }



    @Override
    public void actionPerformed(ActionEvent e){

    }
}
