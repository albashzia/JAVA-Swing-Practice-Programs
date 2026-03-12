import javax.swing.*;

public class GraphicsFrame extends JFrame{

    GraphicsPanel panel;

    GraphicsFrame(){

        panel = new GraphicsPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
