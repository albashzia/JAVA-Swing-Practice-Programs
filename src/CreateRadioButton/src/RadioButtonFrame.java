import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame implements ActionListener{

    RadioButtonFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        JRadioButton pizzaButton = new JRadioButton("Pizza");
        JRadioButton burgerButton = new JRadioButton("Burger");
        JRadioButton hotdogButton = new JRadioButton("HotDog");

        this.setLayout(new FlowLayout());
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
