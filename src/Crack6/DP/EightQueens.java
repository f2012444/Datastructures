package Crack6.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EightQueens {
    boolean check(int maxrows) {
        boolean res = false;

        for(int i = 0;i<maxrows;i++) {
            res = res|| getPresence(new ArrayList<Integer>(), 0, i, maxrows);
            if(res) {
                return res;
            }
        }
        return false;
//        int[] arr = {5, 3, 6, 0, 7, 1, 4};
//        ArrayList<Integer> temp = new ArrayList<>();
//        temp.add(5);
//        temp.add(3);
//        temp.add(6);
//        temp.add(0);
//        temp.add(7);
//        temp.add(1);
//        temp.add(4);
//        res = getPresence(temp, 7, 2, 8);
//        return false;
    }
    boolean getPresence(ArrayList<Integer> columns, int row_number, int colnumber, int maxrows) {
        if(row_number == 7) {
            int sdfsf = 1;
        }
        if(row_number == maxrows) {
            for (int i:columns) {
                System.out.println(i);
            }
            return true;
        }
        for(int i = 0;i<columns.size();i++) {
            // col check
            if(colnumber == columns.get(i)) {
                return false;
            }

            //diagonal check
            int row_diff = Math.abs(row_number - i);
            int col_diff = Math.abs(columns.get(i) - colnumber);
            if(row_diff == col_diff) {
                return false;
            }
        }

        boolean result = false;
        columns.add(colnumber);
        for(int i = 0;i<maxrows;i++) {
            result = result || getPresence(columns, row_number+1, i, maxrows);
            if(result) {
                return true;
            }
        }
        columns.remove(columns.size()-1);

        return false;

    }
}
