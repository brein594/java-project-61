package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public class CalcGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    private static final int RANGE_OPERATION = 3;

    public static void play() {
        var description = "What is the result of the expression?";
        String[][] answerQuestion = new String[Engine.getLengthArraysAnswer()][2];
        String answerGame;

        for (var numberGame = 0; numberGame < Engine.getRoundsCount(); numberGame++) {
            var numberRandomA = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            var numberRandomB = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            Random random = new Random();
            int numberRandomOperation = random.nextInt(RANGE_OPERATION);
            int resultInt = 0;
            String resultString = "";
            switch (numberRandomOperation) {
                case (0):
                    resultInt = numberRandomA + numberRandomB;
                    resultString = " + ";
                    break;
                case (1):
                    resultInt = numberRandomA - numberRandomB;
                    resultString = " - ";
                    break;
                case (2):
                    resultInt = numberRandomA * numberRandomB;
                    resultString = " * ";
                    break;
                default:
                    break;
            }
            answerGame = Integer.toString(resultInt);
            answerQuestion[numberGame][0] = Integer.toString(numberRandomA) + resultString
                    + Integer.toString(numberRandomB);
            answerQuestion[numberGame][1] = answerGame;
        }
        Engine.game(description, answerQuestion);
    }
}

