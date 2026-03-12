import java.awt.*;
import javax.swing.*;

public class AnimationsFrame extends JFrame{

    AnimationsPanel panel;

    AnimationsFrame(){

        panel = new AnimationsPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
