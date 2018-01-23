package Book.Search;

import java.util.ArrayList;
import java.util.List;

public class TestSearch {
    public static void main(String[] args) {
        int[] arr = {99, 99};
        List<Integer> arrlist = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++) {
            arrlist.add(arr[i]);
        }

        Kthlargest kl = new Kthlargest();
        int val = kl.findKthLargest(arr, 1);
        System.out.println(val);

    }
}
