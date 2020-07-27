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
        do {
            System.out.println("Please input your guess number");
            for(int i = 0; i < guess.length; i++){
                guess[i] = sc.nextInt();
            }
            if (!isGuessValid(guess)) {
                System.out.println("Not valid, please input again");
            }
        } while (!isGuessValid(guess));
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

    public boolean isGuessValid(int[] inputGuess) {
        if (inputGuess.length != 4) {
            return false;
        }
        int temp = 0;
        for (int i = 0; i < inputGuess.length - 1; i++) {
            temp = inputGuess[i];
            for (int j = i + 1; j < inputGuess.length; j++) {
                if (temp == inputGuess[j]) {
                    return false;
                }
            }
        }
        for (int i = 0; i < inputGuess.length; i++) {
            if (inputGuess[i] < 0 || inputGuess[i] > 9) {
                return false;
            }
        }
        return true;
    }
}
