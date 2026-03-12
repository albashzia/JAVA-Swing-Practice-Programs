import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AnimationsPanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    AnimationsPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        enemy = new ImageIcon("enemy_40px.png").getImage();
        timer = new Timer(10,this);
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D)g;

        g2D.drawImage(enemy,x,y,null);
    }

    public void actionPerformed(ActionEvent e){
        if(x>=PANEL_WIDTH-enemy.getWidth(null)|| x<0){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        repaint();
    }
}
