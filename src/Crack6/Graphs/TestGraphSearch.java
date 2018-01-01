package Crack6.Graphs;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestGraphSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int length = scanner.nextInt();
        int[][] graph = new int[length][length];
        List<ArrayList<Integer>> graph2 = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<length;i++) {
            graph2.add(new ArrayList<Integer>());
        }

        System.out.println("Enter the number of edges");
        int edges = scanner.nextInt();
        int count = 0;
        while(count < edges) {
            count++;
            System.out.println("enter the src and dest");
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            graph[dest][src] = 1;
        }
        BuildOrder bo = new BuildOrder();

        List<Integer> arr = bo.getOrder(graph);

        for(int i:arr) {
            System.out.println(i +" , ");
        }

//        while(count < edges) {
//            count++;
//            System.out.println("enter the src and dest");
//            int src = scanner.nextInt();
//            int dest = scanner.nextInt();
//            graph[src][dest] = 1;
//            ArrayList<Integer> temp = graph2.get(src);
//            temp.add(dest);
//            graph2.set(src, temp);
//        }
//        BFS bfs = new BFS();
//        DFS dfs = new DFS();
//        boolean result1 = bfs.withAdjacencyMatrix(graph, 1, 4);
//        boolean result2 = bfs.withAdjacencyList(graph2, 1, 4);
//        boolean result3 = dfs.withAdjacencyMatrix(graph, 1, 4);
//        boolean result4 = dfs.withAdjacencyList(graph2, 1, 4);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);


    }


}
//0 3
//        5 1
//        1 3
//        5 0
//        3 2