package tw.eric.game;

public class Main {

    public static void main(String[] args) {
        GenerateRandomAnswer generateRandomAnswer = new GenerateRandomAnswer();
        int[] answer = generateRandomAnswer.generateAnswer();

        GuessNumber GuessNumber = new GuessNumber(answer);

        for (int roundNumber = 0; roundNumber < 6; roundNumber++) {
            int[] guess = GuessNumber.inputGuess();
            if (GuessNumber.isGameWin(guess)) {
                System.out.println("You win!!");
            }
            if (roundNumber == 5) {
                System.out.println("You failed!!");
            }
        }
    }
}
