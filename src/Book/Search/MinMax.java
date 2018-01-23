package Book.Search;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
    public List<Integer> getMinMax(int[] arr) {
        if(arr.length == 0) {
            return new ArrayList<Integer>();
        }
        int min = arr[0];
        int max = arr[0];
        int i = 0;
        for(;i+1<arr.length;i++) {
            int val1 = arr[i];
            int val2 = arr[i+1];
            if(val1 < val2) {
                min = Math.min(val1, min);
                max = Math.max(val2, max);
            } else {
                min = Math.min(val2, min);
                max = Math.max(val1, max);
            }
        }
        if(i == arr.length - 1) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        List<Integer> res = new ArrayList<Integer>();
        res.add(min);
        res.add(max);
        return res;
    }
}
