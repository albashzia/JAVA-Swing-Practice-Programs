import java.awt.*;
import javax.swing.*;

public class CreateJLayeredPane {
    public static void main(String args[]){

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);


        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
