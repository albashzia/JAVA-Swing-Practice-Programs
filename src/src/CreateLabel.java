import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class CreateLabel {
    public static void main() {

        ImageIcon image = new ImageIcon("LMS.png");

        JLabel label = new JLabel();
        label.setText("Do you even code bro???");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setSize(2500,2500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Labels Practice Program");

        frame.add(label);
    }
}
