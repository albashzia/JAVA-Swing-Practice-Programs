import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener  {

    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");

    LaunchPage(){

        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setLayout(null);

        frame.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){

            NewWindow window = new NewWindow();

        }
    }
}
