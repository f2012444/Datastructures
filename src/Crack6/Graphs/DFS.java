package Crack6.Graphs;

import java.util.*;

public class DFS {
    public boolean withAdjacencyList(List<ArrayList<Integer>> graph, int src, int dest) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        System.out.println("DFS with adjacency List");
        if(src >= graph.size() || dest >=graph.size()) {
            return false;
        }
        stack.add(src);
        set.add(src);

        while(!stack.isEmpty()) {
            int temp = stack.pop();
            System.out.println(temp);
            if(temp == dest) {
                return true;
            }
            ArrayList<Integer> kid = graph.get(temp);
            for(int i:kid) {
                if(!set.contains(i)) {
                    set.add(i);
                    stack.add(i);
                }
            }
        }
        return false;
    }

    public boolean withAdjacencyMatrix(int[][] graph, int src, int dest) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        System.out.println("DFS with adjacency Matrix");
        if(src >= graph.length || dest >= graph.length) {
            return false;
        }
        stack.add(src);
        set.add(src);
        while(!stack.isEmpty()) {

            int temp = stack.pop();
            System.out.println(temp);
            if(temp == dest) {
                return true;
            }
            for(int i = 0;i<graph[temp].length;i++) {
                int val = graph[temp][i];
                if(val != 0) {
                    if(!set.contains(i)) {
                        stack.add(i);
                        set.add(i);
                    }
                }
            }
        }
        return false;
    }
}
