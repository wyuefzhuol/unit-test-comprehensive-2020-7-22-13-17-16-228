package tw.eric.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class guessValidTest {
    @Test
    void should_return_true_when_guess_valid_given_1234() {
        //given
        int[] answer = {1,2,3,4};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(generateAnswer.generateAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateAnswer);
        int[] inputGuess = {1,2,3,4};

        //when
        boolean isValid = guessNumber.isGuessValid(inputGuess);

        //then
        assertTrue(isValid);
    }

    @Test
    void should_return_false_when_is_number_valid_given_112314() {
        //given
        int[] answer = {1,2,3,4};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(generateAnswer.generateAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateAnswer);
        int[] inputGuess = {1,12,3,14};

        //when
        boolean isNumberValid = guessNumber.isNumberValid(inputGuess);

        //then
        assertFalse(isNumberValid);
    }

    @Test
    void should_return_false_when_is_length_valid_given_12() {
        //given
        int[] answer = {1,2,3,4};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(generateAnswer.generateAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateAnswer);
        int[] inputGuess = {1,2};

        //when
        boolean isLengthValid = guessNumber.isLengthValid(inputGuess.length);

        //then
        assertFalse(isLengthValid);
    }

    @Test
    void should_return_false_when_is_repetition_given_1122() {
        //given
        int[] answer = {1,2,3,4};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(generateAnswer.generateAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateAnswer);
        int[] inputGuess = {1,1,2,2};

        //when
        boolean isRepetition = guessNumber.isRepetition(inputGuess);

        //then
        assertTrue(isRepetition);
    }
}
