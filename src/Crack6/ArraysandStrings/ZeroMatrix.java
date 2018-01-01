package Crack6.ArraysandStrings;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {0, 0, 6}, {7,8, 9}};
        //int[][] arr = {{0, 1}};
        arr = zero(arr);
        for(int i = 0;i<arr.length;i++) {
            System.out.println();
            for(int j = 0;j<arr[0].length;j++) {
                System.out.print(arr[i][j] +" ");
            }
        }

    }

    public static int[][] zero(int[][] arr) {
        int zero_row = 1;
        int zero_col = 1;
        int len = arr.length;
        if(len == 0 || arr[0].length == 0) {
            return arr;
        }

        if(arr[0][0] == 0) {
            zero_col =-1;
            zero_row = -1;
        }

        for(int i = 1;i<arr.length;i++) {
            if(arr[i][0] == 0) {
                zero_row = -1;
                arr[i][0] = -1;
            }
        }

        for(int j = 1;j<arr[0].length;j++) {
            if(arr[0][j] == 0) {
                zero_col = -1;
                arr[0][j] = -1;
            }
        }

        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr[0].length;j++) {
                if(arr[i][j] == 0) {
//                    zero_row = -1;
//                    zero_col = -1;
                    arr[i][0] = -1;
                    arr[0][j] = -1;
                }
            }
        }




        for(int i = 1;i<arr.length;i++) {
            if(arr[i][0] == -1) {
                for(int j = 1;j<arr[0].length;j++) {
                    arr[i][j] = 0;
                }
            }
        }

        for(int j = 1;j<arr[0].length;j++) {
            if(arr[0][j] == -1) {
                for(int i = 1;i<arr.length;i++) {
                    arr[i][j] = 0;
                }
            }
        }

        for(int i = 1;i<arr.length;i++) {
            if(arr[i][0] == -1) {
                arr[i][0] = 0;
            }
        }

        for(int j = 1;j<arr[0].length;j++) {
            if(arr[0][j] == -1) {
                arr[0][j] = 0;
            }
        }

        if(zero_row == -1) {
            for(int i = 0;i<arr.length;i++) {
                arr[i][0] = 0;
            }
        }

        if(zero_col == -1) {
            for(int j = 0;j<arr[0].length;j++) {
                arr[0][j] = 0;
            }
        }

        return arr;
    }
}
