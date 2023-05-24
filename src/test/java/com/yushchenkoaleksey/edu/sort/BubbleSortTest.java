package com.yushchenkoaleksey.edu.sort;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        List<Integer> exprected = List.of(-3, -2, -1, 0, 1, 2, 3, 4, 5);
        List<Integer> actual = new ArrayList<>(Arrays.asList(1, -1, 3, -3, -2, 2, 0, 5, 4));
        BubbleSort.bubbleSort(actual);
        assertEquals(exprected, actual);
    }
}