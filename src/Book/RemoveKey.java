package Book;

import java.util.List;

public class RemoveKey {
    public List<Integer> removeKey(List<Integer> arr, int key) {
        int pointer = 0;
        for(int i = 0;i<arr.size();i++) {
            int temp = arr.get(i);
            if(temp == key) {

            } else {
                arr.set(pointer, temp);
                pointer++;
            }
        }
        int size = arr.size();
        for(int i = pointer;i<size;i++) {
            arr.remove(arr.size()-1);
        }
        return arr;
    }
}
