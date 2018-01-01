package Crack6.DP;

public class MagicIndex {
    public int getMagicIndex(int[] arr, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            return -1;
        }

        int midIndex = (startIndex+endIndex)/2;
        if(arr[midIndex] == midIndex) {
            return midIndex;
        }

        if(arr[midIndex] < midIndex) {
            int val = getMagicIndex(arr, midIndex+1, endIndex);
            if(val != -1) {
                return val;
            } else {
                return getMagicIndex(arr,startIndex, arr[midIndex]);
            }
        } else {
            int val = getMagicIndex(arr, startIndex, midIndex-1);
            if(val != -1) {
                return val;
            } else {
                return getMagicIndex(arr,arr[midIndex], endIndex);
            }
        }


    }
}
