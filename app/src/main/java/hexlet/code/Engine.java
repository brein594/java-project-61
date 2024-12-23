package hexlet.code;

public class Engine {
    public static final int NUMBER_OF_GAMES = 3;

    public static void showWinMessage(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    public static void showFailMessage(String answer, String result, String name) {
        System.out.println(answer + " is wrong answer ;(. Correct answer was " + result);
        System.out.println("Let's try again, " + name + "!");
    }

    public static void showFailMessage(int answer, int result, String name) {
        System.out.println(answer + " is wrong answer ;(. Correct answer was " + result);
        System.out.println("Let's try again, " + name + "!");
    }

    public static void showCorrectMessage() {
        System.out.println("Correct!");
    }


}
