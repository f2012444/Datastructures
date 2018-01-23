package Book;

import java.util.ArrayList;
import java.util.List;

public class ValidIPaddress {
    List<String> getValidAddresses(String s) {
        List<String> res = new ArrayList<String>();
        for(int i = 0;i<1 && i < s.length();i++) {
            for(int j = i+1;j<i+4 && j < s.length();j++) {
                if(isValidString(s.substring(i, j))) {
                    for(int k = j+1;k<j+4 && k < s.length();k++) {
                        if(isValidString(s.substring(j, k))) {
                            for(int w = k+1;w<k+4 && w < s.length();w++) {
                                if(isValidString(s.substring(k, w)) && isValidString(s.substring(w))) {
                                    String temp = s.substring(i,j) + "." + s.substring(j,k) + "." +s.substring(k,w) + "." +s.substring(w);
                                    res.add(temp);
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    boolean isValidString(String str) {
        if(str.length() > 3) {
            return false;
        }
        if(str.length() > 1 && str.startsWith("0")) {
            return false;
        }
        int value = Integer.parseInt(str);
        if(value > 255) {
            return false;
        }
        return true;
    }
}
