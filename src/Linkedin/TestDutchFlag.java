package Linkedin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDutchFlag {
    public static void main(String[] args) {
        int[] cur = {6, 5,12, 11, 13,  4, 7, 7, 7, 4, 6, 1, 45, 12, 9};
        List<Integer> intList = new ArrayList<Integer>();
        for (int index = 0; index < cur.length; index++)
        {
            intList.add(cur[index]);
        }
        DutchNationalFlag dnf = new DutchNationalFlag();
        List<Integer> out = dnf.getDutchFlag(intList, 45);
        for(int i: out) {
            System.out.print(" " + i);
        }
    }
}
