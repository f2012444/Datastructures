package Linkedin;

public class SearchforRange {
    public int[] searchRange(int[] nums, int target) {
        int minSearch = dominSearch(nums, target, 0, nums.length-1);
        int maxSearch = domaxSearch(nums, target, 0, nums.length-1);
        return new int[]{minSearch, maxSearch};

    }

    int dominSearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = (start+end)/2;
        if(arr[mid] == target) {
            if(mid == 0 || arr[mid-1]!=arr[mid]) {
                return mid;
            }
            else {
                return dominSearch(arr, target, start, mid-1);
            }

        } else if(arr[mid] > target) {
            return dominSearch(arr, target, start, mid-1);
        } else {
            return dominSearch(arr, target, mid+1, end);
        }

    }

    int domaxSearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = (start+end)/2;
        if(arr[mid] == target) {
            if(mid == (arr.length-1) || arr[mid+1]!=arr[mid]) {
                return mid;
            }
            else {
                return domaxSearch(arr, target, mid+1, end);
            }

        } else if(arr[mid] > target) {
            return domaxSearch(arr, target, start, mid-1);
        } else {
            return domaxSearch(arr, target, mid+1, end);
        }

    }



}
