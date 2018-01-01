package Crack6.ArraysandStrings;

import java.util.Scanner;

public class StringComprehension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test = input.nextLine();
        System.out.println(compress(test));
    }

    public static String compress(String str) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<str.length();) {
            int j = i;
            char c = str.charAt(i);
            int count = 1;
            i = i+1;
            while(i < str.length() && str.charAt(i) == c) {
                //do nothing
                count++;
                i++;
            }
            sb.append(c);
            sb.append(String.valueOf(count));


        }

        String out = sb.toString();
        if(out.length() > str.length()) {
            return str;
        } else {
            return out;
        }
    }
}
