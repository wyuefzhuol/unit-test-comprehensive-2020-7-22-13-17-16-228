package tw.eric.game;

import java.util.HashSet;
import java.util.Set;

public class GuessNumberValid {
    public boolean isGuessValid(int[] inputGuess) {
        if (!isLengthValid(inputGuess.length)) {
            return false;
        }
        if (isRepetition(inputGuess)) {
            return false;
        }
        return isNumberValid(inputGuess);
    }

    public boolean isNumberValid(int[] inputGuess) {
        for (int guess : inputGuess) {
            if (guess < 0 || guess > 9) {
                return false;
            }
        }
        return true;
    }

    public boolean isRepetition(int[] inputGuess) {
        Set<Integer> guessSet = new HashSet<Integer>();
        for(Integer guessNumber : inputGuess){
            guessSet.add(guessNumber);
        }
        return guessSet.size() != inputGuess.length;
    }

    public boolean isLengthValid(int guessLength) {
        return guessLength == 4;
    }
}
