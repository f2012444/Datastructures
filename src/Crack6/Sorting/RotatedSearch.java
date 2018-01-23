package Crack6.Sorting;

public class RotatedSearch {
    public int getIndex(int[] arr, int val) {
        int index = getrotateposition(arr, 0, arr.length - 1);
        if(index == -1) {
            return binarysearch(arr, 0, arr.length-1, val);
        }

        if(val >= arr[0] && val <=arr[index]) {
            return binarysearch(arr, 0, index, val);
        } else {
            return binarysearch(arr, index+1, arr.length - 1, val);
        }

    }

    public int binarysearch(int[] arr, int start, int end, int val) {
        if(start > end) {
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid] == val) {
            return mid;
        } else if(arr[mid] > val) {
            return binarysearch(arr, start, mid-1, val);
        } else {
            return binarysearch(arr, mid+1, end, val);
        }
    }

    int getrotateposition(int[] arr, int start, int end) {

        int mid = (start+end)/2;
        if(start > end) {
            return -1;
        }

        if(start == end) {
            return start;
        }

        int val = arr[mid];
        if(mid == end) {
            return mid;
        }
        if(arr[mid] > arr[mid+1]) {
            return mid;
        }

        if(arr[mid] < arr[start]) {
            return getrotateposition(arr, start, mid);
        } else {
            return getrotateposition(arr, mid+1, end);
        }


    }
}
