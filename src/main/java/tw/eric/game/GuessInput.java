package tw.eric.game;

import java.util.Scanner;

public class GuessInput {

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
}
