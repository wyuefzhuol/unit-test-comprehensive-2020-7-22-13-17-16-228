package tw.eric.game;

import java.util.Scanner;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(int[] answer) {
        this.answer = answer;
    }

    public GuessNumber(GenerateAnswer generateAnswer) {
        this.answer = generateAnswer.generateAnswer();
    }

    public int[] inputGuess() {
        int[] guess = new int[4];
        Scanner sc = new Scanner(System.in);
        GuessValid gv = new GuessValid();
        do {
            System.out.println("Please input your guess number");
            for(int i = 0; i < guess.length; i++){
                guess[i] = sc.nextInt();
            }
            if (!gv.isGuessValid(guess)) {
                System.out.println("Not valid, please input again");
            }
        } while (!gv.isGuessValid(guess));
        return guess;
    }

    public String getGuessResult(int[] inputGuess) {
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < inputGuess.length; j++) {
                if (answer[i] == inputGuess[j] && i != j) {
                    countB++;
                }
                if (answer[i] == inputGuess[j] && i == j) {
                    countA++;
                }
            }
        }
        return ""+countA+"A"+countB+"B";
    }

    public boolean isGameWin(int[] guess) {
        System.out.println("Output: " + getGuessResult(guess));
        return getGuessResult(guess).equals("4A0B");
    }
}
