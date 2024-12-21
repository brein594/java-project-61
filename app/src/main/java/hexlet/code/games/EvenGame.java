package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class EvenGame {
    public static void even() {
        var playName = Cli.getByName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String answer;
        int indexGame = 0;
        final var NUMBER_LOSER = 1;
        while (indexGame < Engine.NUMBER_OF_GAME) {
            final var RANGE_MAX = 100;
            final var RANGE_FIRST = 1;
            var numberRandom = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            System.out.println("Question: " + numberRandom);
            System.out.print("Your answer:  ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            var evenNumber = numberRandom % 2 == 0 ? "yes" : "no";
            if (evenNumber.equals(answer)) {
                Engine.correct();
                indexGame++;
            } else {
                Engine.failEnd(answer, evenNumber, playName);
                indexGame = Engine.NUMBER_OF_GAME + NUMBER_LOSER;
            }
            if (indexGame == Engine.NUMBER_OF_GAME) {
                Engine.succesfulEnd(playName);
            }
        }
    }
}
