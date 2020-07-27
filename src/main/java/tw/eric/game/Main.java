package tw.eric.game;

public class Main {

    public static void main(String[] args) {
        GenerateRandomAnswer generateRandomAnswer = new GenerateRandomAnswer();
        int[] answer = generateRandomAnswer.generateAnswer();

        GuessNumber GuessNumber = new GuessNumber(answer);
        int[] guess = new int[4];

        for (int i = 0; i < 6; i++) {
            guess = GuessNumber.inputGuess();
            System.out.println("Output: " + GuessNumber.guess(guess));
            if (GuessNumber.guess(guess).equals("4A0B")) {
                System.out.println("You win!!");
                break;
            }
            if (i == 5) {
                System.out.println("You failed!!");
            }
        }
    }
}
