package tw.eric.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class generateAnswerTest {

    @Test
    void should_return_true_when_answer_valid_given_generate_answer() {
        //given
        GenerateAnswer generateAnswer = new GenerateAnswer();
        GuessAnswerValid guessAnswerValid = new GuessAnswerValid();

        //when
        boolean isValid = guessAnswerValid.isGuessValid(generateAnswer.generateAnswer());

        //then
        assertTrue(isValid);
    }
}
