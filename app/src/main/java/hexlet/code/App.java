package hexlet.code;

import java.util.Scanner;


import hexlet.code.games.GreetGame;


public class App {
    private static final int GAME_GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;


    public static void main(String[] args) {
        int game = 1;
        //while (play != 0) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        game = scanner.nextInt();
        System.out.println("Your choice: " + game);
        //scanner.close();
        switch (game) {
            case GAME_PRIME:
                Engine.game(GAME_PRIME);
                break;
            case GAME_PROGRESSION:
                Engine.game(GAME_PROGRESSION);
                break;
            case GAME_GCD:
                Engine.game(GAME_GCD);
                break;
            case GAME_CALC:
                Engine.game(GAME_CALC);
                break;
            case GAME_EVEN:
                Engine.game(GAME_EVEN);
                break;
            case GAME_GREET:
                GreetGame.greet();
                break;
            default:
                break;
        }
        //}
    }
}
