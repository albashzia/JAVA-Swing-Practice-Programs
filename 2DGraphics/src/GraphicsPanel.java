import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {

    GraphicsPanel(){
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        //g2d.drawLine(0,0,500,500);
        g2d.drawRect(0,0,100,100);
        g2d.fillRect(150,0,100,100);

        g2d.setPaint(Color.yellow);
        g2d.drawOval(10,120,100,100);
        g2d.fillOval(130,120,100,100);
    }
}
