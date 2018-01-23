package Linkedin;

import java.util.ArrayList;
import java.util.List;

public class TestHeap {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i<10;i++) {
            int j = (int)(Math.random()*30);
            arr.add(j);
        }
        for(int i: arr) {
            System.out.print(" " + i);
        }

        Heap heap = new Heap();
        for(int i = 0;i<10;i++) {
            heap.insert(arr.get(i));
        }

        System.out.println();
        for(int i = 0;i<10;i++) {
            System.out.print(" " + heap.remove());
        }
    }
}
