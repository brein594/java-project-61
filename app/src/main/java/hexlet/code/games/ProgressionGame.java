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
        while (indexGame < Engine.numbersOfGames) {
            var numberRandomA1 = (int) (Math.random() * 100) + 1;
            var stepProgress = (int) (Math.random() * 100) + 1;
            var numberRandomPosition = (int) (Math.random() * 10);
            int[] arifProgress = new int[10];
            arifProgress[0] = numberRandomA1;
            for (int i = 1; i < 10; i++) {
                arifProgress[i] = arifProgress[0] + i * stepProgress;
            }
            int resultInt = arifProgress[numberRandomPosition];
            System.out.print("Question: ");
            for (int index : Arrays.copyOfRange(arifProgress, 0, numberRandomPosition)) {
                System.out.print(index + " ");
            }
            System.out.print(".." + " ");
            if (numberRandomPosition < arifProgress.length - 1) {
                for (int index : Arrays.copyOfRange(arifProgress, numberRandomPosition + 1, arifProgress.length - 1)) {
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
                indexGame = Engine.numbersOfGames + 1;
            }
            if (indexGame == Engine.numbersOfGames) {
                Engine.succesfulEnd(playName);
            }
        }
    }

}
