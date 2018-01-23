package Book;

public class ColumnID {
    int getColumnID(String str) {
        int sum = 0;
        int count = 0;
        for(int i = str.length()-1;i>=0;i--) {
            char c = str.charAt(i);
            int val = c - 'A' + 1;
            int mul = (int)Math.pow(26, count);
            count++;
            sum = sum + mul*val;
        }
        return sum;
    }
}
