import javax.swing.*;
import javax.swing.Action;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.Desktop.*;

public class KeyBinderFrame {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    KeyBinderFrame() {
        frame = new JFrame("Key Binding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBounds(100,100,100,100);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        frame.add(label);
        frame.setVisible(true);

    }

    public class UpAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class DownAction extends AbstractAction{
        public void actionPerformed(ActionEvent e){

        }
    }

    public class LeftAction extends AbstractAction{
        public void actionPerformed(ActionEvent e){

        }
    }

    public class RightAction extends AbstractAction{
        public void actionPerformed(ActionEvent e){

        }
    }
}
