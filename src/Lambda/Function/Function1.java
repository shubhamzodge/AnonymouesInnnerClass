package Lambda.Function;

import java.util.function.Function;

public class Function1 {
    public static void main(String [] args){
        Function<String,Integer> obj =(t)->{
           return  t.length();
        } ;
        System.out.println(obj.apply("Monti"));
    }
}
