import java.util.Scanner;
public class Exe415 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Phone Key Pad: Letter->Number");
            System.out.print("Enter a Letter: ");
            String letter = scan.next();
            letter = letter.toUpperCase();
            letterToNumber(letter);

        }

        public static void letterToNumber(String letter){
            switch (letter){
                case "A":
                    System.out.println("The corresponding number is 2");
                    break;
                case "B":
                    System.out.println("The corresponding number is 2");
                    break;
                case "C":
                    System.out.println("The corresponding number is 2");
                    break;
                case "D":
                    System.out.println("The corresponding number is 3");
                    break;
                case "E":
                    System.out.println("The corresponding number is 3");
                    break;
                case "F":
                    System.out.println("The corresponding number is 3");
                    break;
                case "G":
                    System.out.println("The corresponding number is 4");
                    break;
                case "H":
                    System.out.println("The corresponding number is 4");
                    break;
                case "I":
                    System.out.println("The corresponding number is 4");
                    break;
                case "J":
                    System.out.println("The corresponding number is 5");
                    break;
                case "K":
                    System.out.println("The corresponding number is 5");
                    break;
                case "L":
                    System.out.println("The corresponding number is 5");
                    break;
                case "M":
                    System.out.println("The corresponding number is 6");
                    break;
                case "N":
                    System.out.println("The corresponding number is 6");
                    break;
                case "O":
                    System.out.println("The corresponding number is 6");
                    break;
                case "P":
                    System.out.println("The corresponding number is 7");
                    break;
                case "Q":
                    System.out.println("The corresponding number is 7");
                    break;
                case "R":
                    System.out.println("The corresponding number is 7");
                    break;
                case "S":
                    System.out.println("The corresponding number is 7");
                    break;
                case "T":
                    System.out.println("The corresponding number is 8");
                    break;
                case "U":
                    System.out.println("The corresponding number is 8");
                    break;
                case "V":
                    System.out.println("The corresponding number is 8");
                    break;
                case "W":
                    System.out.println("The corresponding number is 9");
                    break;
                case "X":
                    System.out.println("The corresponding number is 9");
                    break;
                case "Y":
                    System.out.println("The corresponding number is 9");
                    break;
                case "Z":
                    System.out.println("The corresponding number is 9");
                    break;
                default:
                    System.out.println(letter+" is an invalid input");

            }

        }
    }


