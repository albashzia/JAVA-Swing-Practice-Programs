import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,5,5));
        panel.add(new JButton("9"));
        panel.add(new JButton("8"));
        panel.add(new JButton("7"));
        panel.add(new JButton("/"));
        panel.add(new JButton("6"));
        panel.add(new JButton("5"));
        panel.add(new JButton("4"));
        panel.add(new JButton("*"));
        panel.add(new JButton("3"));
        panel.add(new JButton("2"));
        panel.add(new JButton("1"));
        panel.add(new JButton("-"));
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));
        this.add(panel);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
