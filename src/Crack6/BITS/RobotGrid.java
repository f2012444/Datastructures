package Crack6.BITS;

public class RobotGrid {
    public int[][] getValidity(int[][] grid, int m, int n, int[][] vals) {
        int rows = grid.length;
        if(rows == 0) {
            return vals;
        }
        int cols = grid[0].length;
        if(m < 0 || m >= rows || n < 0 || n >= cols) {
            return vals;
        }

        if(m == rows - 1 && n == cols - 1) {
            vals[m][n] = 1;
            return vals;
        }
        if(vals[m][n] == 1) {
            return vals;
        }

        if(vals[m][n] == -1) {
            return vals;
        }
        return null;
    }
}
