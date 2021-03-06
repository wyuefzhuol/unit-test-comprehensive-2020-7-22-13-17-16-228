package tw.eric.game;

public class Main {
    final public static String winMessage = "You win!!";
    final public static String failedMessage = "You failes!!";

    public static void main(String[] args) {
        GenerateAnswer generateAnswer = new GenerateAnswer();

        GuessNumber guessNumber = new GuessNumber(generateAnswer);
        GuessInput guessInput = new GuessInput();

        final int firstRound = 1;
        final int lastRound = 6;
        for (int roundNumber = firstRound; roundNumber <= lastRound; roundNumber++) {
            int[] guess = guessInput.inputGuess();
            if (guessNumber.isGameWin(guess)) {
                System.out.println(winMessage);
            }
            if (roundNumber == lastRound) {
                System.out.println(failedMessage);
            }
        }
    }
}
