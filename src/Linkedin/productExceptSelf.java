package Linkedin;

public class productExceptSelf {
    public int[] getProducts(int [] nums) {
        int[] leftproduct = new int[nums.length];
        int[] rightproduct = new int[nums.length];
        if(nums.length == 0) {
            return nums;
        }
        leftproduct[0] = 1;
        rightproduct[nums.length - 1] = 1;
        for(int i = 1;i<nums.length;i++) {
            leftproduct[i] = leftproduct[i-1]*nums[i-1];
        }

        for(int i = nums.length-2;i>=0;i--) {
            rightproduct[i] = rightproduct[i+1]*nums[i+1];
        }

        int[] finalproduct = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {
            finalproduct[i] = leftproduct[i]*rightproduct[i];
        }
        return finalproduct;
    }
}
