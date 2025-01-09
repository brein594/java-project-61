package hexlet.code.games;

import java.util.Scanner;

public class GreetGame {

    public static String play() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
