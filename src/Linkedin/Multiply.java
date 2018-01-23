package Linkedin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Multiply {
    public List<Integer> getMulitply(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<arr2.size();i++) {
            List<Integer> cur = getMultiple(arr1, arr2.get(i));
            if(i == 0) {
                res = cur;
            } else {
                res.add(0);
                res = add(res, cur);
            }

        }
        return res;

    }

    public List<Integer> getMultiple(List<Integer> arr, int num) {
        List<Integer> res = new ArrayList<Integer>();
        int carry = 0;
        for(int i = arr.size()-1;i>=0;i--) {
            int cur = arr.get(i);
            int mul = cur*num+carry;
            carry = mul/10;
            mul = mul%10;
            res.add(mul);
        }
        if(carry!=0) {
            res.add(carry);
        }
        Collections.reverse(res);
        return res;
    }
    public List<Integer> add(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> res = new ArrayList<Integer>();
        Collections.reverse(arr1);
        Collections.reverse(arr2);
        int carry = 0;
        int i = 0;
        for(;i<Math.min(arr1.size(), arr2.size());i++) {
            int num = arr1.get(i)+arr2.get(i) + carry;
            carry = num/10;
            num = num%10;
            res.add(num);
        }
        while(i < arr1.size()) {
            int num = arr1.get(i) + carry;
            carry = num/10;
            num = num%10;
            res.add(num);
            i++;
        }
        while(i < arr2.size()) {
            int num = arr2.get(i) + carry;
            carry = num/10;
            num = num%10;
            res.add(num);
            i++;
        }
        if(carry!=0) {
            res.add(carry);
        }
        Collections.reverse(res);
        return res;
    }
}