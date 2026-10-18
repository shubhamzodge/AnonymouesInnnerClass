package StreamApi.Sorted;
//sorted in ascending order;
import java.util.List;

public class Sorted5 {
    public static void main(String [] args){
        List<Integer>list = List.of(1,88,2,10,3,94,56,7,89,6);
        list.stream()
                .sorted()
                .forEach((t)->{
                    System.out.println(t);
                });

    }
}
