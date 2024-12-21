package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class PrimeGame {
    public static void prime() {
        var playName = Cli.getByName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int[] primeNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
                             61, 67, 71, 73, 79, 83, 89, 97};
        String answer;
        var answerSimple = "no";
        int indexGame = 0;
        final var NUMBER_LOSER = 1;
        while (indexGame < Engine.NUMBER_OF_GAME) {
            final var RANGE_MAX = 100;
            final var RANGE_FIRST = 1;
            var numberRandom = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            for (int index : primeNumber) {
                if (index == numberRandom) {
                    answerSimple = "yes";
                    break;
                }
            }
            System.out.println("Question: " + numberRandom);
            System.out.print("Your answer:  ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (answerSimple.equals(answer)) {
                Engine.correct();
                indexGame++;
            } else {
                Engine.failEnd(answer, answerSimple, playName);
                indexGame = Engine.NUMBER_OF_GAME + NUMBER_LOSER;
            }
            if (indexGame == Engine.NUMBER_OF_GAME) {
                Engine.succesfulEnd(playName);
                System.out.println("Let's try again, " + playName + "!");
            }
        }
    }

}
