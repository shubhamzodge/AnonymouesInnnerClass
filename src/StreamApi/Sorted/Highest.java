package StreamApi.Sorted;
//Highest number
import java.util.List;

public class Highest {
    public static void main(String [] args){
        List<Integer> list = List.of(11,22,7,8,1,78,30,96,4,5);

        list.stream()
                .sorted((i,j)->{
                    return Integer.compare(j,i);
                })
                .limit(1)
                .forEach((i)->{
                    System.out.println(i);
                });
    }
}
