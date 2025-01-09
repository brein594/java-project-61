package hexlet.code;

import hexlet.code.games.GreetGame;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_COUNT = 3;
    private static final int LENGTH_ARRAYS_ANSWER = 3;

    public static boolean game(String description, String[][] answerGame) {
        var playName = GreetGame.play();
        System.out.println(description);
        Scanner scanner = new Scanner(System.in);
        var result = true;
        var index = 0;
        int numberGame = 0;
        String answerUser;
        while (numberGame < LENGTH_ARRAYS_ANSWER) {
            System.out.println("Question: " + answerGame[numberGame][0]);
            System.out.print("Your answer:  ");
            answerUser = scanner.nextLine();

            if (answerUser.equals(answerGame[numberGame][1])) {
                System.out.println("Correct!");
                index++;
                result = true;
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was " + answerGame[numberGame][1]);
                System.out.println("Let's try again, " + playName + "!");
                result = false;
                break;
            }
            numberGame++;
            if (numberGame == LENGTH_ARRAYS_ANSWER) {
                System.out.println("Congratulations, " + playName + "!");
            }
        }
        scanner.close();
        return result;
    }

    public static int getRoundsCount() {
        return ROUNDS_COUNT;
    }

    public static int  getLengthArraysAnswer() {
        return LENGTH_ARRAYS_ANSWER;
    }
}
