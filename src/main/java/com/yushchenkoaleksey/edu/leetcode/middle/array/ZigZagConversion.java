package com.yushchenkoaleksey.edu.leetcode.middle.array;

//https://leetcode.com/problems/zigzag-conversion/?envType=study-plan-v2&envId=top-interview-150
//6. Zig Zag conversion

import lombok.AllArgsConstructor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

public class ZigZagConversion {

    public static void main(String[] args) {
        int numRows = 3;
        int counter = 0;
        int end = 10;
        int s = 0;
        int increment = 1;
        boolean isPositive = true;
        while (counter < end) {
            System.out.println(s);
            s += increment;
            counter++;
            if (counter % (numRows - 1) == 0) {
                isPositive = !isPositive;
                increment = -increment;
            }
        }
    }

    public String convert3(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < arr.length; i++) arr[i] = new StringBuilder();
        var chars = s.toCharArray();
        int idx = 0;
        int increment = -1;
        for (int i = 0; i < chars.length; i++) {
            increment = i % (numRows - 1) == 0 ? -increment : increment;
            arr[idx].append(chars[i]);
            idx += increment;
        }
        for (int i = 1; i < arr.length; i++) {
            arr[0].append(arr[i]);
        }
        return arr[0].toString();
    }

    public String convert2(String s, int numRows) {
        if (numRows == 1) return s;
        var chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int[] a = new int[numRows];
        int idx = 0;
        int increment = -1;
//        for (int i = 0; i < chars.length && i < numRows; i++) sb.append(chars[i]);
//        a[numRows - 1] = sb.length() - 1;
//        a[0] = 1;
        for (int i = 0; i < chars.length; i++) {
            increment = i % (numRows - 1) == 0 ? -increment : increment;
            //BEGINNING
            if (idx == 0) {
                sb.insert(a[idx]++, chars[i]);
            }
            // END
            else if (i % (numRows - 1) == numRows - 1) {
                sb.append(chars[i]);
                a[idx] = sb.length() - a[0];
                //GOES BACK
            } else if (increment < 0) {
                sb.insert(a[idx + 1], chars[i]);
                a[idx] = a[idx + 1] - a[0] * 2 - 1;
                //GOES FORWARD
            } else {
                sb.insert(a[0] + a[a.length - 1] * 2 + idx, chars[i]);
//                if (idx - 1 == 0){
//                    sb.insert(a[0] + a[idx], chars[i]);
//                    a[idx] += a[0] + 1;
//                }else {
//                    sb.insert(a[idx - 1] + a[0], chars[i]);
//                    a[idx] = a[idx - 1] + a[0] + 1;
//                }
            }
            idx += increment;
        }

        return sb.toString();
    }
}
