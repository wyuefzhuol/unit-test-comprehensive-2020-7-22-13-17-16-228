package tw.eric.game;

public class GuessValid {
    public boolean isGuessValid(int[] inputGuess) {
        for (int i = 0; i < inputGuess.length; i++) {
            if (inputGuess[i] < 0 || inputGuess[i] > 9) {
                return false; 
            }
        }
        return true;
    }
}
