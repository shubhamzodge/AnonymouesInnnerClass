package GraphSeries;

import java.util.*;

public class Graph {

    // BFS Method
    public static void bfs(ArrayList<ArrayList<Integer>>graph,int start){

        boolean [] visited = new boolean[graph.size()];
        Queue<Integer>q= new LinkedList<>();

        //  Add starting node
        q.add(start);
        visited[start]=true;

        //traverse
        while(!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            //visit neighbours
            for (int neighbor : graph.get(node)) {
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
            }
        }
        public static void main(String [] args){
        int v =5;           //vertices
            ArrayList<ArrayList<Integer>>graph= new ArrayList<>();
            for(int i=0;i<v;i++){
                graph.add(new ArrayList<>());
            }
            graph.get(0).add(1);
            graph.get(1).add(0);

            graph.get(0).add(2);
            graph.get(2).add(0);

            graph.get(1).add(3);
            graph.get(3).add(1);

            graph.get(1).add(4);
            graph.get(4).add(1);

            System.out.print("BFS Traversal : ");
            bfs(graph,0);
        }



}