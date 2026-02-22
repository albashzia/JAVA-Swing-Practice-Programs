import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class CreateLabel {
    public static void main() {

        ImageIcon image = new ImageIcon("300px.png");

        JLabel label = new JLabel();
        label.setText("Do you even code bro???");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        //label.setForeground(Color.BLUE);
        //label.setForeground(new Color(20,200,60));
        label.setForeground(new Color(0x000333));

        label.setFont(new Font("MV Boli",Font.PLAIN,20));

        label.setIconTextGap(70);

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Labels Practice Program");

        frame.add(label);
    }
}
