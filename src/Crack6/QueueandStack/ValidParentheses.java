package Crack6.QueueandStack;

import java.util.Stack;

public class ValidParentheses {
    boolean checkValidParenthesis(String str) {
        Stack<Character> st = new Stack<>();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<str.length();i++) {
            char c = str.charAt(i);
            if(c == '(') {
                count1++;
            } else if(c == ')') {
                count2++;
            }

            if(count2 > count1) {
                return false;
            }
        }

        if(count1 != count2) {
            return false;
        }

        return true;
    }
}
