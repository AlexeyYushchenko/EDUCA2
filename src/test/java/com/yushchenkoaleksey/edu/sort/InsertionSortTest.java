package com.yushchenkoaleksey.edu.sort;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void insertionSort() {
        List<Integer > list = new ArrayList<>(Arrays.asList(5, -5, -3, 2, 0, -1, 9));
        List<Integer > result = new ArrayList<>(Arrays.asList(-5, -3, -1, 0, 2, 5, 9));
        InsertionSort.insertionSort(list);
        assertEquals(list, result);
    }
}