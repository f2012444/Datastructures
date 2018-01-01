package Crack6.DP;

public class TripleStep {
    public int getNumberOfWays(int n) {
        int[] out = new int[n+1];
        if(n < 4) {
            return n;
        }
        out[0] = 0;
        out[1] = 1;
        out[2] = 2;
        out[3] = 3;

        for(int i = 4;i<=n;i++) {
            out[i] = out[i-1] + out[i-2] + out[i-3];
        }

        return out[n];


    }
}
