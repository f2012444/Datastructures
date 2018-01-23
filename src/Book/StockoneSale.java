package Book;

public class StockoneSale {
    int getMostMoney(int[] arr) {
        int length = arr.length-1;
        if(arr.length == 0) {
            return 0;
        }
        int maxval = arr[length];
        int curmax = 0;
        for(int i = length;i>=0;i--) {
            curmax = Math.max(maxval - arr[i], curmax);
            maxval = Math.max(maxval, arr[i]);
        }
        return curmax;
    }
}
