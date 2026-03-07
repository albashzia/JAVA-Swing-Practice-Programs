import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSliderFrame implements ChangeListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    JSliderFrame(){
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50); // (min value, max value, starting value)

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void stateChanged(ChangeEvent e){

    }
}
