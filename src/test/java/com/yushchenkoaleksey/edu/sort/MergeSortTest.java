package com.yushchenkoaleksey.edu.sort;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void checkMergeSort(){
        List<Integer > expected = new ArrayList<>(Arrays.asList(-5, -3, -1, 0, 2, 5, 9));
        List<Integer > actual = new ArrayList<>(Arrays.asList(5, -5, -3, 2, 0, -1, 9));
        MergeSort.mergeSort(actual);
        assertEquals(expected, actual);
    }

}