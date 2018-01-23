package Crack6.Sorting;

public class DifferentSortingsAlgorithms {
    int[] bubblesort(int[] arr) {
        int size = arr.length;
        for(int i = 0;i<size;i++) {
            for(int j = i+1;j<size;j++) {
                if(arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

    int[] selectionsort(int[] arr) {
        int size = arr.length;
        for(int i = 0;i<size;i++) {
            int temp = arr[i];
            int index = i;
            for(int j = i+1;j<size;j++) {
                if(arr[j] < temp) {
                    temp = arr[j];
                    index = j;
                }
            }

            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    int[] mergesort(int [] arr) {
        if(arr.length <= 1) {
            return arr;
        }

        arr = mergesortfunction(arr, 0, arr.length-1);
        return arr;


    }

    int[] mergesortfunction(int[] arr, int start, int end) {
        if(start >= end) {
            return arr;
        }

        int mid = (start+end)/2;
        int[] temp = mergesortfunction(arr ,start, mid);
        int[] temp2 = mergesortfunction(arr, mid+1, end);

        int[] res = new int[arr.length];
        int index1 = start;
        int index2 = mid+1;
        int index = start;
        while(index <=end && index1 <= mid && index2 <= end) {
            if(temp[index1] < temp2[index2]) {
                res[index] = temp[index1];
                index1++;
                index++;
            } else {
                res[index] = temp2[index2];
                index2++;
                index++;
            }
        }

        if(index1 <= mid) {
            while(index1 <= mid) {
                res[index] = temp[index1];
                index1++;
                index++;
            }
        }

        if(index2 <= end) {
            while(index2 <= end) {
                res[index] = temp2[index2];
                index2++;
                index++;
            }
        }

        return res;
    }

    int[] quicksort(int[] arr) {
        if(arr.length <= 1) {
            return arr;
        }
        arr = quicksortfunction(arr, 0, arr.length-1);
        return arr;
    }
    int[] quicksortfunction(int[] arr, int start, int end) {
        if(start >= end) {
            return arr;
        }
        int mid = (start+end)/2;
        int index1 = start;
        int index2 = end;
        int switchIndex = mid;
        int val = arr[mid];
        while(index1 < index2) {
            if(arr[index1] > val) {
                while(arr[index2] > val) {
                    index2--;
                }
                int temp = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = temp;
                index1++;
            } else {
                index1++;
            }
        }

        int temp = arr[index1];
        arr[index1] = arr[mid];
        arr[mid] = temp;
        arr  = quicksortfunction(arr, start, index1-1);
        arr = quicksortfunction(arr, index1+1, end);
        return arr;
    }
}
