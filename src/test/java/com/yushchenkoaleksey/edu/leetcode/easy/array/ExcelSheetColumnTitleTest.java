package com.yushchenkoaleksey.edu.leetcode.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleTest {

    ExcelSheetColumnTitle excel = new ExcelSheetColumnTitle();
    @Test
    void convertToTitle() {
        Assertions.assertEquals("A", excel.convertToTitle(1));
    }
    @Test
    void convertToTitle1() {
        Assertions.assertEquals("AA", excel.convertToTitle(27));
    }
    @Test
    void convertToTitle2() {
        Assertions.assertEquals("B", excel.convertToTitle(2));
    }
    @Test
    void convertToTitle3() {
        Assertions.assertEquals("C", excel.convertToTitle(3));
    }
    @Test
    void convertToTitle4() {
        Assertions.assertEquals("AZ", excel.convertToTitle(52));
    }
    @Test
    void convertToTitle5() {
        Assertions.assertEquals("ZY", excel.convertToTitle(701));
    }
}