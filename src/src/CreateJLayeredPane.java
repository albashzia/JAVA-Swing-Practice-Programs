import java.awt.*;
import javax.swing.*;

public class CreateJLayeredPane {
    public static void main(String args[]){

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBounds(50,50,100,100);
        label1.setBackground(Color.RED);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBounds(100,100,100,100);
        label2.setBackground(Color.GREEN);
        
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBounds(150,150,100,100);
        label3.setBackground(Color.BLUE);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);


        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
