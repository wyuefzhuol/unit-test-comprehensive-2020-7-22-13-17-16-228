package tw.eric.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class guessValidTest {
    @Test
    void should_return_true_when_guess_valid_given_1234() {
        //given
        GuessValid guessValid = new GuessValid();
        int[] inputGuess = {1,2,3,4};

        //when
        boolean isValid = guessValid.isGuessValid(inputGuess);

        //then
        assertEquals(true, isValid);
    }

    @Test
    void should_return_false_when_guess_valid_given_112314() {
        //given
        GuessValid guessValid = new GuessValid();
        int[] inputGuess = {1,12,3,14};

        //when
        boolean isValid = guessValid.isGuessValid(inputGuess);

        //then
        assertEquals(false, isValid);
    }

    @Test
    void should_return_false_when_guess_valid_given_12() {
        //given
        GuessValid guessValid = new GuessValid();
        int[] inputGuess = {1,2};

        //when
        boolean isValid = guessValid.isGuessValid(inputGuess);

        //then
        assertEquals(false, isValid);
    }

    @Test
    void should_return_false_when_guess_valid_given_1122() {
        //given
        GuessValid guessValid = new GuessValid();
        int[] inputGuess = {1,1,2,2};

        //when
        boolean isValid = guessValid.isGuessValid(inputGuess);

        //then
        assertEquals(false, isValid);
    }
}
