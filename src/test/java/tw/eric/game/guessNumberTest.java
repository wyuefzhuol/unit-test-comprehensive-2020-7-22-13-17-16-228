package tw.eric.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class guessNumberTest {
    @Test
    void should_return_4A0B_when_guess_given_1234() {
        //given
        int[] answer = {1,2,3,4};
        int[] inputGuess = {1,2,3,4};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(generateAnswer.generateAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateAnswer);

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("4A0B",result);
    }

    @Test
    void should_return_0A0B_when_guess_given_5678() {
        //given
        int[] answer = {1,2,3,4};
        int[] inputGuess = {5,6,7,8};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(generateAnswer.generateAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateAnswer);

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("0A0B", result);
    }

    @Test
    void should_return_0A4B_when_guess_given_2341() {
        //given
        int[] answer = {1,2,3,4};
        int[] inputGuess = {2,3,4,1};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(generateAnswer.generateAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateAnswer);

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("0A4B", result);
    }

    @Test
    void should_return_2A2B_when_guess_given_1432() {
        //given
        int[] answer = {1,2,3,4};
        int[] inputGuess = {1,4,3,2};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(generateAnswer.generateAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateAnswer);

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("2A2B", result);
    }

    @Test
    void  should_return_1A1B_when_guess_given_1572() {
        //given
        int[] answer = {1,2,3,4};
        int[] inputGuess = {1,5,7,2};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(generateAnswer.generateAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateAnswer);

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("1A1B", result);
    }

    @Test
    void  should_return_0A2B_when_guess_given_5172() {
        //given
        int[] answer = {1,2,3,4};
        int[] inputGuess = {5,1,7,2};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(generateAnswer.generateAnswer()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(generateAnswer);

        //when
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("0A2B", result);
    }
}
