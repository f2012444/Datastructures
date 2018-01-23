package Linkedin;

public class SparseMatrixMultiplication {
    int[][] multiply(int[][] a, int[][] b) {
        if(a.length == 0 || b.length == 0) {
            return new int[0][0];
        }
        int[][]c = new int[a.length][b[0].length];
        for(int i = 0;i<a.length;i++) {
            for(int j = 0;j<a[0].length;j++) {
                if(a[i][j] != 0) {
                    for(int k = 0;k<b[0].length;k++) {
                        c[i][k]+=a[i][j]*b[j][k];
                    }
                }

            }
        }

        return c;

    }
}
