package tw.eric.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class generateAnswerTest {

    @Test
    void should_return_true_when_is_answer_valid_given_generate_answer() {
        //given
        GenerateAnswer generateAnswer = new GenerateAnswer();
        GuessAnswerValid guessAnswerValid = new GuessAnswerValid();

        //when
        boolean isValid = guessAnswerValid.isAnswerValid(generateAnswer.generateAnswer());

        //then
        assertTrue(isValid);
    }

    @Test
    void should_return_true_when_is_answer_length_valid_given_generate_answer() {
        //given
        GenerateAnswer generateAnswer = new GenerateAnswer();
        GuessAnswerValid guessAnswerValid = new GuessAnswerValid();

        //when
        boolean isValid = guessAnswerValid.isAnswerLengthValid(generateAnswer.generateAnswer());

        //then
        assertTrue(isValid);
    }
}
