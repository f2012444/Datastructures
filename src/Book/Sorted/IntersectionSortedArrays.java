package Book.Sorted;
import java.util.List;
import java.util.ArrayList;

public class IntersectionSortedArrays {
    List<Integer> getIntersection(int[] arr1, int [] arr2) {
        List<Integer> res = new ArrayList<Integer>();

        if(arr1.length == 0 || arr2.length == 0) {
            return res;
        }
        int arr1index = 0;
        int arr2index = 0;


        while(arr1index < arr1.length && arr2index < arr2.length) {
            int temp1 = arr1[arr1index];
            int temp2 = arr2[arr2index];
            if(temp1 == temp2) {
                res.add(temp1);
                arr1index++;
                arr2index++;
            } else if(temp1 < temp2) {
                arr1index++;
            } else {
                arr2index++;
            }
        }

        return res;
    }
}
