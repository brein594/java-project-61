package hexlet.code;

import java.util.Scanner;


import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.GreetGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;


public class App {
    private static final int GAME_GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;


    public static void main(String[] args) {
        int game = 1;
        //while (play != 0) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        game = scanner.nextInt();
        System.out.println("Your choice: " + game);
        //scanner.close();
        switch (game) {
            case GAME_PRIME:
                PrimeGame.prime();
                break;
            case GAME_PROGRESSION:
                ProgressionGame.progression();
                break;
            case GAME_GCD:
                GcdGame.gcd();
                break;
            case GAME_CALC:
                CalcGame.calc();
                break;
            case GAME_EVEN:
                EvenGame.even();
                break;
            case GAME_GREET:
                GreetGame.greet();
                break;
            default:
                break;
        }
        //}
    }
}
