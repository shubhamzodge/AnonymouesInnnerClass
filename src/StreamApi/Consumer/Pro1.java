package StreamApi.Consumer;

import java.util.List;
import java.util.function.Function;

public class Pro1 {
    public static void main(String [] args){
        List<String>list = List.of("Montya","Shubham","vicky","John");
        Function <String,Integer> fun =(i)->i.length();
        /*
        for(String str:list){
            System.out.println(fun.apply(str));
        }

         */
       // Function<String>
    }
}
