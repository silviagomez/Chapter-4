
import java.util.Random;
import java.util.Scanner;

public class Exe317 {

    public static int compChoice() {
        Random rand = new Random();
        double getNum = rand.nextInt(3) + 0;
        int choice = (int) Math.floor(getNum);
        return choice;
    }

    //Rock-Paper-Scissors
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice;
        int compChoice = compChoice();
        System.out.println("Let's play Rock-Paper-Scissors!");
        //Ensure number prompted is between 0-2
        do {
            System.out.print("Rock (0), Paper(1), Scissors (2): ");
            choice = scan.nextInt();
        } while ((choice < 0) || (choice > 2));
        //Prompt Choice
        switch (choice) {
            case 0:
                System.out.println("You choose Rock");
                break;
            case 1:
                System.out.println("You choose Paper");
                break;
            default:
                System.out.println("You choose Scissors");
                break;
        }
        switch (compChoice) {
            case 0:
                System.out.println("The Computer choose Rock");
                break;
            case 1:
                System.out.println("The Computer choose Paper");
                break;
            default:
                System.out.println("The Computer choose Scissors");
                break;
        }

        //Deciding Winner
        if (choice == compChoice) {
            System.out.println("Draw!");
        } else if (compChoice == 0) {
            if (choice == 1) {
                System.out.println("Rock beats Scissors. You've Won!");
            } else {
                System.out.println("Scissors beat Paper. The Computer Wins!");
            }
        } else if (compChoice == 1) {
            if (choice == 2) {
                System.out.println("Paper beats Rock. You've Won!");
            } else {
                System.out.println("Rock beats Scissors. The Computer Wins!");
            }
        } else {
            if (compChoice == 0) {
                System.out.println("Scissors beats Paper. You've Won!");
            } else {
                System.out.println("Paper beats Rock. The Computer Wins!");
            }

        }
    }
}
