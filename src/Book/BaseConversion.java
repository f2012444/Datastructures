package Book;

import java.util.HashMap;

public class BaseConversion {
    String baseConversion(String a, int b1, int b2) {
        long decimal = 0;
        int count = 0;
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(10, "A" );
        hm.put(11,"B" );
        hm.put(12,"C" );
        hm.put(13,"D" );
        hm.put(14,"E" );
        hm.put(15,"F" );
        for(int i = a.length()-1;i>=0;i--) {
            char cur = a.charAt(i);
            int val;
            if(cur >='A' && cur<='F') {
                int diff = 'F'-cur;
                val = 10+diff;
            } else {
                val = Character.getNumericValue(cur);
            }
            long mul = (long)Math.pow(b1, count);
            count++;
            decimal = decimal + mul*val;
        }
        StringBuffer sb = new StringBuffer();
        while(decimal > 0) {
            int value = (int)decimal%b2;
            decimal = decimal/b2;
            if(hm.containsKey(value)) {
                sb.append(hm.get(value));
            } else {
                sb.append(String.valueOf(value));
            }
        }
        return sb.reverse().toString();
    }

}
