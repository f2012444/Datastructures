package Book.Sorted;

public class MergeSortInPlace {
    int[] mergesort(int[] arr) {
        if(arr.length <=1) {
            return arr;
        }
        arr = domergesort(arr, 0, arr.length-1);
        return arr;
    }
    int[] domergesort(int[] arr, int start, int end) {
        if(start > end) {
            return new int[0];
        }
        if(start == end) {
            int[] temp = new int[1];
            temp[0] = arr[start];
            return temp;
        }
        int mid = start + (end-start)/2;
        int[] arr1 = domergesort(arr, start, mid);
        int[] arr2 = domergesort(arr, mid+1, end);
        int pointer1 = start;
        int pointer2 = mid+1;
        int[] res = new int[end-start+1];
        int count = 0;
//        int[] arr1 = new int[mid-start+1];
//        int[] arr2 = new int[end-mid+1];
        for(int i = 0;i<arr1.length;i++) {
            arr1[i] = arr[pointer1];
            pointer1++;
        }

        for(int i = 0;i<arr2.length;i++) {
            arr2[i] = arr[pointer2];
            pointer2++;
        }

        pointer1 = 0;
        pointer2 = 0;
        while(pointer1 < arr1.length && pointer2 < arr2.length) {
            if(arr1[pointer1] < arr2[pointer2]) {
               res[count] = arr1[pointer1];
               count++;
               pointer1++;
            } else {
                res[count] = arr2[pointer2];
                count++;
                pointer2++;
            }
        }


        while(pointer2 < arr2.length) {
            res[count] = arr2[pointer2];
            count++;
            pointer2++;
        }

        while(pointer1 < arr1.length) {
            res[count] = arr1[pointer1];
            count++;
            pointer1++;
        }
        count = start;
        for(int i = 0;i< res.length;i++) {
            arr[count] = res[i];
            count++;
        }

        return res;




    }
}
