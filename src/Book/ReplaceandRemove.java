package Book;

import java.util.List;

public class ReplaceandRemove {
    String replace(List<Character> str, int k) {
        int length = str.size()-1;
        for(int i = k;i>=0;i--) {
            char c = str.get(i);
            if( c == 'a') {
                str.set(length--, 'd');
                str.set(length--, 'd');
            } else if(c == 'b') {
                //do nothing
            } else {
                str.set(length--, str.get(i));
            }
        }
        return String.valueOf(str.subList(length+1, str.size()));
    }

}
