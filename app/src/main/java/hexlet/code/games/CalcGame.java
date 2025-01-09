package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

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
        String answerGame ;
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
            answerQuestion[index++] =  answerGame;
            numberGame++;
        }
        Engine.game(playName, answerQuestion);
        //} while (Engine.game(playName, answerGame, answerUser, numberGame));

        //вариант 2
    /*
    public static String[] calc() {
        String[] result = new String[LENGTH_ARRAYS_ANSWER];
        var numberRandomA = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
        var numberRandomB = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
        Random random = new Random();
        int numberRandomOperation = random.nextInt(RANGE_OPERATION);
        int resultInt = 0;
        String resultString = "";
        switch (numberRandomOperation) {
            case (0):
                resultInt = numberRandomA + numberRandomB;
                resultString = "+";
                break;
            case (1):
                resultInt = numberRandomA - numberRandomB;
                resultString = "-";
                break;
            case (2):
                resultInt = numberRandomA * numberRandomB;
                resultString = "*";
                break;
            default:
                break;
        }
        result[0] = "What is the result of the expression?";
        result[1] = Integer.toString(numberRandomA) + " " + resultString + " " + Integer.toString(numberRandomB);
        result[2] = Integer.toString(resultInt);
        return result;

     */
        //вариант 1
        /*
        var playName = Cli.getByName();
        System.out.println("What is the result of the expression?");
        int answer;
        int indexGame = 0;
        final var numberLoser = 1;
        while (indexGame < Engine.NUMBER_OF_GAMES) {
            final int rangeMax = 100;
            final int rangeFirst = 1;
            final int rangeOperation = 3;
            var numberRandomA = (int) (Math.random() * rangeMax) + rangeFirst;
            var numberRandomB = (int) (Math.random() * rangeMax) + rangeFirst;
            Random random = new Random();
            int numberRandomOperation = random.nextInt(rangeOperation);
            int resultInt = 0;
            String resultString = "";
            switch (numberRandomOperation) {
                case (0):
                    resultInt = numberRandomA + numberRandomB;
                    resultString = "+";
                    break;
                case (1):
                    resultInt = numberRandomA - numberRandomB;
                    resultString = "-";
                    break;
                case (2):
                    resultInt = numberRandomA * numberRandomB;
                    resultString = "*";
                    break;
                default:
                    break;
            }
            System.out.println("Question: " + numberRandomA + " " + resultString + " " + numberRandomB);
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
}
