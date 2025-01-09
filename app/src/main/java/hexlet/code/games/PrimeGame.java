package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;
import hexlet.code.Cli;

public class PrimeGame {
    private static final int[] PRIME_NUMBER = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
        53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    private static final int NUMBER_OF_GAMES = 3;
    private static final int LENGTH_ARRAYS_ANSWER = 6;


    public static void prime() {
        var playName = Cli.getByName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[] answerQuestion = new String[LENGTH_ARRAYS_ANSWER];
        String answerGame ;
        int numberGame = 0;
        var index = 0;

        while (numberGame < NUMBER_OF_GAMES) {
            answerGame = "no";
            var numberRandom = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
            for (int simple : PRIME_NUMBER) {
                if (simple == numberRandom) {
                    answerGame = "yes";
                    break;
                }
            }

            answerQuestion[index++] =  Integer.toString(numberRandom);
            answerQuestion[index++] =  answerGame;
            numberGame++;
        }
        Engine.game(playName, answerQuestion);
       // } while (Engine.game(playName, answerGame, answerUser, numberGame));



        //версия 2
    /*
    public static String[] prime() {
        String[] result = new String[LENGTH_ARRAYS_ANSWER];
        String answerSimple = "no";
        var numberRandom = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
        for (int simple : PRIME_NUMBER) {
            if (simple == numberRandom) {
                answerSimple = "yes";
                break;
            }
        }
        result[0] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        result[1] = Integer.toString(numberRandom);
        result[2] = answerSimple;
        return result;
*/
        //версия 1
        /*
        var playName = Cli.getByName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int[] primeNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
                61, 67, 71, 73, 79, 83, 89, 97};
        String answer;
        String answerSimple = "no";
        int indexGame = 0;
        final int numberLoser = 1;
        while (indexGame < Engine.NUMBER_OF_GAMES) {
            final int rangeMax = 100;
            final int rangeFirst = 1;
            var numberRandom = (int) (Math.random() * rangeMax) + rangeFirst;
            for (int i = 0; i < primeNumber.length; i++) {
               if (primeNumber[i] == numberRandom) {
                    answerSimple = "yes";
                    break;
                }
            }
            System.out.println("Question: " + numberRandom);
            System.out.print("Your answer:  ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (answerSimple.equals(answer)) {
                Engine.showCorrectMessage();
                answerSimple = "no";
                indexGame++;
            } else {
                Engine.showFailMessage(answer, answerSimple, playName);
                indexGame = Engine.NUMBER_OF_GAMES + numberLoser;
            }
            if (indexGame == Engine.NUMBER_OF_GAMES) {
                Engine.showWinMessage(playName);
            }
        }

         */
    }

}
