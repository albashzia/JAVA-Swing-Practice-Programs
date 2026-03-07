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
    }

    @Override
    public void stateChanged(ChangeEvent e){

    }
}
