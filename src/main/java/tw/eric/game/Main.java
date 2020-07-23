package tw.eric.game;

public class Main {

    public static void main(String[] args) {
        GenerateRandomAnswer generateRandomAnswer = new GenerateRandomAnswer();
        int[] answer = generateRandomAnswer.generateAnswer();

        generateXAXB generateXAXB = new generateXAXB(answer);
        int[] guess = new int[4];

        for (int i = 0; i < 6; i++) {
            guess = generateXAXB.inputGuess();
            System.out.println("Output: " + generateXAXB.guess(guess));
            if (generateXAXB.guess(guess).equals("4A0B")) {
                System.out.println("You win!!");
                break;
            }
            if (i == 5) {
                System.out.println("You failed!!");
            }
        }
    }
}
