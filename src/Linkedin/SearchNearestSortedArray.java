package Linkedin;

public class SearchNearestSortedArray {
    int search(int[] nums, int searchElement) {
        int val = searchFor(nums, searchElement, 0, nums.length-1);
        return val;
    }
    int searchFor(int[] nums, int searchElement, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = (start+end)/2;

        int val = nums[mid];
        if(val == searchElement) {
            return val;
        } else if(val > searchElement) {
            int cur = searchFor(nums, searchElement, start, mid-1);
            if(cur != -1) {
                if(Math.abs(cur-searchElement) < Math.abs(val-searchElement)) {
                    return cur;
                } else {
                    return val;
                }
            } else {
                return val;
            }

        } else {
            int cur = searchFor(nums, searchElement, mid+1, end);
            if(cur != -1) {
                if(Math.abs(cur-searchElement) < Math.abs(val-searchElement)) {
                    return cur;
                } else {
                    return val;
                }
            } else {
                return val;
            }
        }
    }
}
