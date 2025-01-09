package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;
import hexlet.code.Cli;

public class CalcGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    private static final int RANGE_OPERATION = 3;
    private static final int NUMBER_OF_GAMES = 3;
    private static final int LENGTH_ARRAYS_ANSWER = 6;

    public static void calc() {
        var playName = Cli.getByName();
        System.out.println("What is the result of the expression?");
        String[] answerQuestion = new String[LENGTH_ARRAYS_ANSWER];
        String answerGame;
        int numberGame = 0;
        var index = 0;

        while (numberGame < NUMBER_OF_GAMES) {
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
            answerQuestion[index++] = Integer.toString(numberRandomA) + resultString + Integer.toString(numberRandomB);
            answerQuestion[index++] = answerGame;
            numberGame++;
        }
        Engine.game(playName, answerQuestion);
    }
}

