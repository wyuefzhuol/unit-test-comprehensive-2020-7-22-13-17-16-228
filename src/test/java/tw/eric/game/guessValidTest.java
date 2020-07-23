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
}
