package tw.eric.game;

public class GuessAnswerValid {
    public boolean isAnswerValid(int[] generateAnswer) {
        if (!isAnswerNumberValid(generateAnswer)) {
            return false;
        }
        return isAnswerLengthValid(generateAnswer.length);
    }

    public boolean isAnswerLengthValid(int answerLength) {
        return answerLength == 4;
    }

    public boolean isAnswerNumberValid(int[] generateAnswer) {
        for (int answer : generateAnswer) {
            if (answer < 0 || answer > 9) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnswerRepetition(int[] generateAnswer) {
        return false;
    }
}
