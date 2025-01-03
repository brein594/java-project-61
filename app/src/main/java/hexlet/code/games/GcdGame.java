package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class GcdGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    private static final int LENGTH_ARRAYS_ANSWER = 3;

    //вариант 3
    public static void gcd() {
        var playName = Cli.getByName();
        System.out.println("Find the greatest common divisor of given numbers.");
        String answerGame;
        String answerUser;
        int numberGame = 0;
        do {
            var numberRandomA = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            var numberRandomB = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            int resultInt = findGcd(numberRandomA, numberRandomB);
            answerGame = Integer.toString(resultInt);
            System.out.println("Question: " + numberRandomA + " " + numberRandomB);
            System.out.print("Your answer:  ");
            Scanner scanner = new Scanner(System.in);
            answerUser = scanner.nextLine();
            numberGame++;
        } while (Engine.game(playName, answerGame, answerUser, numberGame));

        //вариант 2
    /*
    public static String[] gcd() {
        String[] result = new String[LENGTH_ARRAYS_ANSWER];
        var numberRandomA = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
        var numberRandomB = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
        int resultInt = findGcd(numberRandomA, numberRandomB);
        result[0] = "Find the greatest common divisor of given numbers.";
        result[1] = Integer.toString(numberRandomA) + " " + Integer.toString(numberRandomB);
        result[2] = Integer.toString(resultInt);
        return result;

     */

        //вариант1
        /*
        var playName = Cli.getByName();
        System.out.println("Find the greatest common divisor of given numbers.");
        int answer;
        int indexGame = 0;
        final int numberLoser = 1;
        while (indexGame < Engine.NUMBER_OF_GAMES) {
            final int rangeMax = 100;
            final int rangeFirst = 1;
            var numberRandomA = (int) (Math.random() * rangeMax) + rangeFirst;
            var numberRandomB = (int) (Math.random() * rangeMax) + rangeFirst;
            int resultInt = findGcd(numberRandomA, numberRandomB);
            System.out.println("Question: " + numberRandomA + " " + numberRandomB);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();

            if (answer == resultInt) {
                Engine.showCorrectMessage();
                indexGame++;
            } else {
                Engine.showFailMessage(answer, resultInt, playName);
                indexGame = Engine.NUMBER_OF_GAMES + numberLoser;
            }
            if (indexGame == Engine.NUMBER_OF_GAMES) {
                Engine.showWinMessage(playName);
            }
        }

         */
    }

    private static int findGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : findGcd(b, a % b);
    }

}
