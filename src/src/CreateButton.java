import javax.swing.JFrame;
import javax.swing.JButton;

public class CreateButton {
    public static void main(String[] args){

        JButton button = new JButton();
        button.setBounds(130,100,200,100);


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        frame.add(button);
    }
}
