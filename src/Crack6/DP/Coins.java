package Crack6.DP;

public class Coins {
    static int[] count;
    int temp = 1;
    int getNoWays(int val) {
        count = new int[val+1];
        int res = getWays(val, count);
        return  res;
    }

    int getWays(int val, int[] count) {

        if(val < 0) {
            return 0;
        }
        if(val == 0) {
            count[val] = 1;
            return 1;
        }
        if(count[val] != 0) {
            return count[val];
        }
        System.out.println(temp);
        temp++;

        count[val] = getWays(val-1, count) +  getWays(val-5, count) + getWays(val-10, count) + getWays(val-25, count);
        return count[val];
    }
}
