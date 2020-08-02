package tw.eric.game;

public class GuessAnswerValid {
    public boolean isAnswerValid(int[] generateAnswer) {
        return isAnswerLengthValid(generateAnswer.length);
    }

    public boolean isAnswerLengthValid(int answerLength) {
        return answerLength == 4;
    }

    public boolean isAnswerNumberValid(int[] generateAnswer) {
        return false;
    }
}
