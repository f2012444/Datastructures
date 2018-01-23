package Crack6.Sorting;

import java.util.ArrayList;

public class SparseSearch {
    int doSparse(String[] input, String key) {
        int res = sparsesearch(input, key, 0, input.length-1 );
        return res;
    }

    int sparsesearch(String[] input, String key, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start+end)/2;
        String val = input[mid];
        if(val.equals("")) {
            int count = 1;
            int lesstemp = mid-count;
            int moretemp = mid+count;

            while(lesstemp >= start && moretemp <=end) {
                if(!input[lesstemp].equals("")) {
                    String s = input[lesstemp];
                    if(s.compareTo(key) == 0) {
                        return lesstemp;
                    }
                    if(s.compareTo(key) > 0) {
                        return sparsesearch(input, key, start, lesstemp-1);
                    } else {
                        return sparsesearch(input, key, lesstemp+1, end);
                    }
                }

                if(!input[moretemp].equals("")) {
                    String s = input[moretemp];
                    if(s.compareTo(key) == 0) {
                        return moretemp;
                    }
                    if(s.compareTo(key) > 0) {
                        return sparsesearch(input, key, start, moretemp-1);
                    } else {
                        return sparsesearch(input, key, moretemp+1, end);
                    }
                }

                count+=1;
            }

            if(lesstemp < start) {
                return  sparsesearch(input, key, moretemp, end);
            } else {
                return  sparsesearch(input, key, start, lesstemp-1);
            }
        } else {
            String s = input[mid];
            if(s.compareTo(key) == 0) {
                return mid;
            }
            if(s.compareTo(key) > 0) {
                return sparsesearch(input, key, start, mid-1);
            } else {
                return sparsesearch(input, key, mid+1, end);
            }
        }


    }


}
