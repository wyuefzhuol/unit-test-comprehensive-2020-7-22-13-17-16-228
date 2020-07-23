package tw.eric.game;

public class generateXAXB {
    private int[] answer;

    public generateXAXB(GenerateAnswer generateAnswer) {
        this.answer = generateAnswer.generateAnswer();
    }

    public String guess(int[] inputGuess) {
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
}
