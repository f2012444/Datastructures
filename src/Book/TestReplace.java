package Book;

import java.util.ArrayList;
import java.util.List;

public class TestReplace {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('c');
        list.add('a');
        list.add('a');
        list.add('b');
        list.add('j');
        String res = new ReplaceandRemove().replace(list, 3);
        System.out.println(res);
    }
}
