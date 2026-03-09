import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerFrame extends JFrame implements MouseListener{

    JLabel label;

    MouseListenerFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);

        this.add(label);
        this.setSize(500,500);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e){

    }
    @Override
    public void mousePressed(MouseEvent e){

    }
    @Override
    public void mouseReleased(MouseEvent e){

    }
    @Override
    public void mouseEntered(MouseEvent e){

    }
    @Override
    public void mouseExited(MouseEvent e){

    }

}
