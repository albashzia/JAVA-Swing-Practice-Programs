import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class CreateGridLayout {
    public static void main(String args[]){
        JFrame frame = new JFrame();//instantiating the frame
        frame.setSize(500,500);//setting the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setting close operation
        frame.setLayout(new GridLayout(3,3,10,10));//arranges components in a grid with 3 rows,3 columns and 10px spacing between components
        //adding 9 button components to the frame
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setVisible(true);//setting the visibility of the frame
    }
}
