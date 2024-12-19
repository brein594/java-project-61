package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void greet() {
        //System.out.println("Welcome to the Brain Games!");
        Engine.greeting();
        Cli.getByName();
    }
    public static void even() {
        Engine.greeting();
        var playName = Cli.getByName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String answer = "";
        int indexGame = 0;
        while (indexGame < Engine.numbersOfGames ) {
            var numberRandom = (int)(Math.random() * 100) +1;
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
                indexGame = Engine.numbersOfGames + 1;
            }
            if (indexGame == Engine.numbersOfGames) {
                Engine.succesfulEnd(playName);
            }
        }
    }
    public static void calc() {
        Engine.greeting();
        var playName = Cli.getByName();
        System.out.println("What is the result of the expression?");
        int answer;
        int indexGame = 0;
        while (indexGame < Engine.numbersOfGames) {
            var numberRandomA = (int)(Math.random() * 100) +1;
            var numberRandomB = (int)(Math.random() * 100) +1;
            Random random = new Random();
            int numberRandomOperation = random.nextInt(3);
            int resultInt = 0;
            String resultString = "";
            switch (numberRandomOperation) {
                case (0):
                    resultInt = numberRandomA + numberRandomB;
                    resultString = "+";
                    break;
                case (1):
                    resultInt = numberRandomA - numberRandomB;
                    resultString = "-";
                    break;
                case (2):
                    resultInt = numberRandomA * numberRandomB;
                    resultString = "*";
                    break;
                default:
                    break;
            }
            System.out.println("Question: " + numberRandomA + " " + resultString + " " + numberRandomB);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();
            if (answer == resultInt) {
                Engine.correct();
                indexGame++;
            } else {
                Engine.failEnd(answer, resultInt, playName);
                //System.out.println(question + " is wrong answer ;(. Correct answer was " + resultInt);
                //System.out.println("Let's try again, " + playName + "!");
                indexGame = Engine.numbersOfGames + 1;
            }
            if (indexGame == Engine.numbersOfGames) {
                Engine.succesfulEnd(playName);
            }
        }
    }

    public static void gcd() {
        Engine.greeting();
        var playName = Cli.getByName();
        System.out.println("Find the greatest common divisor of given numbers.");
        int answer;
        int indexGame = 0;
        while (indexGame < Engine.numbersOfGames) {
            var numberRandomA = (int)(Math.random() * 100) +1;
            var numberRandomB = (int)(Math.random() * 100) +1;
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
