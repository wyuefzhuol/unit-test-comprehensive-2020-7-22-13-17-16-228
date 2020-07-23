package tw.eric.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class generateAnswerTest {
    @Test
    void should_return_true_when_answer_valid_given_random_answer() {
        //given
        GenerateRandomAnswer generateRandomValid = new GenerateRandomAnswer();
        int[] answer = generateRandomValid.generateAnswer();

        //when
        boolean isValid = generateRandomValid.isGuessValid(answer);

        //then
        assertEquals(true, isValid);
    }
}
