package Book.Sorted;

import java.util.ArrayList;
import java.util.List;

public class TestSorted {
    public static void main(String[] args) {
        int[] arr = {4,8, 3};
        int[] arr2 = {3, 4, 8};
        List<Integer> arrlist = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++) {
            arrlist.add(arr[i]);
        }
        MergeSortInPlace msip = new MergeSortInPlace();
        int[] res = msip.mergesort(arr);
        for(int i: res) {
            System.out.println(i);
        }



    }
}
