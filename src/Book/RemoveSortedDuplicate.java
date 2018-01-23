package Book;

public class RemoveSortedDuplicate {
    int[] removeDuplicates(int[] arr) {
        int pointer = 1;
        if(arr.length <= 1) {
            return arr;
        }
        int key = arr[0];
        for(int i = 1;i<arr.length;i++) {
            int temp = arr[i];
            if(temp == key) {
                continue;
            } else {
                arr[pointer] = temp;
                pointer++;
                key = temp;
            }
        }
        int size = arr.length;
        for(int i = pointer;i<arr.length;i++) {
            arr[i] = -1;
        }
        return arr;
    }
}
