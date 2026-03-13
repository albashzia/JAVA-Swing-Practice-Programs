import javax.swing.*;
import java.awt.*;

public class CreatePanel {
    public static void main(String[] args)
    {
        //creating an ImageIcon object to hold an image
        ImageIcon icon = new ImageIcon("300px.png");

        //Creating a JLabel
        JLabel label = new JLabel(); //instantiating
        label.setText("Hi"); //setting text
        label.setIcon(icon); //setting icon to the label
        label.setVerticalAlignment(JLabel.CENTER); //setting the alignment of the label
        label.setHorizontalAlignment(JLabel.CENTER); //setting the alignment of the label

        //Creating a panel
        JPanel redPanel = new JPanel(); //instantiating
        redPanel.setBackground(Color.red); //setting background color
        redPanel.setBounds(0,0,200,200); //setting bounds for the panel

        //Creating a panel
        JPanel bluePanel = new JPanel(); //instantiating
        bluePanel.setBackground(Color.blue); //setting background color
        bluePanel.setBounds(200,0,200,200); //setting bounds for the panel

        //Creating a panel
        JPanel greenPanel = new JPanel(); //instantiating
        greenPanel.setBackground(Color.green); //setting background color
        greenPanel.setBounds(0,200,400,350); //setting bounds for the panel
        greenPanel.setLayout(new BorderLayout()); //uses BorderLayout to manage components inside the panel
        greenPanel.add(label); //adding the label to the panel

        //Creating a frame container holding the label and panel
        JFrame frame = new JFrame(); //instantiating
        frame.setSize(600,600); //setting frame size
        frame.setVisible(true); //setting visibility of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting the exit button for the frame
        frame.setLayout(null); //uses absolute positioning instead of a layout manager
        frame.add(redPanel); //adding the panel to frame
        frame.add(bluePanel); //adding the panel to frame
        frame.add(greenPanel); //adding the panel to frame
    }
}
