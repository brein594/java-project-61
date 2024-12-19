package hexlet.code;
import  hexlet.code.Cli;
import java.util.Scanner;
import hexlet.code.Game;

public class App {
    public static void main(String[] args) {
        int play = 1;
        while (play != 0 ) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        play = scanner.nextInt();
        System.out.println("Your choice: " + play);
        //scanner.close();
            switch (play) {
                case 2:
                    System.out.println("Welcome to the Brain Games!");
                    Game.even();
                    break;
                case 1:
                    System.out.println("Welcome to the Brain Games!");
                    Game.greet();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }


    }
}
