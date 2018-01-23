package Linkedin;

import java.util.HashMap;

public class TwoSum {
    int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0;i<nums.length;i++) {
            int val = nums[i];
            int required = target - val;
            if(hm.containsKey(required)) {
                int index = hm.get(required);
                res[0] = index;
                res[1] = i;
                return res;
            } else {
                hm.put(val, i);
            }
        }

        return res;
    }
}
