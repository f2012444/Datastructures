package Linkedin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {
    static int value = Integer.MAX_VALUE;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String, Set<String>> hm = new HashMap<String, Set<String>>();
        wordList.add(beginWord);
        for(int i = 0;i<wordList.size();i++) {
            for(int j = i+1;j<wordList.size();j++) {
                String one = wordList.get(i);
                String two = wordList.get(j);
                int diff = getDiff(one, two);
                if(diff == 1) {
                    if(!hm.containsKey(two)) {
                        Set<String> set = new HashSet<String>();
                        set.add(one);
                        hm.put(two, set);
                    } else {
                        Set<String> set = hm.get(two);
                        set.add(one);
                        hm.put(two, set);

                    }

                    if(!hm.containsKey(one)) {
                        Set<String> set = new HashSet<String>();
                        set.add(two);
                        hm.put(one, set);
                    } else {
                        Set<String> set = hm.get(one);
                        set.add(two);
                        hm.put(one, set);

                    }


                }

            }
        }
        Set<String> used = new HashSet<>();
        int count = getResult(hm, beginWord, 1, endWord, used);
        return count;

    }

    public int getResult(HashMap<String, Set<String>> hm, String beginWord, int count, String endWord, Set<String> used) {
        if(used.contains(beginWord)) {
            return value;
        }
        if(endWord.equals(beginWord)) {
            value = Math.min(count, value);
            return value;
        }

        if(count >= value) {
            return value;
        }

        used.add(beginWord);

        int cur = Integer.MAX_VALUE;
        if(!hm.containsKey(beginWord)) {
            return cur;
        }
        Set<String> set = hm.get(beginWord);
        for(String str: set) {
            cur = Math.min(cur, getResult(hm, str, count+1, endWord, used));
        }

        return cur;
    }

    public int getDiff(String one, String two) {
        int res = 0;
        for(int i = 0;i<one.length();i++) {
            if(one.charAt(i) != two.charAt(i)) {
                res+=1;
            }
        }
        return res;
    }
}
