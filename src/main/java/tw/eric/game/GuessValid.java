package tw.eric.game;

public class GuessValid {
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
