package Linkedin;

public class maxProductArray {
    public int maxProduct(int[] nums) {
            if(nums.length == 0) {
                return 0;
            }

            int maxtillhere = nums[0];
            int mintillhere = nums[0];
            int maxsofar = nums[0];
            for(int i = 1;i<nums.length;i++) {
                if(nums[i] >= 0) {
                    maxtillhere = Math.max(maxtillhere*nums[i], nums[i]);
                    mintillhere = Math.min(mintillhere*nums[i], nums[i]);
                } else {
                    int temp = maxtillhere;
                    maxtillhere = Math.max(nums[i], mintillhere*nums[i]);
                    mintillhere = Math.min(nums[i], temp*nums[i]);
                }

                maxsofar = Math.max(maxsofar, maxtillhere);
            }

            return maxsofar;
    }
}
