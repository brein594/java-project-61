package hexlet.code;

import java.util.Scanner;

public class Engine {
    //private static final int NUMBER_OF_GAMES = 3;


    public static boolean game(String playName, String[] answerGame) {
        var result = true;
        var index = 0;
        int numberGame = 0;
        int numberOfGames = answerGame.length / 2;
        String answerUser;
        Scanner scanner = new Scanner(System.in);
        while (numberGame < numberOfGames) {
            numberGame++;
            System.out.println("Question: " + answerGame[index++]);
            System.out.print("Your answer:  ");
            answerUser = scanner.nextLine();

            if (answerUser.equals(answerGame[index])) {
                System.out.println("Correct!");
                index++;
                result = true;
            } else {
                System.out.println(answerUser + " is wrong answer ;(. Correct answer was " + answerGame[index]);
                System.out.println("Let's try again, " + playName + "!");
                result = false;
                break;
            }
            if (numberGame == numberOfGames) {
                System.out.println("Congratulations, " + playName + "!");
                result = true;
                break;
            }
        }
        scanner.close();
        return result;
    }
}
