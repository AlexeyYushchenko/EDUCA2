package com.yushchenkoaleksey.edu.leetcode.middle.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/extra-characters-in-a-string/?envType=daily-question&envId=2023-09-02
//2707. Extra Characters in String
public class ExtraCharactersInString {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("zwlghw", "a", "ab", "ac", "yvvobml", "yvvol"));
        list.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        System.out.println(list);
    }
//    public int minExtraChar(String s, String[] dictionary) {
//        Arrays.sort(dictionary, Comparator.comparing(String::length));
//        System.out.println(Arrays.toString(dictionary));
//        StringBuilder sb = new StringBuilder(s);
//        for (int i = dictionary.length - 1; i >= 0; i--) {
//            int idx = sb.toString().indexOf(dictionary[i]);
//            while (idx != -1) {
//                    s = sb.toString();
//                    System.out.println(s);
//                    sb.setLength(0);
//                    sb.append(s, 0, idx).append(s,idx + dictionary[i].length(), s.length());
//                idx = sb.toString().indexOf(dictionary[i]);
//            }
//        }
//        return sb.length();
//    }

    public int minExtraChar(String s, String[] dictionary) {
        for (var word : dictionary){
            s = s.replace(word, "");
        }
        for (var word : dictionary){
            s = s.replace(word, "");
        }
        System.out.println(s);
        return s.length();

//        Arrays.sort(dictionary, Comparator.comparing(String::length));
//        System.out.println(Arrays.toString(dictionary));
//        StringBuilder sb = new StringBuilder(s);
//        for (int i = dictionary.length - 1; i >= 0; i--) {
//            var split = sb.toString().split(dictionary[i]);
//            System.out.println("deleting=" + dictionary[i]);
//            System.out.println("before:");
//            System.out.println(sb.toString());
//            System.out.println("len=" + sb.toString().length());
//            sb.setLength(0);
//            for (int j = 0; j < split.length; j++) {
//                sb.append(split[j]);
//            }
//            System.out.println("after:");
//            System.out.println(sb.toString());
//            System.out.println("len=" + sb.toString().length());
//        }
//        return sb.length();
    }
}
