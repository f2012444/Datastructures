package Crack6.DP;

import java.util.ArrayList;

public class PowerSet {

    ArrayList<ArrayList<Integer>> createPowerSet(int[] arr, int index) {
        if(index == arr.length) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
            res.add(new ArrayList<Integer>());
            return res;
        }
        ArrayList<ArrayList<Integer>> res = createPowerSet(arr, index+1);
        ArrayList<ArrayList<Integer>> res2 = new ArrayList<ArrayList<Integer>>();
        for(ArrayList<Integer> temp: res) {
            ArrayList<Integer> copy = getCopy(temp);
            copy.add(arr[index]);
            res2.add(copy);
        }
        res.addAll(res2);
        return res;

    }

    ArrayList<Integer> getCopy(ArrayList<Integer> temp) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i:temp) {
            res.add(i);
        }
        return res;
    }
}
