package Book;

import Linkedin.ValidNumber;

import java.util.ArrayList;
import java.util.List;

public class TestValidIP {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2};
        List<Integer> arrlist = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++) {
            arrlist.add(arr[i]);
        }

        int [][] arr2d = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        Rotate90 r9 = new Rotate90();
        arr2d = r9.res(arr2d);
        for(int i = 0;i<arr2d.length;i++) {
            System.out.println();
            for (int j = 0;j<arr2d[0].length;j++) {
                System.out.print(" " + arr2d[i][j]);
            }
        }

    }
}
