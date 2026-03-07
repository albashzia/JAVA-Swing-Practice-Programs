import javax.swing.*;
import java.awt.*;

public class ProgressBarFrame {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBarFrame(){

        bar.setValue(0);
        bar.setBounds(0,0,400,50);
        bar.setStringPainted(true);
        bar.setForeground(Color.BLUE);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        fill();
    }
    public void fill(){
        int counter = 0;

        while(counter<=100){
            bar.setValue(counter);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            counter+=1;
        }
        bar.setString("Done!");

    }
}
