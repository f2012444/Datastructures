package Crack6.ArraysandStrings;

import java.util.Scanner;

public class CheckStringPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tesString = input.nextLine();
        System.out.println(checkPermutation(tesString, tesString.concat("f")));
    }

    public static boolean checkPermutation(String str1, String str2) {
        int[] arr = new int[256];
        int[] arr2 = new int[256];
        if(str1.length() != str2.length()) {
            return false;
        }
        for(int i = 0;i<str1.length();i++) {
            arr[str1.charAt(i)]+=1;
            arr2[str2.charAt(i)]+=1;

        }
        for(int i = 0;i<256;i++) {
            if(arr[i] !=arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
