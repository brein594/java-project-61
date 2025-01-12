package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;

    public static void play() {
        var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] answerQuestion = new String[Engine.getLengthArraysAnswer()][2];
        String answerGame;
        for (int numberGame = 0; numberGame < Engine.getRoundsCount(); numberGame++) {
            var resultInt = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            answerGame = resultInt % 2 == 0 ? "yes" : "no";
            answerQuestion[numberGame][0] = Integer.toString(resultInt);
            answerQuestion[numberGame][1] = answerGame;
        }
        Engine.game(description, answerQuestion);
    }
}
