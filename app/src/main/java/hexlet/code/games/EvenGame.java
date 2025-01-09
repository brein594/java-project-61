package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;
import hexlet.code.Cli;

public class EvenGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    private static final int NUMBER_OF_GAMES = 3;
    private static final int LENGTH_ARRAYS_ANSWER = 6;

    public static void even() {
        var playName = Cli.getByName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[] answerQuestion = new String[LENGTH_ARRAYS_ANSWER];
        String answerGame ;
        int numberGame = 0;
        var index = 0;
        while (numberGame < NUMBER_OF_GAMES) {
            var resultInt = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            answerGame = resultInt % 2 == 0 ? "yes" : "no";
            answerQuestion[index++] = Integer.toString(resultInt);
            answerQuestion[index++] = answerGame;
            numberGame++;
        }
        Engine.game(playName, answerQuestion);
 /*
        do {
            var resultInt = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            answerGame = resultInt % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + resultInt);
            System.out.print("Your answer:  ");
            Scanner scanner = new Scanner(System.in);
            answerUser = scanner.nextLine();
            numberGame++;
        } while (Engine.game(playName, answerGame, answerUser, numberGame));
*/

//версия 2
/*
        String[] result = new String[LENGTH_ARRAYS_ANSWER];
        var resultInt = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
        result[0] = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        result[1] = Integer.toString(resultInt);
        result[2] = resultInt % 2 == 0 ? "yes" : "no";
        return result;
        */

 /*
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

             */
    }
}

