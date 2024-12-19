package hexlet.code;


import java.util.Scanner;

public class Game {
    public static void greet() {
        var playName = Cli.getByName();
        int endGame = 4;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String question = "";
        int indexGame = 0;
        while (indexGame < 3) {
            var numberRandom = (int)(Math.random() * 100) +1;
            System.out.println("Question: " + numberRandom);
            System.out.println("Your answer:  ");
            Scanner scanner = new Scanner(System.in);
            question = scanner.nextLine();
            var evenNumber = numberRandom % 2 == 0 ? "yes" : "no";
            if (evenNumber.equals(question)) {
                System.out.println("Correct!");
                indexGame++;
            } else {
                System.out.println(question + " is wrong answer ;(. Correct answer was " + evenNumber);
                System.out.println("Let's try again, " + playName + "!");
                indexGame = endGame;
            }
            if (indexGame == 3) {
                System.out.println("Congratulations, " + playName + "!");
            }
        }
    }
    public static void even() {
        var playName = Cli.getByName();
        System.out.println("even");
    }
}
