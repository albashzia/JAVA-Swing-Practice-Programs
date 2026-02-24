import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateButton  implements ActionListener {
    JButton button = new JButton();
    public static void main(String[] args){
        new CreateButton();
    }

    public CreateButton(){
        button.setBounds(130,100,200,100);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        button.addActionListener(this);
        frame.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Hello World");
        }
    }
}
