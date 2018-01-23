package Linkedin;

public class RotatedSort {
    public int search(int[] nums, int target) {
        int val = getRotatedIndex(nums, 0, nums.length-1);
        if(val == -1) {
            binarySearch(nums, 0, nums.length-1, target);
        }
        int rot = nums[val];
        if(target >= nums[0]) {
            return binarySearch(nums, 0, rot, target);
        } else {
            return binarySearch(nums, rot+1, nums.length-1, target);
        }


    }

    public int getRotatedIndex(int[] nums, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start+end)/2;
        if(mid+1 < nums.length) {
            if(nums[mid] > nums[mid+1]) {
                return mid;
            }
        }

        int val = nums[mid];
        int startvalue = nums[start];
        int endvalue = nums[end];
        if(val >= start) {
            return getRotatedIndex(nums, mid+1, end);
        } else {
            return getRotatedIndex(nums, start, mid-1);
        }
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        if(start > end) {
            return -1;
        }
        int mid = (start+end)/2;
        int midvalue = nums[mid];
        if(midvalue == target) {
            return mid;
        } else if(midvalue < target) {
            return binarySearch(nums, mid+1, end, target);
        } else {
            return binarySearch(nums, start, mid-1, target);
        }
    }


}
