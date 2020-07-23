package tw.eric.game;

public class generateXAXB {
    private int[] answer;

    public generateXAXB(GenerateAnswer generateAnswer) {
        this.answer = generateAnswer.generateAnswer();
    }

    public String guess(int[] inputGuess) {
        if (is4A0B(answer, inputGuess)) {
            return "4A0B";
        }
        if (is0A0B(answer, inputGuess)) {
            return "0A0B";
        }
        return null;
    }

    public boolean is4A0B(int[] answer, int[] inputGuess) {
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != inputGuess[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean is0A0B(int[] answer, int[] inputGuess) {
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < inputGuess.length; j++) {
                if (answer[i] == inputGuess[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
