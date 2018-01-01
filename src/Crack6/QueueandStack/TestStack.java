package Crack6.QueueandStack;

import javax.swing.*;

public class TestStack {
    public static void main(String[] args) {
        ValidParentheses vp =  new ValidParentheses();
        System.out.println(vp.checkValidParenthesis("()(())"));
    }
}
