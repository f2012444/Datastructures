package Book;

public class Rotate90 {
    int[][] res(int[][] arr) {
        if(arr.length == 0 || arr[0].length == 0) {
            return arr;
        }

        int rows = arr.length;
        int cols = arr[0].length;

        int count = 0;
        int row_start = 0;
        int row_end = rows-1;
        int col_start = 0;
        int col_end = cols-1;
        while(count < rows*rows && row_start <= row_end && col_start <= col_end) {
            for(int i = 0;i<(row_end-row_start);i++) {
                int cur = arr[row_start+i][col_end];
                arr[row_start+i][col_end] = arr[row_start][col_start+i];
                int temp = arr[row_end][col_end-i];
                arr[row_end][col_end-i] = cur;
                cur = arr[row_end-i][col_start];
                arr[row_end-i][col_start] = temp;
                arr[row_start][col_start+i] = cur;
                count+=4;
            }
            row_start++;
            row_end--;
            col_start++;
            col_end--;

        }
        return arr;

    }
}

