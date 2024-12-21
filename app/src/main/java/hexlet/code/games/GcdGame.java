package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class GcdGame {
    public static void gcd() {
        var playName = Cli.getByName();
        System.out.println("Find the greatest common divisor of given numbers.");
        int answer;
        int indexGame = 0;
        while (indexGame < Engine.numbersOfGames) {
            var numberRandomA = (int) (Math.random() * 100) + 1;
            var numberRandomB = (int) (Math.random() * 100) + 1;
            int resultInt = findGcd(numberRandomA, numberRandomB);
            System.out.println("Question: " + numberRandomA + " " + numberRandomB);
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

    private static int findGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : findGcd(b, a % b);
    }

}
