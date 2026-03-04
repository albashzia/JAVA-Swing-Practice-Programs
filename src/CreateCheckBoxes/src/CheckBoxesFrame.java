import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxesFrame extends JFrame implements ActionListener {

    JButton button = new JButton();
    JCheckBox checkBox = new JCheckBox();

    ImageIcon xIcon;
    ImageIcon tickIcon;

    CheckBoxesFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        xIcon = new ImageIcon("x_40px.png");
        tickIcon = new ImageIcon("tick_40px.png");


        button.setText("Submit");
        button.addActionListener(this);


        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.BOLD, 30));

        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(tickIcon);

        this.add(button);

        this.add(checkBox);

        this.setVisible(true);
        this.pack();
    }



    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
    }
}
