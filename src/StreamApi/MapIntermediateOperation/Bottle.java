package StreamApi.MapIntermediateOperation;

import java.util.List;

public class Bottle {
    public static void main(String [] args){
        List<Integer>list = List.of(1,2,3,4,56,44,5,6);
        list.stream()
                .map((t)->{
                    return t*t;
                })
               // .peek((t)-> System.out.println(t))
                .forEach((u)->{
                    System.out.println(u);
                });
    }
}
