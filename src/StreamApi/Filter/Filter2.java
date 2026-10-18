package StreamApi.Filter;

import java.util.List;

public class Filter2 {
    public static void main(String [] args){
        List<Integer>list = List.of(11,22,33,44,55,66);

        list.stream()
                .filter((t)->{
                    return t>25;
                })
                .forEach((i)->{
                    System.out.println(i);
                });
    }
}
