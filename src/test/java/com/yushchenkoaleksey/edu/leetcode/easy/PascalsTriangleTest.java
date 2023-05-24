package com.yushchenkoaleksey.edu.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

class PascalsTriangleTest {

    PascalsTriangle triangle = new PascalsTriangle();

    @Test
    void checkGenerate() {
        var list = triangle.generate(5);
        System.out.println(list);
    }
}