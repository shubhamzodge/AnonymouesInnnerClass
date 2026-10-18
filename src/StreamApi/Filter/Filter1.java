package StreamApi.Filter;

import java.util.List;

public class Filter1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        list.stream()
                .filter((t)->{
                    return t%2==0;
                })
                .forEach((i)->{
                    System.out.println(i*2);
                });

    }
}