import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame implements ActionListener{

    RadioButtonFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        ButtonGroup group = new ButtonGroup();

        JRadioButton pizzaButton = new JRadioButton("Pizza");
        JRadioButton burgerButton = new JRadioButton("Burger");
        JRadioButton hotDogButton = new JRadioButton("HotDog");

        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(hotDogButton);

        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(hotDogButton);

        this.setLayout(new FlowLayout());
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
