package tw.eric.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class guessValidTest {
    @Test
    void should_return_true_when_guess_valid_given_1234() {
        //given
        GuessNumberValid guessNumberValid = new GuessNumberValid();
        int[] inputGuess = {1, 2, 3, 4};

        //when
        boolean isValid = guessNumberValid.isGuessValid(inputGuess);

        //then
        assertTrue(isValid);
    }

    @Test
    void should_return_false_when_is_number_valid_given_112314() {
        //given
        GuessNumberValid guessNumberValid = new GuessNumberValid();
        int[] inputGuess = {1, 12, 3, 14};

        //when
        boolean isNumberValid = guessNumberValid.isNumberValid(inputGuess);

        //then
        assertFalse(isNumberValid);
    }

    @Test
    void should_return_false_when_is_length_valid_given_12() {
        //given
        GuessNumberValid guessNumberValid = new GuessNumberValid();
        int[] inputGuess = {1, 2};

        //when
        boolean isLengthValid = guessNumberValid.isLengthValid(inputGuess.length);

        //then
        assertFalse(isLengthValid);
    }

    @Test
    void should_return_false_when_is_repetition_given_1122() {
        //given
        GuessNumberValid guessNumberValid = new GuessNumberValid();
        int[] inputGuess = {1, 1, 2, 2};

        //when
        boolean isRepetition = guessNumberValid.isRepetition(inputGuess);

        //then
        assertTrue(isRepetition);
    }
}
