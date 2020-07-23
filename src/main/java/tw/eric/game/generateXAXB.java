package tw.eric.game;

public class generateXAXB {
    public String guess(int[] answer, int[] inputGuess) {
        boolean flag = false;
        for (int i = 0; i < inputGuess.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (inputGuess[i] == answer[j]) {
                    flag = true;
                    break;
                }
                if (i == inputGuess.length-1 && j == answer.length-1) {
                    return "0A0B";
                }
            }
            if (flag && inputGuess[i] != answer[i]) {
                return null;
            }
        }
        return "4A0B";
    }
}
