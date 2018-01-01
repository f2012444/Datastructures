package Crack6.ArraysandStrings;

import java.util.Scanner;

public class OneAway {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test = input.nextLine();
        String test2 = input.nextLine();
        System.out.println(onedistance(test, test2));
    }

    public static boolean onedistance(String str1, String str2) {
        if(str1 == null || str2 == null) {
            return false;
        }
        int dist = str1.length() - str2.length();
        if(dist > 1) {
            return false;
        }

        if(str1.length() < str2.length()) {
            String temp = str2;
            str2 = str1;
            str1 = temp;
        }

        if(str1.length() == str2.length()) {
            int count = 0;
            for(int i = 0;i<str2.length();i++) {
                if(str1.charAt(i) != str2.charAt(i)) {
                    count++;
                }
                if(count > 1) {
                    return false;
                }
            }
            return true;
        }

        int count = 0;
        int i = 0;
        for(i = 0;i<str2.length();i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                count = i;
                break;
            }
        }

        String cur = str1.substring(0, i) + str1.substring(i+1, str1.length());
        count = 0;
        i = 0;
        for(i = 0;i<str2.length();i++) {
            if(cur.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;


    }
}
