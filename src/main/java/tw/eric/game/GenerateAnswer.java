package tw.eric.game;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class GenerateAnswer {

    public int[] generateAnswer() {
        return new Random().ints(0, 9).distinct().limit(4).toArray();
    }
}
