package Book;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 60, 74, 80};
        List<Integer> arrlist = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++) {
            arrlist.add(arr[i]);
        }

        SearchforClosest sc = new SearchforClosest();
        System.out.println(sc.getClosest(arr, 76));



    }
}
