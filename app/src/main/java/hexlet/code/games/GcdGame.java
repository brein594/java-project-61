package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GcdGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    private static final int NUMBER_OF_GAMES = 3;
    private static final int LENGTH_ARRAYS_ANSWER = 6;

    public static void gcd() {
        var playName = Cli.getByName();
        System.out.println("Find the greatest common divisor of given numbers.");
        String[] answerQuestion = new String[LENGTH_ARRAYS_ANSWER];
        String answerGame;
        int numberGame = 0;
        var index = 0;

        while (numberGame < NUMBER_OF_GAMES) {
            var numberRandomA = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            var numberRandomB = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            int resultInt = findGcd(numberRandomA, numberRandomB);
            answerGame = Integer.toString(resultInt);

            answerQuestion[index++] = Integer.toString(numberRandomA) + " " + Integer.toString(numberRandomB);
            answerQuestion[index++] = answerGame;
            numberGame++;
        }
        Engine.game(playName, answerQuestion);
    }

    private static int findGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : findGcd(b, a % b);
    }

}
