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
                case 6:
                    PrimeGame.prime();
                    break;
                case 5:
                    ProgressionGame.progression();
                    break;
                case 4:
                    GcdGame.gcd();
                    break;
                case 3:
                    CalcGame.calc();
                    break;
                case 2:
                    EvenGame.even();
                    break;
                case 1:
                    GreetGame.greet();
                    break;
                default:
                    break;
            }
        //}


    }
}
