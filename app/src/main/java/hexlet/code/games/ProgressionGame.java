package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public class ProgressionGame {
    public static void progression() {
        var playName = Cli.getByName();
        System.out.println("What number is missing in the progression?");
        int answer;
        int indexGame = 0;
        final var numberLoser = 1;
        while (indexGame < Engine.NUMBER_OF_GAME) {
            final var rangeMax = 100;
            final var rangeMaxPosition = 10;
            final var rangeFirst = 1;
            final var stepArray = 1;
            final var firstElement = 0;
            var numberRandomA1 = (int) (Math.random() * rangeMax) + rangeFirst;
            var stepProgress = (int) (Math.random() * rangeMax) + rangeFirst;
            var numberRandomPosition = (int) (Math.random() * rangeMaxPosition);
            int[] arifProgress = new int[rangeMaxPosition];
            arifProgress[0] = numberRandomA1;
            for (int i = 1; i < rangeMaxPosition; i++) {
                arifProgress[i] = arifProgress[0] + i * stepProgress;
            }
            int resultInt = arifProgress[numberRandomPosition];
            System.out.print("Question: ");
            for (int index : Arrays.copyOfRange(arifProgress, firstElement, numberRandomPosition)) {
                System.out.print(index + " ");
            }
            System.out.print(".." + " ");
            if (numberRandomPosition < arifProgress.length - stepArray) {
                for (int index : Arrays.copyOfRange(arifProgress, numberRandomPosition +  stepArray,
                        arifProgress.length -  stepArray)) {
                    System.out.print(index + " ");
                }
            }
            System.out.println();
            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();

            if (answer == resultInt) {
                Engine.correct();
                indexGame++;
            } else {
                Engine.failEnd(answer, resultInt, playName);
                indexGame = Engine.NUMBER_OF_GAME + numberLoser;
            }
            if (indexGame == Engine.NUMBER_OF_GAME) {
                Engine.succesfulEnd(playName);
            }
        }
    }

}
