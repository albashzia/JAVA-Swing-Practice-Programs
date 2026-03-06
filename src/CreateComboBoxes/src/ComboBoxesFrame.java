import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxesFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    ComboBoxesFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog","cat","bird"};
        comboBox = new JComboBox();

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e){

    }
}
