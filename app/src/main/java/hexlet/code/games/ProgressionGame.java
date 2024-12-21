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
        final var NUMBER_LOSER = 1;
        while (indexGame < Engine.NUMBER_OF_GAME) {
            final var RANGE_MAX = 100;
            final var RANGE_MAX_POSITION = 10;
            final var RANGE_FIRST = 1;
            final var STEP_ARRAYS = 1;
            final var FIRST_ELEMENT = 0;
            var numberRandomA1 = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            var stepProgress = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            var numberRandomPosition = (int) (Math.random() * RANGE_MAX_POSITION);
            int[] arifProgress = new int[10];
            arifProgress[0] = numberRandomA1;
            for (int i = 1; i < 10; i++) {
                arifProgress[i] = arifProgress[0] + i * stepProgress;
            }
            int resultInt = arifProgress[numberRandomPosition];
            System.out.print("Question: ");
            for (int index : Arrays.copyOfRange(arifProgress, FIRST_ELEMENT, numberRandomPosition)) {
                System.out.print(index + " ");
            }
            System.out.print(".." + " ");
            if (numberRandomPosition < arifProgress.length - STEP_ARRAYS) {
                for (int index : Arrays.copyOfRange(arifProgress, numberRandomPosition +  STEP_ARRAYS,
                        arifProgress.length -  STEP_ARRAYS)) {
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
                indexGame = Engine.NUMBER_OF_GAME + NUMBER_LOSER;
            }
            if (indexGame == Engine.NUMBER_OF_GAME) {
                Engine.succesfulEnd(playName);
            }
        }
    }

}
