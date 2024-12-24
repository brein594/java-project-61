package hexlet.code.games;

public class ProgressionGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    private static final int RANGE_POSITION = 10;
    private static final int LENGTH_ARRAYS_ANSWER = 3;

    public static String[] progression() {
        String[] result = new String[LENGTH_ARRAYS_ANSWER];
        var numberRandomA1 = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
        var stepProgress = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
        var numberRandomPosition = (int) (Math.random() * RANGE_POSITION);
        int[] arifProgress = new int[RANGE_POSITION];
        arifProgress[0] = numberRandomA1;
        for (int i = 1; i < RANGE_POSITION; i++) {
            arifProgress[i] = arifProgress[0] + i * stepProgress;
        }
        int resultInt = arifProgress[numberRandomPosition];

        String[] resultString = new String[RANGE_POSITION];
        for (int i = 0; i < RANGE_POSITION; i++) {
            if (i != numberRandomPosition) {
                resultString[i] = Integer.toString(arifProgress[i]);
            } else {
                resultString[i] = "..";
            }
        }

        result[0] = "What number is missing in the progression?";
        result[1] = String.join(" ", resultString);
        result[2] = Integer.toString(resultInt);
        return result;
        /*
        var playName = Cli.getByName();
        System.out.println("What number is missing in the progression?");
        int answer;
        int indexGame = 0;
        final var numberLoser = 1;
        while (indexGame < Engine.NUMBER_OF_GAMES) {
            final int rangeMax = 100;
            final int rangeMaxPosition = 10;
            final int rangeFirst = 1;
            final int stepArray = 1;
            final int firstElement = 0;
            var numberRandomA1 = (int) (Math.random() * rangeMax) + rangeFirst;
            var stepProgress = (int) (Math.random() * rangeMax) + rangeFirst;
            var numberRandomPosition = (int) (Math.random() * rangeMaxPosition);
            int[] arifProgress = new int[rangeMaxPosition];
            arifProgress[0] = numberRandomA1;
            for (int i = 1; i < rangeMaxPosition; i++) {
                arifProgress[i] = arifProgress[0] + i * stepProgress;
            }
            int resultInt = arifProgress[numberRandomPosition];
            System.out.print("Question: ");
            for (int index : Arrays.copyOfRange(arifProgress, firstElement, numberRandomPosition)) {
                System.out.print(index + " ");
            }
            System.out.print(".." + " ");
            if (numberRandomPosition < arifProgress.length - stepArray) {
                for (int index : Arrays.copyOfRange(arifProgress, numberRandomPosition +  stepArray,
                        arifProgress.length -  stepArray)) {
                    System.out.print(index + " ");
                }
            }
            System.out.println();
            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();

            if (answer == resultInt) {
                Engine.showCorrectMessage();
                indexGame++;
            } else {
                Engine.showFailMessage(answer, resultInt, playName);
                indexGame = Engine.NUMBER_OF_GAMES + numberLoser;
            }
            if (indexGame == Engine.NUMBER_OF_GAMES) {
                Engine.showWinMessage(playName);
            }
        }

         */
    }

}
