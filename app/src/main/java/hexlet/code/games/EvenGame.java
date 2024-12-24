package hexlet.code.games;


public class EvenGame {
    private static final int RANGE_MAX = 100;
    private static final int RANGE_FIRST = 1;
    //public String answer;


    public static String[] even() {
        String[] result = new String[3];
        var resultInt = (int) (Math.random() * RANGE_MAX) + RANGE_FIRST;
        result[0] = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        result[1] = Integer.toString(resultInt);
        result[2] = resultInt % 2 == 0 ? "yes" : "no";
        return result;
 /*
          System.out.println("Question: " + numberRandom);
           System.out.print("Your answer:  ");
           Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
           var evenNumber = numberRandom % 2 == 0 ? "yes" : "no";

            if (evenNumber.equals(answer)) {
                Engine.showCorrectMessage();
                indexGame++;
            } else {
                Engine.showFailMessage(answer, evenNumber, playName);
                indexGame = Engine.NUMBER_OF_GAMES + numberLoser;
            }
            if (indexGame == Engine.NUMBER_OF_GAMES) {
                Engine.showWinMessage(playName);
            }

             */
    }
}

