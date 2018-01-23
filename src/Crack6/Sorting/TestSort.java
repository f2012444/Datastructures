package Crack6.Sorting;

import Crack6.Graphs.Graph;

import java.util.ArrayList;

public class TestSort {

    public static void main(String[] args) {

        String[] arr ={"at", "", "", "", "ball", "", "", "cat"};
        SparseSearch ss = new SparseSearch();
        int val = ss.doSparse(arr, "cat");
        System.out.println(val);











 //       int[] arr = {5, 6, 0, 1, 2, 3};
//        RotatedSearch rs = new RotatedSearch();
//        int index = rs.getIndex(arr, 1);
//        System.out.println(index);
//
//



//        ArrayList<String> str = new ArrayList<>();
//        str.add("temp");
//        str.add("rail safety");
//        str.add("lenist");
//        str.add("fairy tales");
//        str.add("silent");
//        GroupAnagrams gp = new GroupAnagrams();
//        str = gp.getAnagramstogether(str);
//        for(String s: str) {
//            System.out.println(s);
//        }





        //        int[] arr = {1, 5, 6, 7, -1, 3, 11, 5};
//        int[] arr2 = {3, 4, 6, 8};
//        SortedMerge dsf = new SortedMerge();
//
//        arr = dsf.sortArrays(arr, arr2, 3);
//        for(int i = 0;i<arr.length;i++) {
//            System.out.println(arr[i]);
//        }
    }
}
