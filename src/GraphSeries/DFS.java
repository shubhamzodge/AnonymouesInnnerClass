//package GraphSeries;
//import java.util.*;
//
//public class DFS {
//    public static void dfs(int start,List<Integer>[]graph){
//
//        boolean [] visited =new boolean[graph.length];
//
//        Stack<Integer>stack = new Stack<>();
//
//        stack.push(start);
//        while(!stack.isEmpty()){
//            int node = stack.pop();
//
//            //karan visited la apan true ahe he  sangitalach navta
//            if(!visited[node]){
//                visited[node] =true;
//                System.out.print(node +" ");
//
//                List<Integer>neighbor = graph[node];
//
//                for(int i= neighbor.size()-1;i>=0;i--){
//                    int neighbors = neighbor.get(i);
//                    if(!visited[neighbors]){
//                }
//            }
//        }
//
//    }
//}
