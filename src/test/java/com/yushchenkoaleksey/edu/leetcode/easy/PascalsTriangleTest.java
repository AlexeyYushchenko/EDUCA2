package com.yushchenkoaleksey.edu.leetcode.easy;

import com.yushchenkoaleksey.edu.miscellaneous.PascalsTriangle;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

    PascalsTriangle triangle = new PascalsTriangle();

    @Test
    void checkGenerate() {
        var list = triangle.generate(5);
        System.out.println(list);
    }
}