package Book.Sorted;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    List<Interval> getInsertesList(List<Interval> arr, Interval insert) {
        boolean added = false;
        for(int i = 0;i<arr.size();i++) {
            Interval temp = arr.get(i);
            if(insert.start <= temp.start) {
                arr.add(i, insert);
                added = true;
                break;
            }

        }

        if(!added) {
            arr.add(insert);
        }
        return getMergedList(arr);

    }


    List<Interval> getMergedList(List<Interval> arr) {
        List<Interval> res = new ArrayList<Interval>();
        if(arr.size() <=1) {
            return arr;
        }

        res.add(arr.get(0));

        for(int i = 1;i<arr.size();i++) {
            boolean intersect = checkIntersecting(res.get(res.size()-1) , arr.get(i));
            if(!intersect) {
                res.add(arr.get(i));
            } else {
                Interval a = new Interval(Math.min(res.get(res.size()-1).start, arr.get(i).start), Math.max(res.get(res.size()-1).end, arr.get(i).end));
                res.remove(res.size()-1);
                res.add(a);
            }

        }

        return res;

    }
    boolean checkIntersecting(Interval a, Interval b) {
        if(a.end < b.start) {
            return false;
        }
        if(a.end >= b.start) {
            return true;
        }

        return false;
    }
}
