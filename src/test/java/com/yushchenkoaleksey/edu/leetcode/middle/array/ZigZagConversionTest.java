package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {
    ZigZagConversion zigZagConversion = new ZigZagConversion();

    @Test
    void convert1() {
        assertEquals("AGBFHCEID", zigZagConversion.convert2("ABCDEFGHI", 4));
    }
//    @Test
//    void convert2() {
//        assertEquals("AGMCIOEKBFHLNBDHJNPDFJLPCEIKOAEGKMACGIMODJPFLBHN", zigZagConversion.convert2("ABCDEFGHIJKLMNOPABCDEFGHIJKLMNOPABCDEFGHIJKLMNOP", 4));
//    }
//    @Test
//    void convert3() {
//        assertEquals("ABCDEFGHI", zigZagConversion.convert3("ABCDEFGHI", 1));
//    }
//    @Test
//    void convert4() {
//        assertEquals("PINALSIGYAHRPI", zigZagConversion.convert3("PAYPALISHIRING", 4));
//    }
}

