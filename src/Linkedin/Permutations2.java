package Linkedin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class Permutations2 {
        public List<List<Integer>> permuteUnique(int[] nums) {
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            for(int i = 0;i<nums.length;i++) {
                int val = nums[i];
                if(hm.containsKey(val)) {
                    hm.put(val, hm.get(val) +1);
                } else {
                    hm.put(val, 1);
                }
            }

            List<List<Integer>> res = getResult(hm, Integer.MIN_VALUE);
            return res;

        }

        List<List<Integer>> getResult(HashMap<Integer, Integer> hmt, int cur) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            hm.putAll(hmt);
            if(cur != Integer.MIN_VALUE) {
                int count = hm.get(cur);
                if(count == 1) {
                    hm.remove(cur);

                } else {
                    hm.put(cur, count-1);
                }
            }
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            if(hm.size() == 0) {
                res.add(new ArrayList<Integer>());
                return res;
            }

            Set<Integer> keys = hm.keySet();

            for(int val: keys) {
                int count  = hm.get(val);
                List<List<Integer>> temp;
                if(count == 1) {
                    temp = getResult(hm, val);
                    //hm.put(val, 1);
                } else {
                    //hm.put(val, count-1);
                    temp = getResult(hm, val);
                    //hm.put(val, count);
                }

                for(List<Integer> arr: temp) {
                    arr.add(val);
                }
                res.addAll(temp);

            }

            return res;
        }


}