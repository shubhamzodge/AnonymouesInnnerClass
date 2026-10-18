package StreamApi.Distinct;

import java.util.List;

public class Distil {
    public static void main(String [] args){
        List<Integer> list = List.of(1,2,3,4,3,2,6,7,6,5,4,1);
        list.stream()
                .distinct()
                .forEach((t)->{
                    System.out.println(t);
                });
    }
}
