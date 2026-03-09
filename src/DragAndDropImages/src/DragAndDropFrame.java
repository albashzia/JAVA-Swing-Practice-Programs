import javax.swing.*;

public class DragAndDropFrame extends JFrame{

    DragAndDropPanel dragPanel = new DragAndDropPanel();

    DragAndDropFrame(){

        this.add(dragPanel);

        this.setTitle("Drag and Drop Demo");
        this.setLayout(null);
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
