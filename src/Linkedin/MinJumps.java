package Linkedin;

public class MinJumps {
    public int jump(int[] nums) {
        int val = getBest(nums);
        return val;
    }

    int[] dp;
    public int getBest(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }
        dp = new int[arr.length];
        for(int i = 0;i<arr.length-1;i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        int val = getMin(arr, 0);

        if (val == Integer.MAX_VALUE-1 || val == Integer.MAX_VALUE) {
            return -1;
        }

        return val;

    }
    int getMin(int[] arr, int pos) {
        if(pos == arr.length-1) {
            return 0;
        }
        if(pos >= arr.length || arr[pos] == 0) {
            return Integer.MAX_VALUE-1;
        }

        if(dp[pos] != Integer.MAX_VALUE) {
            return dp[pos];
        }
        int cur = arr[pos];
        System.out.println("pos is" + pos);
        for(int i = 1;i<=cur;i++) {
            dp[pos] = Math.min(getMin(arr, pos+i)+1, dp[pos]);
        }

        return dp[pos];
    }
}
