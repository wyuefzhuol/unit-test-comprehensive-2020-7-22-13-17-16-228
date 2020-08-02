package tw.eric.game;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class generateAnswerTest {

    @Test
    void should_return_answer_1234_when_generate_answer_given_random_number_1234() {
        //given
        int[] randomNumber = {1,2,3,4};
        GenerateAnswer generateAnswer = mock(GenerateAnswer.class);
        when(new Random().ints(0, 9).distinct().limit(4).toArray())
                .thenReturn(randomNumber);
        GenerateAnswer generatingAnswer = new GenerateAnswer();

        //when
        int[] answer = generatingAnswer.generateAnswer();

        //then
        assertEquals(randomNumber, answer);
    }
}
