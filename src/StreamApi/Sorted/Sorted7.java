package StreamApi.Sorted;
//sorted in descending order
import java.util.Comparator;
import java.util.List;

public class Sorted7 {
    public static void main(String [] args) {
        List<Integer> list = List.of(9,7,5,2,11,66,4,3,90,1);
        list.stream()
                .sorted((i,j)->{
                    return Integer.compare(j,i);
                })
                .forEach((t)->{
                    System.out.println(t);
                });

    }
    }
