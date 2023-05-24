package com.yushchenkoaleksey.edu.leetcode.easy;

public class isValidEasy {

    public static void main(String[] args) {
        System.out.println(IsValid("(){}[]"));
        System.out.println(IsValid("([]){{}}[()()]"));
        System.out.println(IsValid("({([()])})"));
        System.out.println(IsValid("(()){{[]}}[{()}]"));
    }
    public static boolean IsValid(String s) {
        int pointer = 0;
        int[] sarr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){ //inizio?
                sarr[pointer] = c;
                pointer++;
            }else {
                if (pointer == 0){
                    return false;
                }else if (c == ')' && sarr[pointer - 1] == '('){
                    pointer--;
                }else if (c == ']' && sarr[pointer - 1] == '['){
                    pointer--;
                }else if (c == '}' && sarr[pointer - 1] == '{'){
                    pointer--;
                }else {
                    return false;
                }
            }
        }
        return pointer == 0;
    }
}
