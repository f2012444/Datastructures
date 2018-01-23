package Linkedin;
import java.util.*;
public class DutchNationalFlag {
    List<Integer> getDutchFlag(List<Integer> arr, int val) {
        int size = arr.size();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = 0;i<size;i++) {
            if(arr.get(i) < val) {
                count1++;
            } else if(arr.get(i) == val) {
                count2++;
            } else {
                count3++;
            }
        }
        int i = 0;
        int temp2 = count1;
        int temp3 = count1 + count2;
        while(i < count1) {
            int cur = arr.get(i);
            if(cur < val) {
                i++;
            } else if(cur == val) {
                int temp = arr.get(temp2);
                arr.set(temp2, cur);
                arr.set(i, temp);
                temp2++;
            } else {
                int temp = arr.get(temp3);
                arr.set(temp3, cur);
                arr.set(i, temp);
                temp3++;
            }
        }
        i = temp2;
        while(i < count1+count2) {
            int cur = arr.get(i);
            if(cur == val) {
                i++;
            } else {
                int temp = arr.get(temp3);
                arr.set(temp3, cur);
                arr.set(i, temp);
                temp3++;
            }
        }
        return arr;


    }

}
