package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class PrimeGame {
    public static void prime() {
        Engine.greeting();
        var playName = Cli.getByName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int[] primeNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
                             61, 67, 71, 73, 79, 83, 89, 97};
        String answer;
        var answerSimple = "no";
        int indexGame = 0;
        while (indexGame < Engine.numbersOfGames) {
            var numberRandom = (int) (Math.random() * 100) + 1;
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
                indexGame = Engine.numbersOfGames + 1;
            }
            if (indexGame == Engine.numbersOfGames) {
                Engine.succesfulEnd(playName);
            }
        }
    }

}
