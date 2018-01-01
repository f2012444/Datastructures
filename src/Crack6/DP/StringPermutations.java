package Crack6.DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
    public ArrayList<String>  getStringPermutationswithoutDuplicates(String str, int pos) {
        ArrayList<String> res = new ArrayList<String>();
        if(pos == str.length()-1) {
            res.add(String.valueOf(str.charAt(pos)));
            return res;
        }
        ArrayList<String> temp = getStringPermutationswithoutDuplicates(str, pos+1);
        for(String s :temp) {
            for(int i = 0;i<=s.length();i++) {
                StringBuffer sb = new StringBuffer();
                sb.append(s.substring(0, i)) ;
                sb.append( String.valueOf(str.charAt(pos)));
                sb.append(s.substring(i, s.length()));
                res.add(sb.toString());
            }
        }

        return res;
    }


    public ArrayList<String>  getStringPermutationswithDuplicates(String str, int pos) {
        ArrayList<String> res = new ArrayList<String>();
        if(pos == str.length()-1) {
            res.add(String.valueOf(str.charAt(pos)));
            return res;
        }
        ArrayList<String> temp = getStringPermutationswithoutDuplicates(str, pos+1);
        Set<String> set = new HashSet<>();
        for(String s :temp) {
            for(int i = 0;i<=s.length();i++) {
                StringBuffer sb = new StringBuffer();
                sb.append(s.substring(0, i)) ;
                sb.append( String.valueOf(str.charAt(pos)));
                sb.append(s.substring(i, s.length()));
                String cur = sb.toString();
                if(!set.contains(cur)) {
                    res.add(cur);
                    set.add(cur);
                }

            }
        }

        return res;
    }

    public ArrayList<String>  getStringPermutationswithDuplicates2(String str, int pos) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0;i<str.length();i++) {
            Character c = str.charAt(i);
            if(!hm.containsKey(c)) {
                hm.put(c, 1);
            } else {
                hm.put(c, hm.get(c)+1);
            }
        }
        Set<Character> set = hm.keySet();
        ArrayList<String> res = functionHelpers(hm, set);
        return res;




    }

    public ArrayList<String> functionHelpers(HashMap<Character, Integer> hm, Set<Character> set) {
        ArrayList<String> res = new ArrayList<>();
        if(set.size() == 1) {
            for(Character c: set) {
                int count = hm.get(c);
                StringBuffer sb = new StringBuffer();
                for(int i = 0;i<count;i++) {
                    sb.append(c);
                }
                res.add(sb.toString());
            }
            return res;
        }

        for(Character c: set) {
            StringBuffer sb = new StringBuffer();
            int count = hm.get(c);
            if(count == 1) {
                HashMap<Character, Integer> hmtemp = new HashMap<>();
                hmtemp.putAll(hm);
                Set<Character> settemp = new HashSet<>();
                settemp.addAll(set);
                hmtemp.remove(c);
                settemp.remove(c);
                ArrayList<String> temp = functionHelpers(hmtemp, settemp);
                for(String s: temp) {
                    res.add(String.valueOf(c)+s);
                }
            } else {
                HashMap<Character, Integer> hmtemp = new HashMap<>();
                hmtemp.putAll(hm);
                Set<Character> settemp = new HashSet<>();
                settemp.addAll(set);
                hmtemp.put(c, hm.get(c)-1);
                ArrayList<String> temp = functionHelpers(hmtemp, settemp);
                for(String s: temp) {
                    res.add(String.valueOf(c)+s);
                }
            }
        }

        return res;

    }
}
