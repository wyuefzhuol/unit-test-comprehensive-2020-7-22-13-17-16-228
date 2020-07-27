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
}
