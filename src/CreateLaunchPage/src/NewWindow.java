import javax.swing.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");

    NewWindow(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
