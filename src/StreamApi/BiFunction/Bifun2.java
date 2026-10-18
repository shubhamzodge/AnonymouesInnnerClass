package StreamApi.BiFunction;

import java.util.function.BiFunction;

public class Bifun2 {
    public static void main(String [] args){
        BiFunction<String,String,Integer> big=((i,j)->{
            return i.length()+j.length();
        });
        System.out.println(big.apply("Hello","World"));
    }
}
