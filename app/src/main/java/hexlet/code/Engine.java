package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

public class Engine {
    private static final int NUMBER_OF_GAMES = 3;
    private static final int NUMBER_LOSER = 1;
    private String answer;

    //private static final int GAME_GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;


    public static void game(int numberGame) {
        var playName = Cli.getByName();
        int indexGame = 0;

        //System.out.println(nameGame[0]);
        while (indexGame < NUMBER_OF_GAMES) {
            String[] answerGame = new String[3];
            if (numberGame == GAME_EVEN) {
                answerGame = EvenGame.even();
            }
            if (numberGame == GAME_CALC) {
                answerGame = CalcGame.calc();
            }
            if (numberGame == GAME_GCD) {
                answerGame = GcdGame.gcd();
            }
            if (numberGame == GAME_PROGRESSION) {
                answerGame = ProgressionGame.progression();
            }
            if (numberGame == GAME_PRIME) {
                answerGame = PrimeGame.prime();
            }

            if (indexGame == 0) {
                System.out.println(answerGame[0]);
            }
            System.out.println("Question: " + answerGame[1]);
            System.out.print("Your answer:  ");
            Scanner scanner = new Scanner(System.in);
            var answerUser = scanner.nextLine();
            if (answerGame[2].equals(answerUser)) {
                System.out.println("Correct!");
                indexGame++;
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was " + answerGame[2]);
                System.out.println("Let's try again, " + playName + "!");
                indexGame = Engine.NUMBER_OF_GAMES + NUMBER_LOSER;
            }
            if (indexGame == Engine.NUMBER_OF_GAMES) {
                System.out.println("Congratulations, " + playName + "!");
            }
        }
    }








    /*
    public static final int NUMBER_OF_GAMES = 3;

    public static void showWinMessage(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    public static void showFailMessage(String answer, String result, String name) {
        System.out.println(answer + " is wrong answer ;(. Correct answer was " + result);
        System.out.println("Let's try again, " + name + "!");
    }

    public static void showFailMessage(int answer, int result, String name) {
        System.out.println(answer + " is wrong answer ;(. Correct answer was " + result);
        System.out.println("Let's try again, " + name + "!");
    }

    public static void showCorrectMessage() {
        System.out.println("Correct!");
    }
     */


}
