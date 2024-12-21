package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class CalcGame {
    public static void calc() {
        var playName = Cli.getByName();
        System.out.println("What is the result of the expression?");
        int answer;
        int indexGame = 0;
        final var NUMBER_LOSER = 1;
        while (indexGame < Engine.NUMBER_OF_GAME) {
            final var RANGE_MAX = 100;
            final var RANGE_FIRST = 1;
            final int RANGE_OPERATION = 3;
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
            System.out.println("Question: " + numberRandomA + " " + resultString + " " + numberRandomB);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();
            if (answer == resultInt) {
                Engine.correct();
                indexGame++;
            } else {
                Engine.failEnd(answer, resultInt, playName);
                indexGame = Engine.NUMBER_OF_GAME + NUMBER_LOSER;
            }
            if (indexGame == Engine.NUMBER_OF_GAME) {
                Engine.succesfulEnd(playName);
            }
        }
    }

}
