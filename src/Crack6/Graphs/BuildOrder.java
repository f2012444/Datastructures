package Crack6.Graphs;

import java.util.*;

public class BuildOrder {

    public List<Integer>  getOrder(int[][] matrix) {
        int size = matrix.length;
        int [] edges = new int[size];
        for(int i = 0;i<size;i++) {
            for(int j = 0;j<size;j++) {
                if(matrix[i][j] == 1) {
                    edges[i]+=1;
                }
            }
        }

        Set<Integer> set = new HashSet<>();
        List<Integer> out = new ArrayList<>();
        while(out.size() < size) {
            int count = 0;
            while(count < size) {
                if(edges[count] == 0 && !set.contains(count)) {

                    set.add(count);
                    out.add(count);
                    for(int i = 0;i<size;i++) {
                        if(matrix[i][count] == 1) {
                            matrix[i][count] = 0;
                            edges[i]-=1;
                        }
                    }
                    count = 0;
                    break;
                }
                count++;
            }

            if(count == size) {
                return new ArrayList<Integer>();
            }
        }

        return out;
    }
}

