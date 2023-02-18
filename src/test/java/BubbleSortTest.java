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
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void fuenfElemente() {
        int[] Sort = {9, 8, 7, 6, 5};
        int[] expected = {5, 6, 7, 8, 9};
        int[] actual = bubbleSort.sort(Sort);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void einElemente() {
        int[] Sort = {130};
        int[] expected = {130};
        int[] actual = bubbleSort.sort(Sort);
        Assertions.assertArrayEquals(expected, actual);
    }


}