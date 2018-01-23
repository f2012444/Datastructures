package Book;

public class SellStockTwice {
    int getMoney(int[] arr) {
        int length = arr.length-1;
        if(arr.length <= 1) {
            return 0;
        }
        int maxval = arr[length];
        int curmax = 0;
        int[] max = new int[arr.length];
        max[length] = 0;
        for(int i = length;i>=0;i--) {
            max[i] = curmax;
            //System.out.println(" i is " + i + " max is " + max[i]);
            curmax = Math.max(maxval - arr[i], curmax);
            maxval = Math.max(maxval, arr[i]);
        }
        int[] cursale = new int[arr.length];
        cursale[0] = 0;
        int min = arr[0];
        for(int i = 1;i<=length;i++) {
            cursale[i] = Math.max(0, arr[i]-min);
            //System.out.println(" i is " + i + " max is " + cursale[i]);
            min = Math.min(min, arr[i]);
        }
        int out = 0;
        for(int i = 0;i<=length;i++) {
            out = Math.max(out, cursale[i]+max[i]);
        }
        return out;
    }
}
