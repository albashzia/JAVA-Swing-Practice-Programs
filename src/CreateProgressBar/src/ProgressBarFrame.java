import javax.swing.*;
import java.awt.*;

public class ProgressBarFrame {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBarFrame(){

        bar.setValue(0);


        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
