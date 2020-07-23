package tw.eric.game;

public class GenerateRandomAnswer implements GenerateAnswer {
    @Override
    public int[] generateAnswer() {
        int[] result = new int[4];
        int count = 0;
        while (count < 4) {
            int num = (int) (Math.random() * 9);
            boolean flag = true;
            for (int j = 0; j < 4; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = num;
                count++;
            }
        }
        return result;
    }

    public boolean isGuessValid(int[] answer) {
        if (answer.length != 4) {
            return false;
        }
        int temp = 0;
        for (int i = 0; i < answer.length - 1; i++) {
            temp = answer[i];
            for (int j = i + 1; j < answer.length; j++) {
                if (temp == answer[j]) {
                    return false;
                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] < 0 || answer[i] > 9) {
                return false;
            }
        }
        return true;
    }
}
