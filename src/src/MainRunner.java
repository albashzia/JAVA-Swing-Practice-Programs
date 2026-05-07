import java.util.Scanner;
public class MainRunner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the respective number to call the constructor:\n" +
                "1.CreateFrame" +
                "\n2.CreateLabel" +
                "\n3.CreateButton" +
                "\n4." +
                "\n5." +
                "\n6." +
                "\n7." +
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
    }
}
