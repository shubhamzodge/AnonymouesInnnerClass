package StreamApi.BiFunction;

import java.util.function.BiFunction;

public class First11 {
    public static void main(String [] args){
        BiFunction<String,String ,Integer> fun = (s1,s2)->{
            return s1.length()+s2.length();
        };
        //System.out.println((fun.apply("abc","def"));
    }
}
