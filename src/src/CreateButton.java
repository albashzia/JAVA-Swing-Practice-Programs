import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateButton  {
    JButton button = new JButton();
    public static void main(String[] args){
        new CreateButton();
    }

    public CreateButton(){

        ImageIcon image = new ImageIcon("50px.png");
        button.setBounds(130,100,200,100);
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.ITALIC,25));
        button.setIconTextGap(-6);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        button.addActionListener(e -> System.out.println("Hello"));
        frame.add(button);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==button){
//            System.out.println("Hello World");
//        }
//    }
}
