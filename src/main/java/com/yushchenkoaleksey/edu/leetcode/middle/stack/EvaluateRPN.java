package com.yushchenkoaleksey.edu.leetcode.middle.stack;

import java.util.ArrayDeque;

//150. Evaluate Reverse Polish Notation
//https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class EvaluateRPN {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int pointer = 0;
        for (int i = 0; i < tokens.length; i++) {
            if ("+-/*".contains(tokens[i])) {
                var var2 = stack[--pointer];
                var var1 = stack[--pointer];
                stack[pointer++] = var1 + var2;
            } else if (tokens[i].equals("-")) {
                var var2 = stack[--pointer];
                var var1 = stack[--pointer];
                stack[pointer++] = var1 - var2;
            } else if (tokens[i].equals("*")) {
                var var2 = stack[--pointer];
                var var1 = stack[--pointer];
                stack[pointer++] = var1 * var2;
            } else if (tokens[i].equals("/")) {
                var var2 = stack[--pointer];
                var var1 = stack[--pointer];
                stack[pointer++] = var1 / var2;
            } else {
                stack[pointer++] = Integer.parseInt(tokens[i]);
            }
        }
        return stack[--pointer];
    }

    public static void main(String[] args) {
        EvaluateRPN evaluateRPN = new EvaluateRPN();
        System.out.println(evaluateRPN.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
        System.out.println(evaluateRPN.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evaluateRPN.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
}
