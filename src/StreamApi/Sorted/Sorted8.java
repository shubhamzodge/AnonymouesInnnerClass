package StreamApi.Sorted;
//finding of third highest
import java.util.List;

public class Sorted8 {
    public static void main(String [] args){
        List<Integer>list = List.of(9,7,5,2,11,66,4,3,90,1);

        list.stream()
                .sorted((i,j)->{
                    return Integer.compare(j,i);
                })
                .limit(3)
                .skip(2)
                .forEach((t)->{
                    System.out.println(t);
                });
    }
}
