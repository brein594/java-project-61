package hexlet.code;

public class Engine {
    public static final int NUMBER_OF_GAME = 3;

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
