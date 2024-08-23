package com.yushchenkoaleksey.edu.leetcode.easy.array;

//1071. Greatest Common Divisor of Strings
//

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        var sb1 = new StringBuilder(str1).append(str2);
        var sb2 = new StringBuilder(str2).append(str1);
        if(!sb1.toString().equals(sb2.toString())) return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    int gcd(int a, int b){
        if (a % b == 0) return b;
        return gcd(b, a % b );
    }


}
