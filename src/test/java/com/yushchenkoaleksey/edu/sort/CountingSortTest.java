package com.yushchenkoaleksey.edu.sort;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CountingSortTest {

    @Test
    void countingSortI() {
        var expected = new ArrayList<>(Arrays.asList(-5, -1, 0, 1, 3, 5));
        var actual = new ArrayList<>(Arrays.asList(-5, 3, 1, -1, 0, 5));
        CountingSort.countingSortI(actual);
        assertEquals(expected, actual);
    }
}