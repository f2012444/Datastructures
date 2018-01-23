package Crack6.Sorting;

public class SortedMerge {
    int[] sortArrays(int[] arr1, int[] arr2, int length1) {
        int index1 = length1;
        int index2 = arr2.length-1;
        int totalindex = arr1.length-1;

        while(totalindex >= 0 && index1 >= 0 && index2 >= 0) {
            if(arr1[index1] > arr2[index2]) {
                arr1[totalindex] = arr1[index1];
                index1--;
                totalindex--;
            } else {
                arr1[totalindex] = arr2[index2];
                index2--;
                totalindex--;
            }
        }

        while(index2 >= 0) {
            arr1[totalindex] = arr2[index2];
            index2--;
            totalindex--;
        }

        while(index1 >= 0) {
            arr1[totalindex] = arr1[index1];
            index1--;
            totalindex--;
        }

        return arr1;
    }
}
