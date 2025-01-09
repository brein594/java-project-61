package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

public class PrimeGame {
    private static final int[] PRIME_NUMBER = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
        53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    private static final int NUMBER_OF_GAMES = 3;
    private static final int LENGTH_ARRAYS_ANSWER = 6;


    public static void prime() {
        var playName = Cli.getByName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[] answerQuestion = new String[LENGTH_ARRAYS_ANSWER];
        String answerGame;
        int numberGame = 0;
        var index = 0;

        while (numberGame < NUMBER_OF_GAMES) {
            answerGame = "no";
            var numberRandom = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            for (int simple : PRIME_NUMBER) {
                if (simple == numberRandom) {
                    answerGame = "yes";
                    break;
                }
            }

            answerQuestion[index++] = Integer.toString(numberRandom);
            answerQuestion[index++] = answerGame;
            numberGame++;
        }
        Engine.game(playName, answerQuestion);
    }
}

