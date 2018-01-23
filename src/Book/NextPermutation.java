package Book;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class NextPermutation {
    List<Integer> nextPermutation(List<Integer> arr) {
        if(arr.size() <=1) {
            return arr;
        }
        int min = arr.get(arr.size()-1);
        int minIndex = arr.size()-1;
        int index = 0;
        for(int i = arr.size()-2;i>=0;i--) {
            int cur = arr.get(i);
            if( cur < min) {
                index = i+1;
                arr.set(minIndex, cur);
                arr.set(i, min);
                break;
            }
            if(cur < min) {
                min = cur;
                minIndex = i;
            }

        }
        int mid = (index+arr.size()-1)/2;
        int count = 1;
        for(int i = index;i<=mid;i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(arr.size()-count));
            arr.set(arr.size()-count, temp);
            count++;
        }
        return arr;
    }
}