package tw.eric.game;

public class GenerateRandomAnswer implements GenerateAnswer {
    @Override
    public int[] generateAnswer() {
        int[] answer = {1,2,3,4};
        return answer;
    }

    public boolean isGuessValid(int[] answer) {
        return false;
    }
}
