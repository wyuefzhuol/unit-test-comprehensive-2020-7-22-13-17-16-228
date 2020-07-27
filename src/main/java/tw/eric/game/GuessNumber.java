package tw.eric.game;

import java.util.Scanner;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(GenerateAnswer generateAnswer) {
        this.answer = generateAnswer.generateAnswer();
    }

    public int[] inputGuess() {
        final String inputMessage = "Please input your guess number";
        final String notValidMessage = "Not valid, please input again";
        int[] guess = new int[4];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(inputMessage);
            for(int i = 0; i < guess.length; i++){
                guess[i] = sc.nextInt();
            }
            if (!isGuessValid(guess)) {
                System.out.println(notValidMessage);
            }
        } while (!isGuessValid(guess));
        return guess;
    }

    public String getGuessResult(int[] inputGuess) {
        int countOfCorrectNumberAndCorrectPosition = 0;
        int countOfCorrectNumberAndWrongPosition = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < inputGuess.length; j++) {
                if (answer[i] == inputGuess[j] && i != j) {
                    countOfCorrectNumberAndCorrectPosition++;
                }
                if (answer[i] == inputGuess[j] && i == j) {
                    countOfCorrectNumberAndWrongPosition++;
                }
            }
        }
        return ""+countOfCorrectNumberAndCorrectPosition+"A"+countOfCorrectNumberAndWrongPosition+"B";
    }

    public boolean isGameWin(int[] guess) {
        final String winResult = "4A0B";
        System.out.println("Output: " + getGuessResult(guess));
        return getGuessResult(guess).equals(winResult);
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
