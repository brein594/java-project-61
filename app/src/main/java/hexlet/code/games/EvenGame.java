package hexlet.code.games;

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
        String answerGame;
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
    }
}

