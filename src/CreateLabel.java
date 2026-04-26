import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class CreateLabel {
    public static void main() {

        ImageIcon image = new ImageIcon("300px.png"); // creating an ImageIcon
        Border border = BorderFactory.createLineBorder(Color.BLACK,3); // creating a border

        // LABEL

        JLabel label = new JLabel(); // creating an instance of JLabel
        label.setText("Do you even code bro???"); // setting text on the label
        label.setIcon(image); // setting image for the label using ImageIcon object
        label.setHorizontalTextPosition(JLabel.CENTER); // setting horizontal position of the text
        label.setVerticalTextPosition(JLabel.TOP); // setting vertical position of the text


        // SETTING BACKGROUND COLOR USING DIFFERENT METHODS

        //label.setForeground(Color.BLUE); // using Color class
        //label.setForeground(new Color(20,200,60)); // using RGB values
        label.setForeground(new Color(0x000333)); // using hexadecimal coding

        label.setFont(new Font("MV Boli",Font.PLAIN,20)); // modifying font of the label

        label.setIconTextGap(70); // setting the gap between the text and icon on the label

        label.setBackground(Color.cyan); // setting background color of the label

        label.setOpaque(true); // setting opaqueness of the label

        label.setBorder(border); // adding the created border instance to the label

        label.setVerticalAlignment(JLabel.CENTER); // setting vertical alignment of the label
        label.setHorizontalAlignment(JLabel.CENTER); // setting horizontal alignment of the label

        //label.setBounds(0,0,450,450);

        // FRAME

        JFrame frame = new JFrame(); // creating the frame instance
        //frame.setSize(500,500);
        frame.setResizable(false); // restricting the resizability of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allowing the exit on close
        frame.setVisible(true); // setting visibility
        frame.setTitle("Labels Practice Program"); // setting title of the frame
        //frame.setLayout(null);

        frame.add(label); // adding the label to the frame

        frame.pack();
    }
}
