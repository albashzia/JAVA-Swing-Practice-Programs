import javax.swing.*;

public class DragAndDropFrame extends JFrame{

    DragAndDropPanel dragPanel;

    DragAndDropFrame(){

        dragPanel  = new DragAndDropPanel();
        this.add(dragPanel);

        this.setTitle("Drag and Drop Demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
