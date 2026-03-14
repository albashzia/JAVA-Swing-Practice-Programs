import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CreateFlowLayout {
    public static void main(String args[]){

        //FRAME

        JFrame frame = new JFrame();//instantiating
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setting close operation
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));// arranges components in a centered row with 10px spacing
        frame.setSize(500,500); //setting the size of the frame
        frame.setVisible(true);//setting visibility of the frame

        //PANEL

        JPanel panel = new JPanel();//instantiating
        panel.setPreferredSize(new Dimension(250,250));//setting dimensions of the panel
        panel.setBackground(Color.DARK_GRAY); //setting background color for the panel
        panel.setLayout(new FlowLayout());  // places buttons left-to-right and moves them to a new row when space runs out

        //instantiating and adding buttons to the panel
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));


        //adding panel to the frame
        frame.add(panel);
    }
}
