package Linkedin;

import java.util.ArrayList;
import java.util.List;

public class TestMultply {
    public static void main(String[] args) {
        int[] cur = {1, 2, 3};
        List<Integer> intList = new ArrayList<Integer>();
        for (int index = 0; index < cur.length; index++)
        {
            intList.add(cur[index]);
        }
        int[] cur2 = {4, 6};
        List<Integer> intList2 = new ArrayList<Integer>();
        for (int index = 0; index < cur2.length; index++)
        {
            intList2.add(cur2[index]);
        }
        Multiply mul = new Multiply();
        List<Integer> res = mul.getMulitply(intList, intList2);
        for(int i: res) {
            System.out.print(" " + i);
        }

    }
}
