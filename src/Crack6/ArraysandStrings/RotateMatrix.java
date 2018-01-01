package Crack6.ArraysandStrings;

public class RotateMatrix {
    public static void main(String[] args) {
        //int[][] arr = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7,8, 9}};
        arr = rotate(arr);
        for(int i = 0;i<arr.length;i++) {
            System.out.println();
            for(int j = 0;j<arr[0].length;j++) {
                System.out.print(arr[i][j] +" ");
            }
        }
    }

    public static int[][] rotate(int[][] arr) {
        int n = arr.length;
        if (n == 0) {
            return null;
        }

        /*
        1  2  3 4
       12 13 14 5
       11 16 15 6
       10 9  8  7

       10 11 12 1
       9  16 13 2
       8  15 14 3
       7  6  5  4
         */

        for(int i = 0;i<n/2;i++) {
            for(int j = i;j<n-i-1;j++) {
                System.out.println("i is" + i);
                System.out.println("j is" + j);
                System.out.println("n is" + n);
                int temp = arr[i][j];
                arr[i][j] = arr[j][n-i-1];
                arr[j][n-i-1] = arr[n-i-1][n-j-1];
                arr[n-i-1][n-j-1] = arr[n-j-1][i];
                arr[n-j-1][i] = temp;

                for(int k = 0;k<arr.length;k++) {
                    System.out.println();
                    for(int m = 0;m<arr[0].length;m++) {
                        System.out.print(arr[k][m] +" ");
                    }
                }

                System.out.println();

            }
//            for(int k = 0;k<arr.length;k++) {
//                System.out.println();
//                for(int j = 0;j<arr[0].length;j++) {
//                    System.out.print(arr[k][j] +" ");
//                }
//            }

        }

        return arr;


    }


}
