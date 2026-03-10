import java.awt.*;
import javax.swing.*;

public class GraphicsFrame extends JFrame{

    GraphicsFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawLine(0,0,500,500);
    }
}
