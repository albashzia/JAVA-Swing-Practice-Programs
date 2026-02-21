import javax.swing.*;
import java.awt.Color;

public class CreateFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creates a frame
        frame.setVisible(true); // makes frame visible
        frame.setSize(420,420); // sets the x-dimension and y-dimension of frame
        frame.setTitle("First JFrame Program"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevents from being resized

        ImageIcon image = new ImageIcon("LMS.png"); // creates an ImageIcon
        frame.setIconImage(image.getImage()); // change icon of frame

        // DIFFERENT WAYS OF SETTING BACKGROUND COLOR

        //frame.getContentPane().setBackground(Color.GREEN); // setting background color using color import
        //frame.getContentPane().setBackground(new Color(123,50,250)); // setting background color using RGB values
        frame.getContentPane().setBackground(new Color(0x000000)); // setting background color using hexadecimal values
    }
}
