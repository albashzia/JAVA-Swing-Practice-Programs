import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class DragAndDropPanel extends JPanel {

    ImageIcon icon = new ImageIcon("smile_120px.png");

    DragAndDropPanel(){

    }

    public void paintComponent(Graphics g){

    }

    private class ClickListener extends MouseAdapter{

    }

    private class DragListener extends MouseMotionAdapter{

    }
}
