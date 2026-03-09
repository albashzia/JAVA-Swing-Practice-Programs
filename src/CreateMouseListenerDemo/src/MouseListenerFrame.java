import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerFrame extends JFrame implements MouseListener{

    JLabel label;
    ImageIcon smile;
    ImageIcon angry;
    ImageIcon nervous;
    ImageIcon dizzy;

    MouseListenerFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        smile = new ImageIcon("smile_500px.png");
        angry = new ImageIcon("angry_500px.png");
        nervous = new ImageIcon("nervous_500px.png");
        dizzy = new ImageIcon("dizzy_500px.png");

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setSize(500,500);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e){

        //System.out.println("you clicked the mouse");
    }
    @Override
    public void mousePressed(MouseEvent e){

        //System.out.println("you pressed the mouse");
    }
    @Override
    public void mouseReleased(MouseEvent e){

        //System.out.println("you released the mouse");
    }
    @Override
    public void mouseEntered(MouseEvent e){

        //System.out.println("you entered the component");
    }
    @Override
    public void mouseExited(MouseEvent e){

        //System.out.println("you exited the component");
    }

}
