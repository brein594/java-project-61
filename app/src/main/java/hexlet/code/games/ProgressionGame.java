package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

public class ProgressionGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    private static final int RANGE_POSITION = 10;
    private static final int NUMBER_OF_GAMES = 3;
    private static final int LENGTH_ARRAYS_ANSWER = 6;

    public static void progression() {
        var playName = Cli.getByName();
        System.out.println("What number is missing in the progression?");
        String[] answerQuestion = new String[LENGTH_ARRAYS_ANSWER];
        String answerGame;
        int numberGame = 0;
        var index = 0;

        while (numberGame < NUMBER_OF_GAMES) {
            var numberRandomA1 = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            var stepProgress = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            var numberRandomPosition = (int) (Math.random() * RANGE_POSITION);
            int[] arifProgress = new int[RANGE_POSITION];
            arifProgress[0] = numberRandomA1;
            for (int i = 1; i < RANGE_POSITION; i++) {
                arifProgress[i] = arifProgress[0] + i * stepProgress;
            }
            int resultInt = arifProgress[numberRandomPosition];
            answerGame = Integer.toString(resultInt);

            String[] resultString = new String[RANGE_POSITION];
            for (int i = 0; i < RANGE_POSITION; i++) {
                if (i != numberRandomPosition) {
                    resultString[i] = Integer.toString(arifProgress[i]);
                } else {
                    resultString[i] = "..";
                }
            }
            answerQuestion[index++] = String.join(" ", resultString);
            answerQuestion[index++] = answerGame;
            numberGame++;
        }
        Engine.game(playName, answerQuestion);
    }
}

