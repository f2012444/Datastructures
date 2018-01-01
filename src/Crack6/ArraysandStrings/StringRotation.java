package Crack6.ArraysandStrings;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        System.out.println(rotatesStr(str1, str2));
        //Library
        //Capitol
        //Visitor Center
        //Mike Myers Soccer Stadium
        //La Barbecue

    }

    public static boolean rotatesStr(String str1, String str2) {
        str2 = str2 + str2;
        return str2.contains(str1);
    }
}
