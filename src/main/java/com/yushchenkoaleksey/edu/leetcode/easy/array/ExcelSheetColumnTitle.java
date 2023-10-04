package com.yushchenkoaleksey.edu.leetcode.easy.array;
//https://leetcode.com/problems/excel-sheet-column-title/
//168. Excel Sheet Column Title
public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.println(1 % 26);
        System.out.println(25 % 26);
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber - 1 > 25) {
            int d = (columnNumber - 1) / 26;
            int pow = 1;
            while (d > 26) {
                d /= 26;
                pow++;
            }
            sb.append((char) (d + 64));
            columnNumber -= Math.pow(26 , pow) * d;
        }
        sb.append((char) (columnNumber + 64));
        return sb.toString();
    }
}