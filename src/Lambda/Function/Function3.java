package Lambda.Function;

import java.util.List;
import java.util.function.Function;
//using for each
public class Function3 {
    public static void main(String [] args){
        List<Integer>list = List.of(1,2,3,4,5,6);

        Function<Integer,Integer> fun= (t)->{
            return t*t;
        };
        for(Integer num:list){
            System.out.println(fun.apply(num));
        }
    }
}
