import javax.swing.*;
import java.awt.Color;

public class CreateFrame {
    public static void main() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setTitle("First JFrame Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("LMS.png");
        frame.setIconImage(image.getImage());
        //frame.getContentPane().setBackground(Color.GREEN);
        frame.getContentPane().setBackground(new Color(123,50,250));
    }
}
