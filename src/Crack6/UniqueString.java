package Crack6;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tesString = input.nextLine();
        System.out.println(checkUniqueCharacterswithoutDatastructures(tesString));
    }

    public static boolean checkUniqueCharacters(String str) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<str.length();i++) {
            char c = str.charAt(i);
            if(set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }
        }

        return true;
    }

    public static boolean checkUniqueCharacterswithoutDatastructures(String str) {
        int[] arr = new int[256];
        for(int i = 0;i<str.length();i++) {
            char c = str.charAt(i);
            int j = c;
            if(arr[j] != 0) {
                return false;
            } else {
                arr[j] = 1;
            }
        }

        return true;

    }
}
