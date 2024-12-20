package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Game;

public class App {
    public static void main(String[] args) {
        int play = 1;
        while (play != 0 ) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        play = scanner.nextInt();
        System.out.println("Your choice: " + play);
        //scanner.close();
            switch (play) {
                case 6:
                    Game.prime();
                    break;
                case 5:
                    Game.progression();
                    break;
                case 4:
                    Game.gcd();
                    break;
                case 3:
                    Game.calc();
                    break;
                case 2:
                    Game.even();
                    break;
                case 1:
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
