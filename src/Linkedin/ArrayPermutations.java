package Linkedin;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = getPermutations(nums, 0);
        return res;
    }

    List<List<Integer>> getPermutations(int[] nums, int index) {
        List<List<Integer>> out = new ArrayList<>();

        if(index == nums.length - 1) {
            List<Integer> res = new ArrayList<>();
            res.add(nums[index]);
            out.add(res);
            return out;
        }

        List<List<Integer>> temp = getPermutations(nums, index+1);
        for(List<Integer> cur:temp) {
            for(int i = 0;i<cur.size();i++) {
                List<Integer> copy = getCopy(cur);
                copy.add(i, nums[index]);
                out.add(copy);
            }
            List<Integer> copy = getCopy(cur);
            copy.add(nums[index]);
            out.add(copy);
        }
        return out;
    }

    List<Integer> getCopy(List<Integer> arr) {
        List<Integer> res = new ArrayList<>();
        for(int i:arr) {
            res.add(i);
        }
        return res;
    }


}
