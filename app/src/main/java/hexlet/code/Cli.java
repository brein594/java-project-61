package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getByName() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
        //scanner.close();
    }
}
