package GraphSeries;
import java.util.*;

public class General {
    public static void main(String [] args){
        int v = 3;           //no. of vertexes
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();

        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
//        | i | graph after adding |
//
// 0 : [ [] ]
// 1 : [ [], [] ]
// 2 : [ [], [], [] ]

        //edge connection between node 0 & 1
        graph.get(0).add(1);
        graph.get(1).add(0);

        //edge connection between node 0 & 2
        graph.get(0).add(2);
        graph.get(2).add(0);

        for(int i=0;i<v;i++){
            System.out.println(i+ " -> "+graph.get(i));
        }
    }
}
