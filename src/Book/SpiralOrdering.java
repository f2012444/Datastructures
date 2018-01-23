package Book;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrdering {
    List<Integer> getSpiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<Integer>();
        if(arr.length == 0 || arr[0].length == 0) {
            return res;
        }
        int rows = arr.length;
        int cols = arr[0].length;
        int count = 0;
        int row_start = 0;
        int row_end = rows-1;
        int col_start = 0;
        int col_end = cols - 1;

        while(count < rows*cols) {
            for(int i = col_start;i<=col_end;i++) {
                res.add(arr[row_start][i]);
                count++;
            }
            row_start++;
            for(int i = row_start;i<=row_end;i++) {
                res.add(arr[i][col_end]);
                count++;
            }
            col_end--;
            for(int i = col_end;i>=col_start;i--) {
                res.add(arr[row_end][i]);
                count++;
            }
            row_end--;
            for(int i = row_end;i>=row_start;i--) {
                res.add(arr[i][col_start]);
                count++;
            }
            col_start++;

        }
        return res;
    }
}
