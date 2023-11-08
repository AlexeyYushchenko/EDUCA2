package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle = new Triangle();

    @Test
    void minimumTotal() {
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(new ArrayList<>(Arrays.asList(2)));
        listOfLists.add(new ArrayList<>(Arrays.asList(3, 4)));
        listOfLists.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
        listOfLists.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));
        assertThat(triangle.minimumTotal(listOfLists)).isEqualTo(11);
//        assertEquals(11, triangle.minimumTotal(listOfLists));
    }
    @Test
    void minimumTotal3() {
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(new ArrayList<>(Arrays.asList(-1)));
        listOfLists.add(new ArrayList<>(Arrays.asList(2, 3)));
        listOfLists.add(new ArrayList<>(Arrays.asList(1, -1, -1)));
//        assertEquals(0, triangle.minimumTotal(listOfLists));
        assertThat(triangle.minimumTotal(listOfLists)).isZero();
    }

    @Test
    void minimumTotal2() {
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(new ArrayList<>(Arrays.asList(-10)));
//        assertEquals(-10, triangle.minimumTotal(listOfLists));
        assertThat(triangle.minimumTotal(listOfLists)).isEqualTo(-10);
    }
}