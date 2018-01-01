package Crack6.ArraysandStrings;

import java.util.Scanner;

public class URLify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tesString = input.nextLine();
        System.out.println(tesString);
        int length = tesString.length();
        char[] arr = new char[100];
        for(int i = 0;i<length;i++) {
            arr[i] = tesString.charAt(i);
        }
        System.out.println("String is" + getURL(arr, length-1));

        //int length = 0;

    }

    public static String getURL(char[] str, int val) {
        int index = str.length-1;

        for(int i = val;i>=0;i--) {
            if(str[i] == ' ') {
                str[index--] = '0';
                str[index--] = '2';
                str[index--] = '%';

            } else {
                str[index--] = str[i];
            }
        }

        int newlength = str.length - index-1;


        int index2 = 0;

        for(int i = 0;i<newlength;i++) {
            str[i]  = str[++index];
        }

        for(int i = 0;i<newlength;i++) {
            System.out.print(str[i]);
        }

        return str.toString().trim();



    }
}
