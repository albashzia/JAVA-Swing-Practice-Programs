import javax.swing.*;
import java.awt.*;

public class CreateBorderLayout {
    public static void main(String args[]){

        // ==========FRAME==========
        JFrame frame = new JFrame();//instantiating
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setting close operation
        frame.setSize(500,500);//setting size
        frame.setLayout(new BorderLayout(10,10));// sets BorderLayout with 10px spacing between components

        // ==========MAIN PANELS==========
        //instantiating
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        //setting background colors
        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.cyan);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.orange);

        //setting the dimensions of the panels
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        panel5.setLayout(new BorderLayout());//sets border layout for panel5

        //adding panels to the frame
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);

        // ==========SUB-PANELS==========
        //instantiating
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        //setting background color
        panel6.setBackground(Color.black);
        panel7.setBackground(Color.gray);
        panel8.setBackground(Color.darkGray);
        panel9.setBackground(Color.pink);
        panel10.setBackground(Color.RED);

        //setting size for the sub-panels
        panel6.setPreferredSize(new Dimension(20,20));
        panel7.setPreferredSize(new Dimension(20,20));
        panel8.setPreferredSize(new Dimension(20,20));
        panel9.setPreferredSize(new Dimension(20,20));
        panel10.setPreferredSize(new Dimension(20,20));

        //adding the sub-panels to panel5 along with their position on the panel using BorderLayout
        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.SOUTH);
        panel5.add(panel10,BorderLayout.CENTER);


        frame.setVisible(true);//setting the visibility of the frame
    }
}
