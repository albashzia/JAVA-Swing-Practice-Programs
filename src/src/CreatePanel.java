import javax.swing.*;
import java.awt.*;

public class CreatePanel {
    public static void main(String[] args)
    {

        ImageIcon icon = new ImageIcon("300px.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,200,200);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(200,0,200,200);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,200,400,350);
        greenPanel.add(label);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
