package hexlet.code;

public class Engine {
    public static int numbersOfGames = 3;

    public static void succesfulEnd(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    public static void failEnd(String answer, String result, String name) {
        System.out.println(answer + " is wrong answer ;(. Correct answer was " + result);
        System.out.println("Let's try again, " + name + "!");
    }

    public static void failEnd(int answer, int result, String name) {
        System.out.println(answer + " is wrong answer ;(. Correct answer was " + result);
        System.out.println("Let's try again, " + name + "!");
    }

    public static void correct() {
        System.out.println("Correct!");
    }
}
