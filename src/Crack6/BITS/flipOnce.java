package Crack6.BITS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;

public class flipOnce {
    public int getMaxOnes(int val) {
        ArrayList<Integer> bits = getBinary(val);
        int maxlength = Integer.MIN_VALUE;
        int count = 0;
        int lastseen = 0;
        int tempmax = 0;
        for(int i = 0;i<bits.size();i++) {
            int temp = bits.get(i);
            if(temp == 1) {
                tempmax++;
                maxlength = Math.max(maxlength, tempmax);
            } else {
                if(count == 0) {
                    count++;
                    lastseen = i;
                    tempmax++;
                    maxlength = Math.max(maxlength, tempmax);
                } else {
                    maxlength = Math.max(maxlength, tempmax);
                    tempmax = i - lastseen;
                    maxlength = Math.max(maxlength, tempmax);
                    lastseen = i;
                    count = 1;
                }
            }
        }

        return maxlength;

    }

    public ArrayList<Integer> getBinary(int val) {
        ArrayList<Integer> res = new ArrayList<>();
        while(val > 0) {
            int temp = val%2;
            res.add(temp);
            val = val/2;
        }

        Collections.reverse(res);
        return res;
    }
}
