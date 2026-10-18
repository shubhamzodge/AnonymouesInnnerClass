package StreamApi.Sorted;

import java.util.Comparator;
import java.util.List;

public class First1 {
    public static void main(String [] args){
        List <Integer> list = List.of(11,70,5,49,2,78,30);
        /*
        Comparator<Integer> comp = (i,j)->{
            return Integer.compare(j,i);
        };

         */
        list.stream()
               // .sorted(comp)
                .sorted((i,j)->{
                    return Integer.compare(j,i);
                })
                .forEach((i)->{
                    System.out.println(i);
                });
    }
}
