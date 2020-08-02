package tw.eric.game;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GuessNumber {
    private int[] answer;

    public GuessNumber(GenerateAnswer generateAnswer) {
        this.answer = generateAnswer.generateAnswer();
    }

    public int[] inputGuess() {
        final String inputMessage = "Please input your guess number";
        final String notValidMessage = "Not valid, please input again";
        int[] guess = new int[4];
        GuessNumberValid guessNumberValid = new GuessNumberValid();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(inputMessage);
            for(int i = 0; i < guess.length; i++){
                guess[i] = sc.nextInt();
            }
            if (!guessNumberValid.isGuessValid(guess)) {
                System.out.println(notValidMessage);
            }
        } while (!guessNumberValid.isGuessValid(guess));
        return guess;
    }

    public String getGuessResult(int[] inputGuess) {
        int countOfCorrectNumberAndCorrectPosition = 0;
        int countOfCorrectNumberAndWrongPosition = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < inputGuess.length; j++) {
                if (answer[i] == inputGuess[j] && i != j) {
                    countOfCorrectNumberAndWrongPosition++;
                }
                if (answer[i] == inputGuess[j] && i == j) {
                    countOfCorrectNumberAndCorrectPosition++;
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
}
