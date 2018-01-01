package Crack6.DP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RecursiceMultiply {
    static  int val = 1;
    public int multiply(int a, int b) {
        ArrayList<Integer> binary = getBinary(b);
        int length = binary.size();
        int res = 0;
        for(int i = length-1;i>=0;i--) {
            if(binary.get(i) != 0) {
                int temp = a;
                int shift = length - i -1;
                temp = temp << shift;
                res = res+temp;
            }
        }

        return res;
    }


    public ArrayList<Integer> getBinary(int b) {
        ArrayList<Integer> res = new ArrayList<>();
        while(b>0) {
            res.add(b%2);
            b = b/2;
        }
        Collections.reverse(res);
        return res;
    }

    int getMultiplicationValue(int a, int b) {
        System.out.println("val is"  + val);
        val++;
       if(b == 0) {
           return 0;
       }
       if(b == 1) {
           return a;
       }
       if(b%2 == 0) {
           int val = getMultiplicationValue(a, b/2);
           return val+val;
       } else {
           int val = getMultiplicationValue(a, b/2);
           return val+val+a;
       }


    }
}
