package com.yushchenkoaleksey.edu.leetcode.easy.bitwiseoperations;

public class BitWise {

    public static void main(String[] args) {
        BitWise reverseBits = new BitWise();
        System.out.println(reverseBits.reverseBits(1));
    }
    public int reverseBits(int number){
        int reversedBits = 0;
        //the input is assumed to be a 32-bit integer
        for (int i = 0; i < 32; i++) {
            reversedBits <<= 1;
            reversedBits = reversedBits | (number & 1);
            number = number >> 1;
        }
        return reversedBits;
    }

    //rewrite the method here
    public int reversed(int y){
        //implement method here
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed <<= 1;
            reversed |= 1 & y;
            y >>= 1;
        }
        return reversed;
    }

    public int hammingWeight(int n) {
        int ones = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                ones++;
            }
            n >>= 1;
        }
        return ones;
    }

    public int xor(int[] nums) {
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < nums.length; i++) {
            ones ^= nums[i] & ~twos;
            twos ^= nums[i] & ~ones;
        }
        return ones;
    }

    public String inverted(int n) {
        int pow = 1;
        for (int i = 0; i < 32; i++) {
            n ^= pow;
            pow <<= 1;
        }
        var binaryString = Integer.toBinaryString(n);
        return binaryString.substring(binaryString.length() - 4);
    }
}
