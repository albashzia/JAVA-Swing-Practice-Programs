import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CreateFlowLayout {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        frame.setSize(500,500);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.DARK_GRAY);

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

    }
}
