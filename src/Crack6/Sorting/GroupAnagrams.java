package Crack6.Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class GroupAnagrams {
    ArrayList<String> getAnagramstogether(ArrayList<String> strlist) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for(String str:strlist) {
            String temp = getSortedString(str);
            if(hm.containsKey(temp)) {
                ArrayList<String> cur = hm.get(temp);
                cur.add(str);
                hm.put(temp, cur);
            } else {
                ArrayList<String> cur = new ArrayList<>();
                cur.add(str);
                hm.put(temp, cur);
            }
        }

        Set<String> strset = hm.keySet();
        ArrayList<String> res = new ArrayList<>();
        for(String str: strset) {
            ArrayList<String> temp = hm.get(str);
            res.addAll(temp);
        }
        return res;
    }

    String getSortedString(String str) {
        int[] arr = new int[256];
        for(int i = 0;i<str.length();i++) {
            char c = str.charAt(i);
            int temp = c;
            arr[temp]+=1;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<256;i++) {
            char c = (char)i;
            for(int j = 0;j<arr[i];j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
