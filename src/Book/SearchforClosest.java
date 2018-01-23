package Book;

public class SearchforClosest {
    int getClosest(int[] arr, int val) {
        int res = getElem(arr, 0, arr.length-1, val);
        return res;
    }
    int getElem(int[] arr, int start, int end, int val) {
        if(start > end) {
            return Integer.MAX_VALUE;
        }
        int mid = start + (end-start)/2;
        int midval = arr[mid];
        if(midval < val) {
            int getval = getElem(arr, mid+1, end, val);
            if(Math.abs(getval - val) < Math.abs(midval - val)) {
                return getval;
            } else {
                return midval;
            }
        } else if(midval == val) {
            return midval;
        } else {
            int getval = getElem(arr, start, mid-1, val);
            if(Math.abs(getval - val) < Math.abs(midval - val)) {
                return getval;
            } else {
                return midval;
            }
        }
    }

}
