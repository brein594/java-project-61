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
        final var numberLoser = 1;
        while (indexGame < Engine.NUMBER_OF_GAMES) {
            final int rangeMax = 100;
            final int rangeFirst = 1;
            var numberRandom = (int) (Math.random() * rangeMax) + rangeFirst;
            System.out.println("Question: " + numberRandom);
            System.out.print("Your answer:  ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            var evenNumber = numberRandom % 2 == 0 ? "yes" : "no";
            if (evenNumber.equals(answer)) {
                Engine.showCorrectMessage();
                indexGame++;
            } else {
                Engine.showFailMessage(answer, evenNumber, playName);
                indexGame = Engine.NUMBER_OF_GAMES + numberLoser;
            }
            if (indexGame == Engine.NUMBER_OF_GAMES) {
                Engine.showWinMessage(playName);
            }
        }
    }
}
