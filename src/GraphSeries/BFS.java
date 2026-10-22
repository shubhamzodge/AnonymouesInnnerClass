package GraphSeries;
import java.util.*;

public class BFS {
    public static void bfs(int start,List<List<Integer>>graph,int vertices){
        boolean [] visited = new boolean[vertices];

        Queue<Integer>queue = new ArrayDeque<>();

        // Mark start node visited
        visited[start] =true;
        queue.offer(start);

        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current+" ");

            // Visit all neighbors
            for(int neighbor:graph.get(current)){
                if(!visited[neighbor]){
                    visited[neighbor]= true;
                    queue.offer(neighbor);
                }
            }
        }

    }
    public static void main(String [] args){
        int vertices = 6;
        
        // Adjacency List
        List<List<Integer>>graph = new ArrayList<>();

        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(5);
    }

}
