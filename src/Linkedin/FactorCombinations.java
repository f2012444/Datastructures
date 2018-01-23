package Linkedin;

import java.util.ArrayList;
import java.util.List;

public class FactorCombinations {
    List<List<Integer>> getFactors(int num) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(num<2) {
            return res;
        }

        for(int i = 2;i<Math.sqrt(num);i++) {

            if(num%i == 0) {
                List<Integer> temp = new ArrayList<>();
                List<Integer> temp2 = new ArrayList<>();
                temp.add(i);
                temp.add(num/i);
                temp2.add(num/i);
                temp2.add(i);
                res.add(temp);
                res.add(temp2);
            }
        }

        int val = (int)Math.sqrt(num);
        if(num%val == 0) {
            List<Integer> temp = new ArrayList<>();
            temp.add(val);
            temp.add(val);
            res.add(temp);
        }

        return res;

    }
}
