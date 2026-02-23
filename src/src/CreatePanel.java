import javax.swing.*;
import java.awt.*;

public class CreatePanel {
    public static void main(String[] args)
    {

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,200,200);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(550,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }
}
