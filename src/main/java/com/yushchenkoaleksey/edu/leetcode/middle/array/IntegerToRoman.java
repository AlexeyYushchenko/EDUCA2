package com.yushchenkoaleksey.edu.leetcode.middle.array;

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int number = num / 1000;
        for (int i = 0; i < number; i++) {
            sb.append('M');
        }
        num -= number * 1000;

        number = num / 900;
        for (int i = 0; i < number; i++) {
            sb.append("CM");
        }
        num -= number * 900;

        number = num / 500;
        for (int i = 0; i < number; i++) {
            sb.append('D');
        }
        num -= number * 500;

        number = num / 400;
        for (int i = 0; i < number; i++) {
            sb.append("CD");
        }
        num -= number * 400;

        number = num / 100;
        for (int i = 0; i < number; i++) {
            sb.append("C");
        }
        num -= number * 100;

        number = num / 90;
        for (int i = 0; i < number; i++) {
            sb.append("XC");
        }
        num -= number * 90;

        number = num / 50;
        for (int i = 0; i < number; i++) {
            sb.append("L");
        }
        num -= number * 50;

        number = num / 40;
        for (int i = 0; i < number; i++) {
            sb.append("XL");
        }
        num -= number * 40;

        number = num / 10;
        for (int i = 0; i < number; i++) {
            sb.append('X');
        }
        num -= number * 10;

        number = num / 9;
        for (int i = 0; i < number; i++) {
            sb.append("IX");
        }
        num -= number * 9;

        number = num / 5;
        for (int i = 0; i < number; i++) {
            sb.append('V');
        }
        num -= number * 5;

        number = num / 4;
        for (int i = 0; i < number; i++) {
            sb.append("IV");
        }
        num -= number * 4;

        for (int i = 0; i < num; i++) {
            sb.append('I');
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        IntegerToRoman roman = new IntegerToRoman();
        System.out.println("1 -> " + roman.intToRoman(1));
        System.out.println("2 -> " + roman.intToRoman(2));
        System.out.println("3 -> " + roman.intToRoman(3));
        System.out.println("4 -> " + roman.intToRoman(4));
        System.out.println("5 -> " + roman.intToRoman(5));
        System.out.println("6 -> " + roman.intToRoman(6));
        System.out.println("7 -> " + roman.intToRoman(7));
        System.out.println("8 -> " + roman.intToRoman(8));
        System.out.println("9 -> " + roman.intToRoman(9));
        System.out.println("10 -> " + roman.intToRoman(10));
        System.out.println("30 -> " + roman.intToRoman(30));
        System.out.println("40 -> " + roman.intToRoman(40));
        System.out.println("90 -> " + roman.intToRoman(90));
        System.out.println("190 -> " + roman.intToRoman(190));
        System.out.println("490 -> " + roman.intToRoman(490));
        System.out.println("899 -> " + roman.intToRoman(899));
        System.out.println("999 -> " + roman.intToRoman(999));
        System.out.println("3999 -> " + roman.intToRoman(3999));
        System.out.println("1958 -> " + roman.intToRoman(1958));
        System.out.println("58 -> " + roman.intToRoman(58));
    }
}
