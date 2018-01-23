package Linkedin;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    List<Integer> heap;
    Heap() {
        heap = new ArrayList<>();
    }

    void Heapifyup() {
//        if(heap.size() == 0) {
//            return;
//        }

        int i = heap.size()-1;
        while(i > 0) {
            int val = heap.get(i);
            int par = heap.get(i/2);
            if(par > val) {
                heap.set(i, par);
                heap.set(i/2, val);
            } else {
                return;
            }
            i = i/2;
        }
    }

    void Heapifydown() {
        int i = 0;
        while(i<heap.size()) {

            int val = heap.get(i);
            if(2*i >=heap.size()) {
                return;
            }
            int kid = heap.get(2*i);
            int par = heap.get(i);
            if(2*i+1 >= heap.size()) {
                if(kid < par) {
                    heap.set(i, kid);
                    heap.set(2*i, par);
                } else {
                    return;
                }
                i = 2*i;
            } else {
                int kid2 = heap.get(2*i+1);
                if(par < kid && par < kid2) {
                    return;
                } else if(kid < kid2) {
                    heap.set(i, kid);
                    heap.set(2*i, par);
                    i = 2*i;
                } else {
                    heap.set(i, kid2);
                    heap.set(2*i+1, par);
                    i = 2*i+1;
                }
            }

            if(i == 0) {
                i+=1;
            }

        }
    }

    void insert(int num) {
        heap.add(num);
        Heapifyup();
    }
    int remove() {
        if(heap.size() == 0) {
            return -1;
        }
        if(heap.size() == 1) {
            return heap.remove(0);
        }
        int temp = heap.get(heap.size()-1);
        heap.remove(heap.size()-1);
        int res = heap.get(0);
        heap.set(0, temp);
        Heapifydown();
        return res;
    }
}
