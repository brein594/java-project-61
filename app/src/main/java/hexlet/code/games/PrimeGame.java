package hexlet.code.games;

import hexlet.code.Engine;


public class PrimeGame {
    private static final int[] PRIME_NUMBER = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
        53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;

    public static void play() {
        var description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] answerQuestion = new String[Engine.getLengthArraysAnswer()][2];
        String answerGame;
        int numberGame = 0;
        var index = 0;

        while (numberGame < Engine.getRoundsCount()) {
            answerGame = "no";
            var numberRandom = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            for (int simple : PRIME_NUMBER) {
                if (simple == numberRandom) {
                    answerGame = "yes";
                    break;
                }
            }

            answerQuestion[numberGame][0] = Integer.toString(numberRandom);
            answerQuestion[numberGame][1] = answerGame;
            numberGame++;
        }
        Engine.game(description, answerQuestion);
    }
}

