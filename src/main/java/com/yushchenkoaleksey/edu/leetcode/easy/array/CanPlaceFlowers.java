package com.yushchenkoaleksey.edu.leetcode.easy.array;

//605. Can Place Flowers (EASY)
//https://leetcode.com/problems/can-place-flowers/
public class CanPlaceFlowers {

    // 0
    // 0 0
    //1 0 0
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                i++;
            } else if (i != flowerbed.length - 1 && flowerbed[i + 1] == 0) {
                n--;
                i++;
            } else if (i == flowerbed.length - 1) {
                n--;
            }
        }
            return n <= 0;
    }

        public static void main (String[]args){
            CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
            System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
            System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 1));
            System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
            System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
            System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 2));
            System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 1, 0, 0}, 1));
            System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 1, 0, 0}, 2));
        }
    }
