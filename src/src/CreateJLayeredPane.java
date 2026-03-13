import java.awt.*;
import javax.swing.*;

public class CreateJLayeredPane {
    public static void main(String args[]){

        // LABELS

        //instantiating
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        //setting opacity
        label1.setOpaque(true);
        label2.setOpaque(true);
        label3.setOpaque(true);

        //setting bounds
        label1.setBounds(50,50,200,200);
        label2.setBounds(100,100,200,200);
        label3.setBounds(150,150,200,200);

        //setting background colors
        label1.setBackground(Color.RED);
        label2.setBackground(Color.GREEN);
        label3.setBackground(Color.BLUE);


        // LAYERED PANE

        JLayeredPane layeredPane = new JLayeredPane(); //instantiating a layered pane
        layeredPane.setBounds(0,0,500,500); //setting bounds of the pane

//        layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
//        layeredPane.add(label2,JLayeredPane.DEFAULT_LAYER);
//        layeredPane.add(label3,JLayeredPane.DRAG_LAYER);

        layeredPane.add(label1,Integer.valueOf(0)); //adding to the pane and assigning stack position to the label
        layeredPane.add(label2,Integer.valueOf(0)); //adding to the pane and assigning stack position to the label
        layeredPane.add(label3,Integer.valueOf(1)); //adding to the pane and assigning stack position to the label


        //FRAME

        JFrame frame = new JFrame(); //instantiating
        frame.add(layeredPane); //adding layered pane to the frame
        frame.setLayout(null); //uses absolute positioning instead of a layout manager
        frame.setSize(500,500); //setting the frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //assigning a close operation
        frame.setVisible(true); //setting the visibility of the frame
    }
}
