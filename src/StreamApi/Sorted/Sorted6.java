package StreamApi.Sorted;

import java.util.List;
//find lowest element among list
public class Sorted6 {
    public static void main(String [] args ){
        List<Integer>list = List.of(10,4,2,7,5,99,6,44,87,101,29);
        list.stream()
                .sorted()
                .limit(1)
                .forEach((t)->{
                    System.out.println(t);
                });
    }
}
