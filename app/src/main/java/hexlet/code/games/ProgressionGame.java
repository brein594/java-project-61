package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    private static final int RANGE_POSITION = 10;

    public static void play() {
        var description = "What number is missing in the progression?";
        String[][] answerQuestion = new String[Engine.getLengthArraysAnswer()][2];
        String answerGame;


        for (int numberGame = 0; numberGame < Engine.getRoundsCount(); numberGame++) {
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
            answerQuestion[numberGame][0] = String.join(" ", resultString);
            answerQuestion[numberGame][1] = answerGame;

        }
        Engine.game(description, answerQuestion);
    }
}

