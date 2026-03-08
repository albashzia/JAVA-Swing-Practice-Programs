import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class KeyListenerFrame extends JFrame implements KeyListener {

    JLabel label;

    KeyListenerFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.addKeyListener(this);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e){
        switch (e.getKeyChar()){
            case 'a':
                label.setLocation(label.getX()-5,label.getY());
                break;
            case 'd':
                label.setLocation(label.getX()+5, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY()+5);
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY()-5);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e){

    }

    @Override
    public void keyReleased(KeyEvent e){
        //System.out.println("You released key : "+e.getKeyChar());
        System.out.println("You released key with code : "+e.getKeyCode());
    }
}
