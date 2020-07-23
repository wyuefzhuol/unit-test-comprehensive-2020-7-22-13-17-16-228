package tw.eric.game;

public class generateXAXB {
    public String guess(int[] answer, int[] inputGuess) {
        for (int i = 0; i < inputGuess.length; i++) {
            if (inputGuess[i] != answer[i]) {
                return null;
            }
        }
        return "4A0B";
    }
}
