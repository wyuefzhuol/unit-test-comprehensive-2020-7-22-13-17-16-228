package tw.eric.game;

import java.util.HashSet;
import java.util.Set;

public class GuessAnswerValid {
    public boolean isAnswerValid(int[] generateAnswer) {
        if (!isAnswerNumberValid(generateAnswer)) {
            return false;
        }
        if (isAnswerRepetition(generateAnswer)) {
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
        Set<Integer> answerSet = new HashSet<Integer>();
        for(Integer answer : generateAnswer){
            answerSet.add(answer);
        }
        return answerSet.size() != generateAnswer.length;
    }
}
