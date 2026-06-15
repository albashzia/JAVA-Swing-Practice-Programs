import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ColorChooserFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        label = new JLabel();

        button.addActionListener(this);

        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setFont(new Font("MV Boli", Font.ITALIC,100));
        label.setText("This is some text");

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Color Chooser Dialog Box",Color.BLACK);
            label.setForeground(color);
        }
    }
}
