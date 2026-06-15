import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame implements ActionListener{

    JRadioButton pizzaButton = new JRadioButton("Pizza");
    JRadioButton burgerButton = new JRadioButton("Burger");
    JRadioButton hotDogButton = new JRadioButton("HotDog");

    RadioButtonFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        ImageIcon pizzaIcon = new ImageIcon("pizza_40px.png");
        ImageIcon burgerIcon = new ImageIcon("burger_40px.png");
        ImageIcon hotDogIcon = new ImageIcon("hotdog_40px.png");

        ButtonGroup group = new ButtonGroup();

        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(hotDogButton);

        pizzaButton.setIcon(pizzaIcon);
        burgerButton.setIcon(burgerIcon);
        hotDogButton.setIcon(hotDogIcon);

        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(hotDogButton);


        pizzaButton.addActionListener(this);
        burgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==pizzaButton){
            System.out.println("You ordered a pizza.");
        } else if (e.getSource()==burgerButton) {
            System.out.println("You ordered a burger.");
        } else if (e.getSource()==hotDogButton) {
            System.out.println("You ordered a HotDog.");
        }
    }
}
