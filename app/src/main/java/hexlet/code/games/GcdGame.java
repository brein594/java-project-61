package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;

    public static void play() {
        var description = "Find the greatest common divisor of given numbers.";
        String[][] answerQuestion = new String[Engine.getLengthArraysAnswer()][2];
        String answerGame;
        int numberGame = 0;
        var index = 0;

        while (numberGame < Engine.getRoundsCount()) {
            var numberRandomA = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            var numberRandomB = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            int resultInt = findGcd(numberRandomA, numberRandomB);
            answerGame = Integer.toString(resultInt);

            answerQuestion[numberGame][0] = Integer.toString(numberRandomA) + " " + Integer.toString(numberRandomB);
            answerQuestion[numberGame][1] = answerGame;
            numberGame++;
        }
        Engine.game(description, answerQuestion);
    }

    private static int findGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : findGcd(b, a % b);
    }

}
