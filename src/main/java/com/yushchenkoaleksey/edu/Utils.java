package com.yushchenkoaleksey.edu;

import lombok.experimental.UtilityClass;

import java.util.Arrays;

@UtilityClass
public class Utils {
    public static void printArray(int[][] arr){
        for (var array : arr) System.out.println(Arrays.toString(array));
    }
}
