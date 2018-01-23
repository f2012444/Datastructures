package Linkedin;

public class TrappedWater {
    public int trap(int[] height) {
        int size = height.length;
        if(size <=1) {
            return 0;
        }

        int[] maxleft = new int[size];
        int[] maxright = new int[size];


        maxleft[0] = 0;
        maxright[height.length-1] = 0;
        for(int i = 1;i<size;i++) {
            maxleft[i] = Math.max(maxleft[i-1], height[i-1]);
        }

        for(int i = size-2;i>=0;i--) {
            maxright[i] = Math.max(maxright[i+1], height[i+1]);
        }

        int sum = 0;
        for(int i = 0;i<size;i++) {
            int cur = Math.min(maxleft[i], maxright[i]);
            if(cur > height[i]) {
                sum+= cur - height[i];
            }
        }
        return sum;

    }
}
