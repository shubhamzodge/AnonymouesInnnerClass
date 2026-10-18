package StreamApi.Sorted;

import java.util.List;
//print second lowest

public class Descending {
    public static void main(String [] args){
        List<Integer>list = List.of(11,23,43,22,18,35);
        list.stream()
                .sorted()
                .limit(2)
                .skip(1)
                .forEach((i)-> System.out.println(i));
    }
}
