import java.util.Scanner;
public class MainRunner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the respective number to call the constructor:\n" +
                "1.CreateFrame" +
                "\n2.CreateLabel" +
                "\n3.CreateButton" +
                "\n4.CreatePanel" +
                "\n5.CreateJOptionPane" +
                "\n6.CreateJLayeredPane" +
                "\n7.CreateGridLayout" +
                "\n8." +
                "\n9." +
                "\n10.");
        int userInput = input.nextInt();

        if (userInput==1){
            new CreateFrame();
        }

        else if (userInput==2){
            new CreateLabel();
        }

        else if(userInput==3){
            new CreateButton();
        }

        else if(userInput==4){
            new CreatePanel();
        }

        else if(userInput==5){
            new CreateJOptionPane();
        }

        else if(userInput==6){
            new CreateJLayeredPane();
        }

        else if(userInput==7){
            new CreateGridLayout();
        }
    }
}
