import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {

        BubbleSort bubbleSort = new BubbleSort();

    }

    @Test
    void leererArray() {
        int[] Sort = {};
        int[] expected = {};
        int[] actual = bubbleSort.sort(Sort);
        Assertions.assertArrayEquals(expected,actual);
    }

}