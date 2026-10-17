package Lambda.Function;

import java.util.function.Function;

//use of compose
public class Function5 {
    public static void main(String [] args){
        Function<String,Integer> fun =(t)->{
            return t.length();
        };
        Function<String ,Integer> fun2 =fun.compose((i)->{
            return String.valueOf(i.length());
        });
        System.out.println(fun.apply("motu"));
        System.out.println(fun2.apply("Hello"));
    }
}
