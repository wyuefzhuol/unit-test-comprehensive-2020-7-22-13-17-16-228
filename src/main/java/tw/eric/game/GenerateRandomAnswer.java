package tw.eric.game;

public class GenerateRandomAnswer implements GenerateAnswer {
    @Override
    public int[] generateAnswer() {
        int[] answer = {1,2,3,4};
        return answer;
    }

    public boolean isGuessValid(int[] answer) {
        if (answer.length != 4) {
            return false;
        }
        int sum = 0;
        int n = answer.length;
        for(int i : answer) {
            sum += i;
        }
        if (sum != n*(n+1)/2) {
            return false;
        }
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] < 0 || answer[i] > 9) {
                return false;
            }
        }
        return true;
    }
}
