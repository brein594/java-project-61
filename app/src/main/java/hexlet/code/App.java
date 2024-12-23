package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GreetGame;


public class App {
    public static void main(String[] args) {
        private static final int GAME_GREET = 1;
        final int gameEven = 2;
        final int gameCalc = 3;
        final int gameGcd = 4;
        final int gameProgression = 5;
        final int gamePrime = 6;

        int play = 1;
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
        play = scanner.nextInt();
        System.out.println("Your choice: " + play);
        //scanner.close();
        switch (play) {
            case gamePrime:
                PrimeGame.prime();
                break;
            case gameProgression:
                ProgressionGame.progression();
                break;
            case gameGcd:
                GcdGame.gcd();
                break;
            case gameCalc:
                CalcGame.calc();
                break;
            case gameEven:
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
