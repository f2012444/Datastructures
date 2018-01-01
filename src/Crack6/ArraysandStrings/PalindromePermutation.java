package Crack6.ArraysandStrings;

import java.util.Scanner;

public class PalindromePermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String testString = input.nextLine();
        System.out.println(permut(testString));
    }

    public static boolean permut(String str) {
        str = str.toLowerCase();
        int[] arr = new int[26];
        for(int i = 0;i<str.length();i++) {
            int temp = str.charAt(i);
            if(temp>=97 && temp <=122) {
                temp = temp - 97;
                arr[temp] = arr[temp] + 1;
            }
        }

        int count = 0;
        for(int i = 0;i<26;i++) {
            if(arr[i]%2 != 0) {
                count++;
            }
        }

        if(count > 2) {
            return false;
        } else {
            return true;
        }

    }



}
