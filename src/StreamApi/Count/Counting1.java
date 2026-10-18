package StreamApi.Count;

import java.util.List;

public class Counting1 {
    public static void main(String [] args){
        List<Integer> list = List.of(1,2,3,2,1,5,4,7);
        long l = list.stream()
                .distinct()
                .count();
        System.out.println(l);
    }
}
