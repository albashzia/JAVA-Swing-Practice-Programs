import javax.swing.*;
import java.awt.*;

public class ProgressBarFrame {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBarFrame(){

        bar.setValue(0);
        bar.setBounds(0,0,400,50);
        bar.setStringPainted(true);

        frame.add(bar);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
