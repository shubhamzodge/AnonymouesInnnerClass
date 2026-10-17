package Lambda.Function;

import java.util.List;
import java.util.function.Function;

public class Function2 {
    public static void main(String [] args){
        List<String> list= List.of("shubham","adi","tom","Hari");
        Function<String,Integer>fun = (t)->{
            return t.length();
        };
        for(String str :list){
            System.out.println(fun.apply(str));
        }
    }
}
