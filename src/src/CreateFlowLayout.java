import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class CreateFlowLayout {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);

    }
}
