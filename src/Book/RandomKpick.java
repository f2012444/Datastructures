package Book;
import java.util.*;
public class RandomKpick {
    List<Integer> getkelem(List<Integer> arr, int k) {
        int size = arr.size()-1;
        for(int i = 0;i<k;i++) {
            int index = (int)(Math.random()*arr.size()-i);
            int temp = arr.get(arr.size()-i-1);
            arr.set(arr.size()-i-1, arr.get(index));
            arr.set(index, temp);
        }

        return arr.subList(arr.size()-k, arr.size());
    }
}
