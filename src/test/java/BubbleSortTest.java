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
    @Test
    void doppelteElemente() {
        int[] Sort = {99, 56, 54, 33, 45, 45};
        int[] expected = {33, 45, 45, 54, 56, 99};
        int[] actual = bubbleSort.sort(Sort);
        Assertions.assertArrayEquals(expected, actual);
// Was macht der Algorithmus bei doppelten Zahlen?
// //Bei einer langen Liste sollte man implementieren, dass doppelte Einträge entfernt werden
    }
        @Test
        void negativeZahlen() {
            int[] Sort = {-99, -56, -54, -33, -45, -45};
            int[] expected = {-99,-56,-54,-45,-45,-33};
            int[] actual = bubbleSort.sort(Sort);
            Assertions.assertArrayEquals(expected, actual);
            // Werden negative Zahlen richtig sortiert?
    }

}