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
        final int game1 = 1;
        final int game2 = 2;
        final int game3 = 3;
        final int game4 = 4;
        final int game5 = 5;
        final int game6 = 6;

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
            case game6:
                PrimeGame.prime();
                break;
            case game5:
                ProgressionGame.progression();
                break;
            case game4:
                GcdGame.gcd();
                break;
            case game3:
                CalcGame.calc();
                break;
            case game2:
                EvenGame.even();
                break;
            case game1:
                GreetGame.greet();
                break;
            default:
                break;
        }
        //}


    }
}
