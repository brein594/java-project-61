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
    }

}
