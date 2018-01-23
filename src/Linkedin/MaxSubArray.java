package Linkedin;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = 0;
        boolean allnegative = false;
        int least = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++) {
            sum = sum+nums[i];
            if(sum < 0) {
                sum = 0;
            }
            maxsum = Math.max(maxsum, sum);
            if(nums[i] > 0) {
                allnegative = true;
            }
            least = Math.max(least, nums[i]);
        }

        if(!allnegative) {
            return least;
        }





        return maxsum;
    }
}
