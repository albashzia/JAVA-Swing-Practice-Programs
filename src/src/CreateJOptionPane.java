import javax.swing.JOptionPane;

public class CreateJOptionPane {
    public static void main(String args[]){

        //JOptionPane.showMessageDialog(null,"This is a message","Title", JOptionPane.PLAIN_MESSAGE );
        //JOptionPane.showMessageDialog(null,"This is a message","Title", JOptionPane.INFORMATION_MESSAGE );
        //JOptionPane.showMessageDialog(null,"This is a message","Title", JOptionPane.QUESTION_MESSAGE );
        //JOptionPane.showMessageDialog(null,"This is a message","Title", JOptionPane.WARNING_MESSAGE );
        //JOptionPane.showMessageDialog(null,"This is a message","Title", JOptionPane.ERROR_MESSAGE );

        //JOptionPane.showConfirmDialog(null,"Bro, Do you even code???","This is title",JOptionPane.YES_NO_CANCEL_OPTION); // returns int value

        //String name = JOptionPane.showInputDialog("What is your name?");

        JOptionPane.showOptionDialog(null,"You are awesome!","Title",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,0);
    }
}
