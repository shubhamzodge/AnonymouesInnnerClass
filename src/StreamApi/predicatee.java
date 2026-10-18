package StreamApi;

import java.util.function.Predicate;

public class predicatee {
    public static void main(String [] args){
        Predicate<Integer> pred= (t)->{
            return t%2==0;
        };
        System.out.println(pred.test(123));
    }
}
