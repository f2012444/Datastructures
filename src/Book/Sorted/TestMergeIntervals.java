package Book.Sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMergeIntervals {
    public static void main(String[] args) {
        int i = 0;
        List<Interval> arr = new ArrayList<Interval>();
        while(i < 12) {
            int start = (int)(Math.random()*100);
            int end = start + (int)(Math.random()*20);
            arr.add(new Interval(start, end));
            i++;
        }
        Interval temp = new Interval(30, 50);


        System.out.println("before sorting");
        for(Interval in: arr) {
            System.out.print(" " + in.start + " " + in.end);
        }
        Collections.sort(arr);
        System.out.println();
        System.out.println("after sorting");
        for(Interval in: arr) {
            System.out.print(" " + in.start + " " + in.end);
        }
        System.out.println();
        InsertInterval mi = new InsertInterval();
        arr = mi.getInsertesList(arr, temp);

        System.out.println("after merging");
        for(Interval in: arr) {
            System.out.print("  " + in.start + " " + in.end);
        }

    }
}
