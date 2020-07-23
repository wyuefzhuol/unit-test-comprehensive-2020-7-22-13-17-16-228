package tw.eric.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class generateXAXBTest {
    @Test
    void should_return_4A0B_when_guess_given_1234() {
        //given
        generateXAXB generatexAxB = new generateXAXB();
        int[] answer = {1, 2, 3, 4};
        int[] inputGuess = {1,2,3,4};

        //when
        String result = generatexAxB.guess(answer, inputGuess);

        //then
        assertEquals("4A0B",result);
    }

    @Test
    void should_return_0A0B_when_guess_given_5678() {
        //given
        generateXAXB generatexAxB = new generateXAXB();
        int[] answer = {1,2,3,4};
        int[] inputGuess = {5,6,7,8};

        //when
        String result = generatexAxB.guess(answer, inputGuess);

        //then
        assertEquals("0A0B", result);
    }
}
